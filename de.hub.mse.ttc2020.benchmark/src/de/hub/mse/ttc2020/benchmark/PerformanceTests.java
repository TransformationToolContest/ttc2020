package de.hub.mse.ttc2020.benchmark;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

public class PerformanceTests extends AbstractBenchmarkTests {
	/** interval at which we measure the passed time since the beginning. */
	private static final int MEASURMENT_INTERVAL = 10_000;
	/** number of non-measured warm-up iterations */
	private static final int WARM_UP_ITERATIONS = 100;

	@Test
	public void testPerformance() throws IOException {
		// TASK 1
		EPackage task1_model1 = getModel(pathScenario1 + "models/V1.ecore", resSet1);
		if (AllFunctionalTests.scenario1_pk1 != null) { 
			task1_model1 = AllFunctionalTests.scenario1_pk1;
			resSet1.getPackageRegistry().put(task1_model1.getNsURI(), task1_model1);
		}
		EPackage task1_model2 = getModel(pathScenario1 + "models/V2.ecore", resSet1);
		if (AllFunctionalTests.scenario1_pk2 != null) { 
			task1_model2 = AllFunctionalTests.scenario1_pk2;
			resSet1.getPackageRegistry().put(task1_model2.getNsURI(), task1_model2);
		}
		EObject task1_inputV1a = getInstance(pathScenario1 + "instances/input/V1a.xmi", resSet1);
		EObject task1_inputV1b = getInstance(pathScenario1 + "instances/input/V1b.xmi", resSet1);
		EObject task1_inputV2a = getInstance(pathScenario1 + "instances/input/V2a.xmi", resSet1);
		EObject task1_inputV2b = getInstance(pathScenario1 + "instances/input/V2b.xmi", resSet1);

		AbstractTask task1_1_2_1 = taskFactory.createTask(TaskInfo.TASK_1_M1_M2_M1, task1_model1, task1_model2);
		AbstractTask task1_2_1_2 = taskFactory.createTask(TaskInfo.TASK_1_M2_M1_M2, task1_model1, task1_model2);

		// TASK 2
		EPackage task2_model1 = getModel(pathScenario2 + "models/V1.ecore", resSet2);
		if (AllFunctionalTests.scenario2_pk1 != null) { 
			task2_model1 = AllFunctionalTests.scenario2_pk1;
			resSet2.getPackageRegistry().put(task2_model1.getNsURI(), task2_model1);
		}
		EPackage task2_model2 = getModel(pathScenario2 + "models/V2.ecore", resSet2);
		if (AllFunctionalTests.scenario2_pk2 != null) { 
			task2_model2 = AllFunctionalTests.scenario2_pk2;
			resSet2.getPackageRegistry().put(task2_model2.getNsURI(), task2_model2);
		}
		EObject task2_inputV1a = getInstance(pathScenario2 + "instances/input/V1a.xmi", resSet2);
		EObject task2_inputV1b = getInstance(pathScenario2 + "instances/input/V1b.xmi", resSet2);
		EObject task2_inputV2a = getInstance(pathScenario2 + "instances/input/V2a.xmi", resSet2);
		EObject task2_inputV2b = getInstance(pathScenario2 + "instances/input/V2b.xmi", resSet2);

		AbstractTask task2_1_2_1 = taskFactory.createTask(TaskInfo.TASK_2_M1_M2_M1, task2_model1, task2_model2);
		AbstractTask task2_2_1_2 = taskFactory.createTask(TaskInfo.TASK_2_M2_M1_M2, task2_model1, task2_model2);

		// TASK 3
		EPackage task3_model1 = getModel(pathScenario3 + "models/V1.ecore", resSet3);
		if (AllFunctionalTests.scenario3_pk1 != null) { 
			task3_model1 = AllFunctionalTests.scenario3_pk1;
			resSet3.getPackageRegistry().put(task3_model1.getNsURI(), task3_model1);
		}
		EPackage task3_model2 = getModel(pathScenario3 + "models/V2.ecore", resSet3);
		if (AllFunctionalTests.scenario3_pk2 != null) { 
			task3_model2 = AllFunctionalTests.scenario3_pk2;
			resSet3.getPackageRegistry().put(task3_model2.getNsURI(), task3_model2);
		}
		EObject task3_inputV1a = getInstance(pathScenario3 + "instances/input/V1a.xmi", resSet3);
		EObject task3_inputV1b = getInstance(pathScenario3 + "instances/input/V1b.xmi", resSet3);
		EObject task3_inputV2a = getInstance(pathScenario3 + "instances/input/V2a.xmi", resSet3);
		EObject task3_inputV2b = getInstance(pathScenario3 + "instances/input/V2b.xmi", resSet3);

		AbstractTask task3_1_2_1 = taskFactory.createTask(TaskInfo.TASK_3_M1_M2_M1, task3_model1, task3_model2);
		AbstractTask task3_2_1_2 = taskFactory.createTask(TaskInfo.TASK_3_M2_M1_M2, task3_model1, task3_model2);

		// TASK 4
		EPackage task4_model1 = getModel(pathScenario4 + "models/V1.ecore", resSet4);
		if (AllFunctionalTests.scenario4_pk1 != null) { 
			task4_model1 = AllFunctionalTests.scenario4_pk1;
			resSet4.getPackageRegistry().put(task4_model1.getNsURI(), task4_model1);
		}
		EPackage task4_model2 = getModel(pathScenario4 + "models/V2.ecore", resSet4);
		if (AllFunctionalTests.scenario4_pk2 != null) { 
			task4_model2 = AllFunctionalTests.scenario4_pk2;
			resSet4.getPackageRegistry().put(task4_model2.getNsURI(), task4_model2);
		}
		EObject task4_inputV1a = getInstance(pathScenario4 + "instances/input/V1a.xmi", resSet4);
		EObject task4_inputV1b = getInstance(pathScenario4 + "instances/input/V1b.xmi", resSet4);
		EObject task4_inputV2a = getInstance(pathScenario4 + "instances/input/V2a.xmi", resSet4);
		EObject task4_inputV2b = getInstance(pathScenario4 + "instances/input/V2b.xmi", resSet4);

		AbstractTask task4_1_2_1 = taskFactory.createTask(TaskInfo.TASK_4_M1_M2_M1, task4_model1, task4_model2);
		AbstractTask task4_2_1_2 = taskFactory.createTask(TaskInfo.TASK_4_M2_M1_M2, task4_model1, task4_model2);

		// start time, will be set after warm up
		long startTime = 0;
		Map<Integer, Long> measurements = new HashMap<Integer, Long>();
		
		for (int i = 0; i < getTotalIterations() + WARM_UP_ITERATIONS; i++) {
			if (i == WARM_UP_ITERATIONS) {
				startTime = System.nanoTime();
			}
			
			if ((i - WARM_UP_ITERATIONS) % MEASURMENT_INTERVAL == 0 && i > WARM_UP_ITERATIONS) {
				measurements.put(i - WARM_UP_ITERATIONS, System.nanoTime() - startTime);
				System.out.println("Iteration " + (i - WARM_UP_ITERATIONS));
			}
			
			// TASK 1
			{
				EObject migratedA = task1_1_2_1.migrate(task1_inputV1a);
				task1_1_2_1.migrateBack(migratedA);
				EObject migratedB = task1_1_2_1.migrate(task1_inputV1b);
				task1_1_2_1.migrateBack(migratedB);
			}
			{
				EObject migratedA = task1_2_1_2.migrate(task1_inputV2a);
				task1_2_1_2.migrateBack(migratedA);
				EObject migratedB = task1_2_1_2.migrate(task1_inputV2b);
				task1_2_1_2.migrateBack(migratedB);
			}

			// TASK 2
			{
				EObject migratedA = task2_1_2_1.migrate(task2_inputV1a);
				task2_1_2_1.migrateBack(migratedA);
				EObject migratedB = task2_1_2_1.migrate(task2_inputV1b);
				task2_1_2_1.migrateBack(migratedB);
			}
			{
				EObject migratedA = task2_2_1_2.migrate(task2_inputV2a);
				task2_2_1_2.migrateBack(migratedA);
				EObject migratedB = task2_2_1_2.migrate(task2_inputV2b);
				task2_2_1_2.migrateBack(migratedB);
			}

			// TASK 3
			{
				EObject migratedA = task3_1_2_1.migrate(task3_inputV1a);
				task3_1_2_1.migrateBack(migratedA);
				EObject migratedB = task3_1_2_1.migrate(task3_inputV1b);
				task3_1_2_1.migrateBack(migratedB);
			}
			{
				EObject migratedA = task3_2_1_2.migrate(task3_inputV2a);
				task3_2_1_2.migrateBack(migratedA);
				EObject migratedB = task3_2_1_2.migrate(task3_inputV2b);
				task3_2_1_2.migrateBack(migratedB);
			}

			// TASK 4
			{
				EObject migratedA = task4_1_2_1.migrate(task4_inputV1a);
				task4_1_2_1.migrateBack(migratedA);
				EObject migratedB = task4_1_2_1.migrate(task4_inputV1b);
				task4_1_2_1.migrateBack(migratedB);
			}
			{
				EObject migratedA = task4_2_1_2.migrate(task4_inputV2a);
				task4_2_1_2.migrateBack(migratedA);
				EObject migratedB = task4_2_1_2.migrate(task4_inputV2b);
				task4_2_1_2.migrateBack(migratedB);
			}
		}

		try (PrintWriter writer = new PrintWriter("results.csv", "UTF-8")) {
			writer.println("repetitions;time(ns)");
			writer.print((measurements.entrySet().stream()
				.sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
				.map(e -> e.getKey() + ";" + e.getValue())
				.collect(Collectors.joining("\n"))));
		}
		
		
	}

	public int getTotalIterations() {
		/** total number of repetitions */
		return 2_000_000;
	}
}
