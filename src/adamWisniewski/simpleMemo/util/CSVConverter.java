package adamWisniewski.simpleMemo.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import adamWisniewski.simpleMemo.controller.ListController;
import adamWisniewski.simpleMemo.controller.LoginController;
import adamWisniewski.simpleMemo.model.FlashCard;

public class CSVConverter {

	public static List<FlashCard> readCSVtoList() throws IOException {

		File csvData = new File(RepositoryInitializer.getRepositorypath() + "/" + LoginController.getUserName() + "/"
				+ ListController.getFlashCardListName());

		CSVParser parser = CSVParser.parse(csvData, StandardCharsets.UTF_8,
				CSVFormat.DEFAULT.withSkipHeaderRecord(true));

		List<CSVRecord> list = parser.getRecords();
		parser.close();

		List<FlashCard> formattedList = new ArrayList<FlashCard>();

		for (CSVRecord csvr : list) {
			FlashCard fc = new FlashCard(csvr.get(0), csvr.get(1), csvr.get(2), csvr.get(3));

			formattedList.add(fc);

		}

		return formattedList;
	}

	public static List<FlashCard> makeListToLearn(List<FlashCard> list) throws IOException {

		List<FlashCard> setToLearn = new ArrayList<FlashCard>();

		for (FlashCard fc : list) {
			if ("0".equals(fc.getKnowlege())) {
				setToLearn.add(fc);
			}

		}

		return setToLearn;
	}

	public static void setKnowlegeOfFlashCardInList(List<FlashCard> originalListFromCSVFile,
			FlashCard flashCardOnDisplay) {

		for (FlashCard fc : originalListFromCSVFile) {

			if (fc.equals(flashCardOnDisplay)) {
				fc.setKnowlege("1");
			}

		}

	}
	
	public static void writeListToCSV(List<FlashCard> originalListFromCSVFile, String fileName) {
		
//		dojœæ do pliku
//		wykasowaæ zawartoœæ w oryginale
//		nadpisaæ ca³¹ listê z argumentu
		
		
	}

}
