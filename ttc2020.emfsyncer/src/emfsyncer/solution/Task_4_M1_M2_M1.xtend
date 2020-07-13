package emfsyncer.solution

import de.hub.mse.ttc2020.benchmark.AbstractTask
import emf_syncer.EMFSyncer.SyncingStrategy
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import emf_syncer.EMFSyncer

class Task_4_M1_M2_M1 extends AbstractTask {
	val EMFSyncer syncer
	
	new (EPackage model1, EPackage model2) {
		super(model1, model2);
		syncer = new EMFSyncer(#['scenario4_v1'], model2, newArrayList(Task_2_M1_M2_M1.mapping))
		syncer.syncingStrategy = SyncingStrategy.EAGER
	}
	
	override migrate(EObject instance) {
		val container_v1 = instance as scenario4_v1.Container
		return syncer.forwardSync(container_v1) as scenario4_v2.Container
	}
	
	override migrateBack(EObject instance) {
		val container_v2 = instance as scenario4_v2.Container
		syncer.backSync(container_v2) as scenario4_v1.Container
	}
	
	override modify(EObject instance) {	}
	
}