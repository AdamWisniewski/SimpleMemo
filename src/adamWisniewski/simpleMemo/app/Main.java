package adamWisniewski.simpleMemo.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage loginStage;

	private void setLoginStage(Stage stage) {
		Main.loginStage = stage;
	}

	public static Stage getLoginStage() {
		return Main.loginStage;
	}

	@Override
	public void start(Stage loginStage) {
		try {
			setLoginStage(loginStage);

			Parent parent = FXMLLoader.load(getClass().getResource("/adamWisniewski/simpleMemo/view/LoginView.fxml"));
			Scene scene = new Scene(parent);
			loginStage.setScene(scene);
			loginStage.setTitle("Simple Memo");
			loginStage.setResizable(false);
			loginStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
