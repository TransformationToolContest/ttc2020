package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer.SyncingStrategy
import java.util.Calendar
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import scenario2_v1.Person
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncerMapping

class Task_2_M1_M2_M1 extends AbstractTask {
	val EMFSyncer syncer
	
	// custom mapping strategy: M1 <--> M2
	val public static mapping = new EMFSyncerMapping(
		'Person', 'age', /* <--> */ 'Person', 'ybirth',
		// source to target feature value transformation
		[  
			val person_v1 = it as scenario2_v1.Person
			Integer.valueOf(Calendar.getInstance().get(Calendar.YEAR) - person_v1.age) as Object
		],
		// target to source feature value transformation
		[  
			val person_v2 = it as scenario2_v2.Person
			Integer.valueOf(Calendar.getInstance().get(Calendar.YEAR) - person_v2.ybirth) as Object
		]
	)
		
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario2_v1'], model2, newArrayList(mapping))
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val person_v1 = instance as Person
		return syncer.forwardSync(person_v1) as scenario2_v2.Person
	}
	
	override migrateBack(EObject instance) {
		val person_v2 = instance as scenario2_v2.Person
		return syncer.backSync(person_v2) as Person
	}
	
	override modify(EObject instance) {
	}
	
}