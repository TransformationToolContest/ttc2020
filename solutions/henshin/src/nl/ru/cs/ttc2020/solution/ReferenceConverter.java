package nl.ru.cs.ttc2020.solution;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Given a directory with Henshin files that contain relative references to
 * meta-models, replaces the relative references with NS references, and writes
 * the changed Henshin files to the same directory. This class must be run after
 * changes to the manually specified Henshin files, to keep the derived files in
 * sync.
 * 
 * @author danstru
 *
 */
public class ReferenceConverter {
	public static void main(String[] args) {

		File topfolder = new File("rules");
		File[] listOfFolders = topfolder.listFiles();

		for (File folder : listOfFolders) {
			if (!folder.isFile()) {
				File[] listOfFiles = folder.listFiles();
				for (File file : listOfFiles) {
					if (file.isFile() && file.getName().endsWith("henshin")
							&& !file.getName().endsWith("nsuri-refs.henshin")) {
						Path path = Paths.get(file.getPath());
						System.out.println(path);
						Charset charset = StandardCharsets.UTF_8;
						try {
							String content = new String(Files.readAllBytes(path), charset);
							content = fixRefs(content);
							String outputPath = path.toString().replaceAll(".henshin", "-nsuri-refs.henshin");
							Files.write(Paths.get(outputPath), content.getBytes(charset));

						} catch (IOException e) {
							e.printStackTrace();
						}

					}
				}

			}
		}

	}

	private static String fixRefs(String content) {
		for (int i = 1; i <= 4; i++) {
			content = content.replace("../../../de.hub.mse.ttc2020.benchmark/data/scenario" + i + "/models/V1.ecore",
					"http://ttc2020/model/1.0");

			content = content.replace("../../../de.hub.mse.ttc2020.benchmark/data/scenario" + i + "/models/V2.ecore",
					"http://ttc2020/model/2.0");

		}
		return content;
	}
}
