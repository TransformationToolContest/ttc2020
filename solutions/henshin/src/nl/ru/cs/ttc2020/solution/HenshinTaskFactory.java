package nl.ru.cs.ttc2020.solution;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;

import de.hub.mse.ttc2020.benchmark.AbstractTask;
import de.hub.mse.ttc2020.benchmark.AbstractTaskFactory;
import de.hub.mse.ttc2020.benchmark.TaskInfo;

public class HenshinTaskFactory extends AbstractTaskFactory {
	public HenshinTaskFactory() {
		super();
	}
	
	@Override
	public AbstractTask createTask(TaskInfo info, EPackage model1, EPackage model2) {
		Engine engine = new EngineImpl();
		
		switch (info) {
		case TASK_1_M1_M2_M1:
			return new HenshinTask(model1, model2, "TASK_1_M1_M2_M1", engine);
		case TASK_1_M2_M1_M2:
			return new HenshinTask(model1, model2, "TASK_1_M2_M1_M2", engine);
		case TASK_2_M1_M2_M1:
			return new HenshinTask(model1, model2, "TASK_2_M1_M2_M1", engine);
		case TASK_2_M2_M1_M2:
			return new HenshinTask(model1, model2, "TASK_2_M2_M1_M2", engine);
		case TASK_3_M1_M2_M1:
			return new HenshinTask(model1, model2, "TASK_3_M1_M2_M1", engine);
		case TASK_3_M2_M1_M2:
			return new HenshinTask(model1, model2, "TASK_3_M2_M1_M2", engine);
		case TASK_4_M1_M2_M1:
			return new HenshinTask(model1, model2, "TASK_4_M1_M2_M1", engine);
		case TASK_4_M2_M1_M2:
			return new HenshinTask(model1, model2, "TASK_4_M2_M1_M2", engine);	
		default:
			System.out.println("Task not found");
			return null;
		}
	}

}
