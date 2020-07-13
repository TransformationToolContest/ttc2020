package emfsyncer.solution;

import org.eclipse.core.runtime.CoreException;
import org.junit.BeforeClass;

import de.hub.mse.ttc2020.benchmark.AllFunctionalTests;

public class AllJavaFunctionalTests extends AllFunctionalTests {

	@BeforeClass
	public static void init() throws CoreException {
		AllFunctionalTests.init();
		
		AllFunctionalTests.taskFactory = new JavaTaskFactory();
		
		AllFunctionalTests.pathScenario1 = "./data/scenario1/";
		AllFunctionalTests.pathScenario2 = "./data/scenario2/";
		AllFunctionalTests.pathScenario3 = "./data/scenario3/";
		AllFunctionalTests.pathScenario4 = "./data/scenario4/";
		AllFunctionalTests.scenario1_pk1 = scenario1_v1.Scenario1_v1Package.eINSTANCE;
		AllFunctionalTests.scenario1_pk2 = scenario1_v2.Scenario1_v2Package.eINSTANCE;
		AllFunctionalTests.scenario2_pk1 = scenario2_v1.Scenario2_v1Package.eINSTANCE;
		AllFunctionalTests.scenario2_pk2 = scenario2_v2.Scenario2_v2Package.eINSTANCE;
		AllFunctionalTests.scenario3_pk1 = scenario3_v1.Scenario3_v1Package.eINSTANCE;
		AllFunctionalTests.scenario3_pk2 = scenario3_v2.Scenario3_v2Package.eINSTANCE;
		AllFunctionalTests.scenario4_pk1 = scenario4_v1.Scenario4_v1Package.eINSTANCE;
		AllFunctionalTests.scenario4_pk2 = scenario4_v2.Scenario4_v2Package.eINSTANCE;
	}
}
