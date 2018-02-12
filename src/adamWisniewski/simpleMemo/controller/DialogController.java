package adamWisniewski.simpleMemo.controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DialogController {

	public static void showDialogEmptySetToLearn() {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Gratulacje!");
		alert.setHeaderText("Wygl�da na to, �e znasz ju� wszystkie s��wka z tego zestawu!");
		alert.setContentText("Wr�� do listy zestaw�w i wybierz inny lub zresetuj ustawienia dla tego zestawu");

		alert.showAndWait();

	}

}
