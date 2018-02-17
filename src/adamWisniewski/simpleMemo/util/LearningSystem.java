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
			// i zmiana nazwy z kopii na orygina³ i wyswietlenie okienka ze zapis sie nie
			// udal i jest wersja slowek sprzed nauki

			DialogController.showDialogWhenListIsEmpty();

			WindowInitializer wi = new WindowInitializer();
			wi.setStage("ListView");

		}
	}

}


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
