package adamWisniewski.simpleMemo.app;

import adamWisniewski.simpleMemo.util.RepositoryInitializer;
import adamWisniewski.simpleMemo.util.WindowInitializer;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage firstStage;

	private void setFirstStage(Stage stage) {
		Main.firstStage = stage;
	}

	public static Stage getFirstStage() {
		return Main.firstStage;
	}

	@Override
	public void start(Stage firstStage) {
		try {

			RepositoryInitializer.createFolderIfNotExist();

			setFirstStage(firstStage);

			WindowInitializer wi = new WindowInitializer();
			wi.setStage("LoginView");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);

	}
}
