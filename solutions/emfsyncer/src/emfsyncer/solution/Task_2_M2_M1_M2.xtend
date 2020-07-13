package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer.SyncingStrategy
import java.util.Calendar
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import scenario2_v2.Person
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncerMapping

class Task_2_M2_M1_M2 extends AbstractTask {
	val EMFSyncer syncer
	
	// custom mapping strategy M2 <--> M1
	val public static mapping = new EMFSyncerMapping(
		'Person', 'ybirth', /* <--> */ 'Person', 'age',
		// source to target feature value transformation
		[  
			val person_v2 = it as scenario2_v2.Person
			Integer.valueOf(Calendar.getInstance().get(Calendar.YEAR) - person_v2.ybirth) as Object
		],
		// target to source feature value transformation
		[  
			val person_v1 = it as scenario2_v1.Person
			Integer.valueOf(Calendar.getInstance().get(Calendar.YEAR) - person_v1.age) as Object
		]
	)
	
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario2_v2'], model1, newArrayList(mapping))
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val person_v2 = instance as Person
		return syncer.forwardSync(person_v2) as scenario2_v1.Person
	}
	
	override migrateBack(EObject instance) {
		val person_v1 = instance as scenario2_v1.Person
		syncer.backSync(person_v1) as Person
	}
	
	override modify(EObject instance) {
	}
	
}