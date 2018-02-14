package adamWisniewski.simpleMemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adamWisniewski.simpleMemo.csv.CSVgetter;
import adamWisniewski.simpleMemo.model.FlashCard;
import adamWisniewski.simpleMemo.util.RepositoryInitializer;
import adamWisniewski.simpleMemo.util.WindowInitializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ListController {

	private static String flashCardListName;

	public static String getFlashCardListName() {
		return flashCardListName;
	}

	public static void setFlashCardListName(String flashCardListName) {
		ListController.flashCardListName = flashCardListName;
	}
	
//	very important list - to modify after learning and rewrite in original file
	public static List<FlashCard> originalListFromCSVFile = new ArrayList<FlashCard>();

	public static List<FlashCard> listToLearn = new ArrayList<FlashCard>();

	@FXML
	private AnchorPane ap_listView;

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
	private Label lb_title;

	@FXML
	private ListView<String> lv_listOfSets;

	@FXML
	private Button bt_goToLearn;

	@FXML
	private Button bt_goToEdit;

	@FXML
	private Button bt_resetSet;

	@FXML
	private Button bt_addNewSet;

	@FXML
	void addNewSet(MouseEvent event) {

	}

	@FXML
	void createNewFlashcardSet(ActionEvent event) {

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
	void goToEdit(MouseEvent event) {

	}

	@FXML
	void goToLearn(MouseEvent event) throws IOException {

		flashCardListName = lv_listOfSets.getSelectionModel().getSelectedItem();
		
		originalListFromCSVFile = CSVgetter.readCSVtoList();

		listToLearn = CSVgetter.makeListToLearn(originalListFromCSVFile);

		if (listToLearn.isEmpty()) {

			DialogController.showDialogEmptyListToLearn();

		} else {

			WindowInitializer wi = new WindowInitializer();
			wi.setStage("LearnView");

		}

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
	void resetSet(MouseEvent event) {

	}

	@FXML
	void selectedSet(MouseEvent event) {

		bt_goToLearn.setDisable(false);
		bt_goToEdit.setDisable(false);
		bt_resetSet.setDisable(false);

	}

	public void initialize() {

		lv_listOfSets.setItems(RepositoryInitializer.createListOfContent(LoginController.getUserName()));

	}

}
