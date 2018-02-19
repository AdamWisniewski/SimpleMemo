package adamWisniewski.simpleMemo.util;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import adamWisniewski.simpleMemo.controller.DialogController;
import adamWisniewski.simpleMemo.controller.LearnController;
import adamWisniewski.simpleMemo.controller.ListController;
import adamWisniewski.simpleMemo.model.FlashCard;

public class LearningSystem {

	public FlashCard getFlashCardToLearn(List<FlashCard> listUnderLearning) throws IOException {

		Random randomizer = new Random();

		return listUnderLearning.remove(randomizer.nextInt(listUnderLearning.size()));

	}

	public void makeSavesIfListIsEmpty(List<FlashCard> listUnderLearning) throws IOException {
		if (listUnderLearning.isEmpty()) {

			CSVConverter.writeListToCSV(ListController.originalListFromCSVFile, CSVConverter.filePath);

			System.out.println("zapisano stan z originalList do pliku CSV");

			// naprawi� ten bajzel po naprawieniu argumentu z odniesieniem do LearnController
			ListController.setListToLearn(CSVConverter.makeListToLearn(ListController.originalListFromCSVFile));
			
			LearnController.listUnderLearning = CSVConverter.makeListToLearn(ListController.originalListFromCSVFile);

//			LearnController.listUnderLearning = ListController.listToLearn;

			System.out.println("pobrano z glownej listy fiszki ktorych nie znamy");

			// czy Java wy�apie zmiane warto�ci argumentu czy bedzie bra�a warto�c z momentu
			// inicjowania calej tej metody czyli gdy lista ta byla na pewno pusta??
			if (LearnController.listUnderLearning.isEmpty()) {
				
				System.out.println("weszli�my do p�tli");

				DialogController.showDialogWhenListIsEmpty();

				WindowInitializer wi = new WindowInitializer();
				wi.setStage("ListView");

			}
			System.out.println("zaczynamy kolejn� p�tl�");

		}
	}

}
