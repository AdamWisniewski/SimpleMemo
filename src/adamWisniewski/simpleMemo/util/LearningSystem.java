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

			ListController.setListToLearn(CSVConverter.makeListToLearn(ListController.originalListFromCSVFile));

			LearnController.listUnderLearning = CSVConverter.makeListToLearn(ListController.originalListFromCSVFile);

			if (LearnController.listUnderLearning.isEmpty()) {

				DialogController.showDialogWhenListIsEmpty();

				WindowInitializer wi = new WindowInitializer();
				wi.setStage("ListView");

			}

			DialogController.showDialogWhenLearningLoopEnds();

		}
	}

}
