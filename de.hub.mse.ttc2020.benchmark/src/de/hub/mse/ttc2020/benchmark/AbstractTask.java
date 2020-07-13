package de.hub.mse.ttc2020.benchmark;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class AbstractTask {

	private EPackage model1;
	private EPackage model2;

	public AbstractTask(EPackage model1, EPackage model2) {
		this.model1 = model1;
		this.model2 = model2;
	}

	protected EPackage getModel1() {
		return model1;
	}

	protected EPackage getModel2() {
		return model2;
	}

	public EObject modify(EObject instance) {
		// do nothing - needed by EMFSyncer solution
		return null;
	}

	public abstract EObject migrate(EObject instance);

	public abstract EObject migrateBack(EObject instance);

	public EObject getInstance(ResourceSet resSet, String path) throws IOException {
		Resource resource = resSet.getResource(URI.createURI(path), true);
		resource.load(Collections.EMPTY_MAP);
		return resource.getContents().get(0);
	}
}
