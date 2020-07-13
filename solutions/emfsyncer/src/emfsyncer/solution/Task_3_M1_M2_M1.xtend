package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncer.SyncingStrategy
import emf_syncer.EMFSyncerMapping
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import scenario3_v2.Person

class Task_3_M1_M2_M1 extends AbstractTask {
	val EMFSyncer syncer
	
	// custom mapping strategy: M1 <--> M2
	val public static mapping = new EMFSyncerMapping(
		'Person', 'name', /* <--> */ 'Person', 'name',
		// source to target feature value transformation
		null,
		// target to source feature value transformation
		[  
			val person_v2 = it as scenario3_v2.Person
			person_v2.name ?: ""
		]
	)
	
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario3_v1'], model2, newArrayList(mapping))
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val person_v1 = instance as scenario3_v1.Person
		return syncer.forwardSync(person_v1) as Person
	}
	
	override migrateBack(EObject instance) {
		val person_v2 = instance as Person
		syncer.backSync(person_v2) as scenario3_v1.Person
	}
	
	override modify(EObject instance) {
		val person_v2 = instance as Person
		syncer.track[
			person_v2.name = null
		]
		return person_v2
	}
	
}