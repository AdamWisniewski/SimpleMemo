package adamWisniewski.simpleMemo.util;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import adamWisniewski.simpleMemo.controller.DialogController;
import adamWisniewski.simpleMemo.model.FlashCard;

public class LearningSystem {

	public FlashCard getFlashCardToLearn(List<FlashCard> listUnderLearning) throws IOException {

		Random randomizer = new Random();

		return listUnderLearning.remove(randomizer.nextInt(listUnderLearning.size()));

	}

	public void checkListToLearnIsEmpty(List<FlashCard> listUnderLearning) throws IOException {
		if (listUnderLearning.isEmpty()) {

			// zapisac originalListFromCSVFile do pliku

			// tu bedzie cala metoda z kopiowaniem pliku, zapisywaniem tresci do starego i w
			// catch ewentualnie kasowanie oryginalu
			// i zmiana nazwy z kopii na orygina� i wyswietlenie okienka ze zapis sie nie
			// udal i jest wersja slowek sprzed nauki

			DialogController.showDialogEmptyListToLearn();

			WindowInitializer wi = new WindowInitializer();
			wi.setStage("ListView");

		}
	}

}

// wrzuci� metod� do learncontroller bo pola okna s� przecie� prywatne!!
// // ----------- metoda sprawdzania poprawnych odpowiedzi uruchamiana po
// // naci�niciu sprawdzam lub enter (enter chyba dac jako akcja on presed na
// // anchorpane)
//
// if(lb_wordToGuess wy�wietlone)
// {
//
// ukryj lb_goodAndswer;
//
// ukryj lb_wordToGuess;
//
// ukryj lb_wordComment;
//
// wyswietl lb_checkShortCutInformation;
//
// ukryj lb_goToNextShortCutInformation;
//
// // wywolaj metode do wyekstrachowania
//
// }else
// {
//
//
//
//
//
//
// if (tf_wordToEnter = wordToGuess) {
//
// // ---- zamkn�c w metode - gdy poprawna odpowied�
//
// wy�wietl lb_goodAndswer;
//
// // --- zamkn�c w podmetode
//
// wy�wietl lb_wordToGuess;
//
// wy�wietl lb_wordComment;
//
// ukryj lb_checkShortCutInformation;
//
// wy�wietl lb_goToNextShortCutInformation;
//
// //------------------------
//
// //-----------------------
// // --- metoda nadpisywania Knowlege w pierwotnej li�cie iportowanej z CSV
//
// ListController.originalListFromCSVFile
// // tam gdzie word1 fiszki r�wna sie flashCardOnDisplay.getWord1()
// fiszka.setKnowlege("1")
//
//
// } else {
//
// // ---- zamkn�c w metode - gdy zla odpowied�
//
// wy�wietl lb_wrongAndswer;
//
// // wywolac podmetode
//
//
//
// }
