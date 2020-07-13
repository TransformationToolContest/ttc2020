package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncer.SyncingStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage

class Task_1_M1_M2_M1 extends AbstractTask {
	val EMFSyncer syncer
	
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario1_v1'], model2)
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val person_v1 = instance as scenario1_v1.Person
		val person_v2 = syncer.forwardSync(person_v1) as scenario1_v2.Person
		person_v2.age = -1
		return person_v2;
	}
	
	override migrateBack(EObject instance) {
		val person_v2 = instance as scenario1_v2.Person
		return syncer.backSync(person_v2) as scenario1_v1.Person
	}
	
	override modify(EObject instance) {	}	
}

