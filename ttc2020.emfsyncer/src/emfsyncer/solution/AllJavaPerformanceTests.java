package emfsyncer.solution;

import org.eclipse.core.runtime.CoreException;
import org.junit.BeforeClass;

import de.hub.mse.ttc2020.benchmark.AllFunctionalTests;
import de.hub.mse.ttc2020.benchmark.PerformanceTests;

public class AllJavaPerformanceTests extends PerformanceTests {

	@BeforeClass
	public static void init() throws CoreException {
		AllFunctionalTests.init();
		
		AllFunctionalTests.taskFactory = new JavaTaskFactory();
		
		AllFunctionalTests.pathScenario1 = "/Users/ab373/Documents/ArturData/WORK/ECLIPSE/RESEARCH/2018_research_yamtl/ttc2020.emfsyncer/data/scenario1/";
		AllFunctionalTests.pathScenario2 = "/Users/ab373/Documents/ArturData/WORK/ECLIPSE/RESEARCH/2018_research_yamtl/ttc2020.emfsyncer/data/scenario2/";
		AllFunctionalTests.pathScenario3 = "/Users/ab373/Documents/ArturData/WORK/ECLIPSE/RESEARCH/2018_research_yamtl/ttc2020.emfsyncer/data/scenario3/";
		AllFunctionalTests.pathScenario4 = "/Users/ab373/Documents/ArturData/WORK/ECLIPSE/RESEARCH/2018_research_yamtl/ttc2020.emfsyncer/data/scenario4/";
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
