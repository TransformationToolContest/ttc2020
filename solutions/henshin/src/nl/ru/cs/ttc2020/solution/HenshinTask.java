package nl.ru.cs.ttc2020.solution;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;

import de.hub.mse.ttc2020.benchmark.AbstractTask;

public class HenshinTask extends AbstractTask {
	Engine engine;
	EGraph eGraph;
	ResourceSet rs;
	String rulePath;

	Unit migrateUnit;
	Unit migrateBackUnit;
	Direction direction;

	boolean traceRequired;
	EObject trace;

	public HenshinTask(EPackage model1, EPackage model2, String taskId, Engine engine) {
		super(model1, model2);

		rulePath = "rules/" + taskId + "/rules-nsuri-refs.henshin";

		if (taskId.contains("M1_M2_M1"))
			direction = Direction.M1_M2_M1;
		else
			direction = Direction.M2_M1_M2;

		URI uri = URI.createURI(rulePath);
		rs = model1.eResource().getResourceSet();
		rs.getPackageRegistry().put(HenshinPackage.eNS_URI, HenshinPackage.eINSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("henshin", new XMIResourceFactoryImpl());
		Resource res = rs.getResource(uri, true);
		migrateUnit = ((Module) res.getContents().get(0)).getUnit("migrate");
		migrateBackUnit = ((Module) res.getContents().get(0)).getUnit("migrateBack");

		eGraph = new EGraphImpl();
	}

	@Override
	public EObject migrate(EObject instance) { 
		engine = EngineProvider.retrieveEngine();
		String inParameter = (direction == Direction.M1_M2_M1) ? "instance1" : "instance2";
		String outParameter = (direction == Direction.M1_M2_M1) ? "instance2" : "instance1";

		eGraph.addTree(instance);
		UnitApplication application = new UnitApplicationImpl(engine, eGraph, migrateUnit, null);

		application.setParameterValue(inParameter, instance);

		application.execute(null);
		
		EObject result = (EObject) application.getResultParameterValue(outParameter);

		trace = instance;
		return result;
	}

	@Override
	public EObject migrateBack(EObject instance) {
		String inParameter = (direction == Direction.M1_M2_M1) ? "instance2" : "instance1";
		String outParameter = (direction == Direction.M1_M2_M1) ? "instance1" : "instance2";
		
		eGraph.addTree(instance);
		UnitApplication application = new UnitApplicationImpl(engine, eGraph, migrateBackUnit, null);
		application.setParameterValue(inParameter, instance);

		if (migrateBackUnit.getParameter("trace") != null) {
			application.setParameterValue("trace", trace);
		}

//		ApplicationMonitor a = new LoggingApplicationMonitor();
		application.execute(null);
		EObject result = (EObject) application.getResultParameterValue(outParameter);

		return result;
	}

	enum Direction {
		M1_M2_M1, M2_M1_M2
	}

	@Override
	public EObject modify(EObject instance) {
		// TODO Auto-generated method stub
		return null;
	}

}
