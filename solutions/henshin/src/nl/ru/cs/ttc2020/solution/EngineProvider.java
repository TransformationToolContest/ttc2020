package nl.ru.cs.ttc2020.solution;

import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;

/**
 * To avoid performance decay (probably related to crowing of maps and related thrashing), create fresh engine every second.
 * @author danstru
 *
 */
public class EngineProvider {
	
	private static Engine engine = new EngineImpl();
	private static long lastReset = java.lang.System.currentTimeMillis();

	public static Engine retrieveEngine() {
		long current = java.lang.System.currentTimeMillis();
		if (current - lastReset > 1000) {
			engine = new EngineImpl();
			lastReset = current;
		}
		return engine;
	}

	
}
