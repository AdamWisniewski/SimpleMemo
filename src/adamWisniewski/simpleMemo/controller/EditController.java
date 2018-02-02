package adamWisniewski.simpleMemo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EditController {

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
    private TableView<?> tb_table;

    @FXML
    private TableColumn<?, ?> tc_1;

    @FXML
    private TableColumn<?, ?> tc_2;

    @FXML
    private TableColumn<?, ?> tc_3;

    @FXML
    private Label lb_word1;

    @FXML
    private TextField tf_word1;

    @FXML
    private Label lb_word2;

    @FXML
    private TextField tf_word2;

    @FXML
    private Label lb_comment;

    @FXML
    private TextArea ta_comment;

    @FXML
    private Button bt_save;

    @FXML
    private Button bt_clear;

    @FXML
    private Button bt_cancel;

    @FXML
    void addCurrentFlashcardToSet(MouseEvent event) {

    }

    @FXML
    void clearForm(MouseEvent event) {

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
    void goToSetList(MouseEvent event) {

    }

    @FXML
    void learnCurrentFlashcardSet(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) {

    }

}
