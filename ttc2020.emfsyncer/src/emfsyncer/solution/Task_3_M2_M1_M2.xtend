package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer.SyncingStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import emf_syncer.EMFSyncer

class Task_3_M2_M1_M2 extends AbstractTask {
	val EMFSyncer syncer
	
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario3_v2'], model1)
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val person_v2 = instance as scenario3_v2.Person
		return syncer.forwardSync(person_v2) as scenario3_v1.Person
	}
	
	override migrateBack(EObject instance) {
		val person_v1 = instance as scenario3_v1.Person
		syncer.backSync(person_v1) as scenario3_v2.Person
	}
	
	override modify(EObject instance) {
		val person_v1 = instance as scenario3_v1.Person
		syncer.track[
			person_v1.name = ""
		]
		person_v1
	}
	
}