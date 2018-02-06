package adamWisniewski.simpleMemo.util;

import java.io.File;
import java.io.FilenameFilter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositoryInitializer {

	private static final String repositoryPath = "C:/SuperMemo";

	public static void createRepoIfNotExist() {

		File path = new File(repositoryPath);
		if (!path.exists()) {
			path.mkdir();
		}

	}

	public static void createRepoIfNotExist(String userName) {

		File path = new File(repositoryPath + "/" + userName);
		if (!path.exists()) {
			path.mkdir();
		}

	}

	public static ObservableList<String> createListOfUsers() {

		File file = new File(repositoryPath);
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});

		return FXCollections.observableArrayList(directories);

	}

}
