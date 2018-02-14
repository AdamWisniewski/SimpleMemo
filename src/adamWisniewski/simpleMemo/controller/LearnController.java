package adamWisniewski.simpleMemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import adamWisniewski.simpleMemo.model.FlashCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LearnController {

	List<FlashCard> listUnderLearning = new ArrayList<FlashCard>();

	Boolean word2ToHint;

	FlashCard flashCardOnDisplay;

	String wordToDisplay;

	String wordToHint;

	@FXML
	private AnchorPane ap_loginView;

	@FXML
	private Label lb_wordToGuess;

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
	private TextField tf_wordToEnter;

	@FXML
	private Label lb_wordComment;

	@FXML
	private Button bt_confirm;

	@FXML
	private Button bt_decline;

	@FXML
	void confirmGuess(MouseEvent event) {

	}

	@FXML
	void createNewFlashcardSet(ActionEvent event) {

	}

	@FXML
	void declineGuess(MouseEvent event) {

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

	public void initialize() throws IOException {

		listUnderLearning = ListController.listToLearn;

		/*
		 * shows dialog to decide which word will be displayed - decision is set in
		 * boolean word2ToHint
		 */
		word2ToHint = DialogController.showDialogWordToLearn();

		// metoda to wyekstrachowania
		
		Random randomizer = new Random();

		flashCardOnDisplay = listUnderLearning.remove(randomizer.nextInt(listUnderLearning.size()));

		
		if (word2ToHint == true) {

			wordToDisplay = flashCardOnDisplay.getWord1();

			wordToHint = flashCardOnDisplay.getWord2();

		}

		else {
			wordToDisplay = flashCardOnDisplay.getWord2();

			wordToHint = flashCardOnDisplay.getWord1();
		}

		//
		// if (wyœwietlaWord1 = true) {
		// String labelka = word1;
		// String toHint = word2;
		// } else {
		// String labelka = word2;
		// String toHint = word1;
		// }
		//
		// widnowLabel = labelka (wyœwietlana od razu)
		// String windowComment = commment (narazie ukryty);
		// usuwa ze zbioru powy¿szy FlashCard

		// }

	}

}
