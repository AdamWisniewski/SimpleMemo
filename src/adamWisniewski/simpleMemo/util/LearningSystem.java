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
			// i zmiana nazwy z kopii na orygina³ i wyswietlenie okienka ze zapis sie nie
			// udal i jest wersja slowek sprzed nauki

			DialogController.showDialogEmptyListToLearn();

			WindowInitializer wi = new WindowInitializer();
			wi.setStage("ListView");

		}
	}

}

// wrzuciæ metodê do learncontroller bo pola okna s¹ przecie¿ prywatne!!
// // ----------- metoda sprawdzania poprawnych odpowiedzi uruchamiana po
// // naciœniciu sprawdzam lub enter (enter chyba dac jako akcja on presed na
// // anchorpane)
//
// if(lb_wordToGuess wyœwietlone)
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
// // ---- zamkn¹c w metode - gdy poprawna odpowiedŸ
//
// wyœwietl lb_goodAndswer;
//
// // --- zamkn¹c w podmetode
//
// wyœwietl lb_wordToGuess;
//
// wyœwietl lb_wordComment;
//
// ukryj lb_checkShortCutInformation;
//
// wyœwietl lb_goToNextShortCutInformation;
//
// //------------------------
//
// //-----------------------
// // --- metoda nadpisywania Knowlege w pierwotnej liœcie iportowanej z CSV
//
// ListController.originalListFromCSVFile
// // tam gdzie word1 fiszki równa sie flashCardOnDisplay.getWord1()
// fiszka.setKnowlege("1")
//
//
// } else {
//
// // ---- zamkn¹c w metode - gdy zla odpowiedŸ
//
// wyœwietl lb_wrongAndswer;
//
// // wywolac podmetode
//
//
//
// }
