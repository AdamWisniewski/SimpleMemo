package adamWisniewski.simpleMemo.util;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import adamWisniewski.simpleMemo.controller.DialogController;
import adamWisniewski.simpleMemo.controller.ListController;
import adamWisniewski.simpleMemo.model.FlashCard;

public class LearningSystem {

	public FlashCard getFlashCardToLearn(List<FlashCard> listUnderLearning) throws IOException {

		Random randomizer = new Random();

		return listUnderLearning.remove(randomizer.nextInt(listUnderLearning.size()));

	}

	public void checkOneAttemptListIsEmpty(List<FlashCard> listUnderLearning) throws IOException {
		if (listUnderLearning.isEmpty()) {

			System.out.println("kolejna pêtla");

			ListController.setListToLearn(CSVConverter.makeListToLearn(ListController.originalListFromCSVFile));

			if (ListController.listToLearn.isEmpty()) {

				CSVConverter.writeListToCSV(ListController.originalListFromCSVFile, CSVConverter.filePath);

				DialogController.showDialogWhenListIsEmpty();

				WindowInitializer wi = new WindowInitializer();
				wi.setStage("ListView");

			}
			
			System.out.println("zapisano stan znanych s³ówek do g³ównego pliku CSV");

		}
	}

}
