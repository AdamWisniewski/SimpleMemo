package adamWisniewski.simpleMemo.app;

import adamWisniewski.simpleMemo.util.RepositoryInitializer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
			setFirstStage(firstStage);

			Parent parent = FXMLLoader.load(getClass().getResource("/adamWisniewski/simpleMemo/view/LoginView.fxml"));
			Scene scene = new Scene(parent);

			firstStage.setScene(scene);
			firstStage.setTitle("Simple Memo");
			firstStage.setResizable(false);
			firstStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
		RepositoryInitializer.createRepoIfNotExist();
	}
}
