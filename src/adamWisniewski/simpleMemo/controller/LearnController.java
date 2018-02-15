package adamWisniewski.simpleMemo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adamWisniewski.simpleMemo.model.FlashCard;
import adamWisniewski.simpleMemo.util.LearningSystem;
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

	public static String wordToDisplay;

	public static String getWordToDisplay() {
		return wordToDisplay;
	}

	public static void setWordToDisplay(String wordToDisplay) {
		LearnController.wordToDisplay = wordToDisplay;
	}

	public static String getWordToGuess() {
		return wordToGuess;
	}

	public static void setWordToGuess(String wordToGuess) {
		LearnController.wordToGuess = wordToGuess;
	}

	public static String wordToGuess;

	LearningSystem ls = new LearningSystem();

	@FXML
	private AnchorPane ap_loginView;

	@FXML
	private Label lb_wordToDisplay;

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
	private Label lb_goodAndswer;

	@FXML
	private Label lb_wrongAndswer;

	@FXML
	private Label lb_wordToGuess;

	@FXML
	private Label lb_wordComment;

	@FXML
	private Button bt_confirm;

	@FXML
	private Button bt_check;

	@FXML
	private Button bt_decline;

	@FXML
	private Label lb_checkShortCutInformation;

	@FXML
	private Label lb_goToNextShortCutInformation;

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

		// shows dialog to decide which word will be displayed - decision is set
		// in boolean word2ToHint
		word2ToHint = DialogController.showDialogWordToLearn();

		flashCardOnDisplay = ls.getFlashCardToLearn(listUnderLearning);

		setFlashCardWordsOnWindow(flashCardOnDisplay, word2ToHint);

	}

	public void setFlashCardWordsOnWindow(FlashCard flashCardOnDisplay, Boolean word2ToHint) {
		if (word2ToHint == true) {

			LearnController.setWordToDisplay(flashCardOnDisplay.getWord1());

			LearnController.setWordToGuess(flashCardOnDisplay.getWord2());

		} else {
			LearnController.setWordToDisplay(flashCardOnDisplay.getWord2());

			LearnController.setWordToGuess(flashCardOnDisplay.getWord1());
		}

		lb_wordToDisplay.setText(getWordToDisplay());

		lb_wordToGuess.setText(getWordToGuess());

		lb_wordComment.setText(flashCardOnDisplay.getComment());

	}

}
