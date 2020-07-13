package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncer.SyncingStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import scenario1_v2.Person

class Task_1_M2_M1_M2 extends AbstractTask {
	val EMFSyncer syncer
	
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario1_v2'], model1)
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val person_v2 = instance as Person
		return syncer.forwardSync(person_v2) as scenario1_v1.Person
	}
	
	override migrateBack(EObject instance) {
		val person_v1 = instance as scenario1_v1.Person
		return syncer.backSync(person_v1) as Person
	}
	
	override modify(EObject instance) {
		
	}
}