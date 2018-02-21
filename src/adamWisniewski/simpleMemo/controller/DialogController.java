package adamWisniewski.simpleMemo.controller;

import java.util.Optional;

import adamWisniewski.simpleMemo.model.FlashCard;
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

	public static Boolean showDialogWordToLearn(FlashCard csvHeader) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Wybierz tryb nauki");
		alert.setHeaderText("Wybierz tryb nauki");

		ButtonType buttonTypeOne = new ButtonType("ucz siê '" + csvHeader.getWord1() + "' zgaduj '" + csvHeader.getWord2() + "'");
		ButtonType buttonTypeTwo = new ButtonType("ucz siê '" + csvHeader.getWord2() + "' zgaduj '" + csvHeader.getWord1() + "'");

		alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == buttonTypeOne) {
			return true;
		} else {
			return false;
		}

	}
	
	public static void showDialogWhenLearningLoopEnds() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Simple Memo");
		alert.setHeaderText("Koniec stosu fiszek");
		alert.setContentText("Nauczone s³ówka odk³adamy na bok. Rozpoczynamy kolejn¹ seriê!");

		alert.showAndWait();
	}

}
