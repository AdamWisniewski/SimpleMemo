package adamWisniewski.simpleMemo.util;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import adamWisniewski.simpleMemo.controller.DialogController;
import adamWisniewski.simpleMemo.model.FlashCard;

public class LearningSystem {

	public FlashCard getFlashCardToLearn(List<FlashCard> listUnderLearning) throws IOException {

		Random randomizer = new Random();
		
		System.out.println(listUnderLearning.size());

		return listUnderLearning.remove(randomizer.nextInt(listUnderLearning.size()));

	}

	public void checkListIsEmpty(List<FlashCard> listUnderLearning) throws IOException {
		if (listUnderLearning.isEmpty()) {

			// zapisac originalListFromCSVFile do pliku
			// tu bedzie cala metoda z kopiowaniem pliku, zapisywaniem tresci do starego i w
			// catch ewentualnie kasowanie oryginalu
			// i zmiana nazwy z kopii na orygina� i wyswietlenie okienka ze zapis sie nie
			// udal i jest wersja slowek sprzed nauki

			DialogController.showDialogWhenListIsEmpty();

			WindowInitializer wi = new WindowInitializer();
			wi.setStage("ListView");

		}
	}

}


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
