package adamWisniewski.simpleMemo.controller;

import java.util.Map;
import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class DialogController {

	public static void showDialogWhenListIsEmpty() {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Gratulacje!");
		alert.setHeaderText("Wygl¹da na to, ¿e znasz ju¿ wszystkie s³ówka z tego zestawu!");
		alert.setContentText("Wróæ do listy zestawów i wybierz inny lub zresetuj ustawienia dla tego zestawu");

		alert.showAndWait();

	}

	public static Boolean showDialogWordToLearn(Map <String, Integer> csvHeader) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Wybierz tryb nauki");
		alert.setHeaderText("Wybierz tryb nauki");

		
		// ogarn¹æ temat!
		ButtonType buttonTypeOne = new ButtonType("ucz siê " + csvHeader.entrySet().stream().findFirst() + "zgaduj word2");
		ButtonType buttonTypeTwo = new ButtonType("ucz siê word2 zgaduj word1");

		alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == buttonTypeOne) {
			return true;
			// labelka = word1
			// toHint = word2
		} else {
			return false;
			// labelka = word2
			// toHint = word1
		}

	}

}
