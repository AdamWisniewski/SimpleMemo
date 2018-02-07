package adamWisniewski.simpleMemo.util;

import java.io.IOException;

import adamWisniewski.simpleMemo.app.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class WindowInitializer {

	public void setStage(String viewName) throws IOException {

		Parent parent = FXMLLoader
				.load(getClass().getResource("/adamWisniewski/simpleMemo/view/" + viewName + ".fxml"));

		Scene scene = new Scene(parent);
		Main.getFirstStage().setScene(scene);
		Main.getFirstStage().setTitle("Simple Memo");
		Main.getFirstStage().setResizable(false);
		Main.getFirstStage().show();
	}

}
