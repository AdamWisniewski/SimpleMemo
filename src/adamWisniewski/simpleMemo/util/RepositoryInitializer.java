package adamWisniewski.simpleMemo.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RepositoryInitializer {

	private final static String repositoryPath = "C:/SuperMemo";

	private final static String fileName = "usersList.csv";

	public static void createRepoIfNotExist() {

		File path = new File(repositoryPath);
		if (!path.exists()) {
			path.mkdir();
		}

		File file = new File(repositoryPath + "/" + fileName);
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
