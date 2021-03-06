package adamWisniewski.simpleMemo.controller;

import java.io.IOException;

import adamWisniewski.simpleMemo.util.RepositoryInitializer;
import adamWisniewski.simpleMemo.util.WindowInitializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController {

	private static String userName;

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		LoginController.userName = userName;
	}

	@FXML
	private AnchorPane ap_loginView;

	@FXML
	private Label lb_user;

	@FXML
	private MenuBar mb_loginView;

	@FXML
	private Menu m_program;

	@FXML
	private MenuItem mi_newFlashcardSet;

	@FXML
	private MenuItem mi_editCurrentFlashcardSet;

	@FXML
	private MenuItem mi_editCurrentFlashcard;

	@FXML
	private MenuItem mi_learnCurrentFlashcardSet;

	@FXML
	private MenuItem mi_goToSetList;

	@FXML
	private MenuItem mi_logOut;

	@FXML
	private MenuItem mi_exitProgram;

	@FXML
	private Menu m_info;

	@FXML
	private MenuItem mi_programInfo;

	@FXML
	private MenuItem mi_authorInfo;

	@FXML
	private MenuItem mi_help;

	@FXML
	private ComboBox<String> cb_user;

	@FXML
	private Label lb_title;

	@FXML
	private Button bt_login;

	@FXML
	private Label lb_createNewUser;

	@FXML
	void createNewFlashcardSet(ActionEvent event) {

	}

	@FXML
	void createNewUser(MouseEvent event) {

	}

	@FXML
	void displayHelp(ActionEvent event) {

	}

	@FXML
	void displayProgramInfo(ActionEvent event) {

	}

	@FXML
	void editCurrentFlashcard(ActionEvent event) {

	}

	@FXML
	void editCurrentFlashcardSet(ActionEvent event) {

	}

	@FXML
	void exitProgram(ActionEvent event) {

	}

	@FXML
	void goToSetList(ActionEvent event) {

	}

	@FXML
	void learnCurrentFlashcardSet(ActionEvent event) {

	}

	@FXML
	void logOut(ActionEvent event) {

	}

	@FXML
	void selectedUser(ActionEvent event) {
		bt_login.setDisable(false);

	}

	@FXML
	void logToApplication(MouseEvent event) throws IOException {

		setUserName(cb_user.getValue());

		WindowInitializer wi = new WindowInitializer();
		wi.setStage("ListView");

	}

	public void initialize() {

		cb_user.setItems(RepositoryInitializer.createListOfContent());

	}

}
