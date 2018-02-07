package adamWisniewski.simpleMemo.util;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositoryInitializer {

	private static final String repositoryPath = "C:/SuperMemo";

	public static void createFolderIfNotExist() {

		File path = new File(repositoryPath);
		checkIfExist(path);

	}

	public static void createFolderIfNotExist(String userName) {

		File path = new File(repositoryPath + "/" + userName);
		checkIfExist(path);

	}

	private static void checkIfExist(File path) {
		if (!path.exists()) {
			path.mkdir();
		}
	}

	public static ObservableList<String> createListOfContent() {

		File file = new File(repositoryPath);
		String[] directories = file.list();

		return FXCollections.observableArrayList(directories);

	}

	public static ObservableList<String> createListOfContent(String userName) {

		File file = new File(repositoryPath + "/" + userName);
		String[] directories = file.list();

		return FXCollections.observableArrayList(directories);

	}

}
