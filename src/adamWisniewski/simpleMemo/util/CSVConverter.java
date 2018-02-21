package adamWisniewski.simpleMemo.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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

	public static String filePath = RepositoryInitializer.getRepositorypath() + "/" + LoginController.getUserName()
			+ "/" + ListController.getFlashCardListName();

	public static File csvData = new File(filePath);

	public static FlashCard header;

	public static List<FlashCard> readCSVtoList() throws IOException {

		CSVParser parser = CSVParser.parse(csvData, StandardCharsets.UTF_8, CSVFormat.DEFAULT);

		List<CSVRecord> list = parser.getRecords();

		parser.close();

		List<FlashCard> formattedList = new ArrayList<FlashCard>();

		for (CSVRecord csvr : list) {
			FlashCard fc = new FlashCard(csvr.get(0), csvr.get(1), csvr.get(2), csvr.get(3));

			formattedList.add(fc);

		}

		header = formattedList.remove(0);
		System.out.println(header);

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

	public static void setKnowlegeOfFlashCard(List<FlashCard> originalListFromCSVFile,
			FlashCard flashCardOnDisplay, String knowlege) {

		for (FlashCard fc : originalListFromCSVFile) {

			if (fc.equals(flashCardOnDisplay)) {
				fc.setKnowlege(knowlege);
			}

		}

	}

	public static void writeListToCSV(List<FlashCard> originalListFromCSVFile, String filePath) throws IOException {

		BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath));

		CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(header.getWord1(), header.getWord2(), header.getKnowlege(), header.getComment()));

		for (FlashCard fc : originalListFromCSVFile) {

			csvPrinter.printRecord(fc.getWord1(), fc.getWord2(), fc.getKnowlege(), fc.getComment());
		}

		csvPrinter.flush();
		csvPrinter.close();

	}
	
	public static void resetKnowlegeInCSV(List<FlashCard> originalListFromCSVFile, String knowlege) {
		
		for (FlashCard fc : originalListFromCSVFile) {

				fc.setKnowlege(knowlege);
			

		}
		
	}

}
