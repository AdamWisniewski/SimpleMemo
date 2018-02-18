package adamWisniewski.simpleMemo.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import adamWisniewski.simpleMemo.controller.ListController;
import adamWisniewski.simpleMemo.controller.LoginController;
import adamWisniewski.simpleMemo.model.FlashCard;

public class CSVConverter {

	public static String filePath = RepositoryInitializer.getRepositorypath() + "/" + LoginController.getUserName()
			+ "/" + ListController.getFlashCardListName();

	public static File csvData = new File(filePath);
	
	public static Map<String, Integer> readCSVHeaders() throws IOException {

		CSVParser parser = CSVParser.parse(csvData, StandardCharsets.UTF_8,
				CSVFormat.DEFAULT.withFirstRecordAsHeader());
		
		return parser.getHeaderMap();
		
	}

	public static List<FlashCard> readCSVtoList() throws IOException {

		CSVParser parser = CSVParser.parse(csvData, StandardCharsets.UTF_8,
				CSVFormat.DEFAULT.withFirstRecordAsHeader());

		// sparsowaæ pierwszy wiersz do innego obiektu jako header i potem go
		// wykorzystaæ do zapisania do pliku

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

	public static void writeListToCSV(List<FlashCard> originalListFromCSVFile, String filePath) throws IOException {

//		BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath));
//
//		CSVPrinter csvPrinter = new CSVPrinter(writer,
//				CSVFormat.DEFAULT.withHeader("tu wystarczy wstawiæ obiekt na pocz¹tku zczytany jako headery");
//
//		// for (FlashCard fc : originalListFromCSVFile) {
//
//		// poprawiæ to bo psuje zapis do pliku
//		csvPrinter.printRecord(originalListFromCSVFile);
//
//		csvPrinter.flush();
//		csvPrinter.close();

	}

	// csvPrinter.printRecord("1", "Sundar Pichai ", "CEO", "Google");
	// csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
	// csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple");
	//
	// csvPrinter.printRecord(Arrays.asList("4", "Mark Zuckerberg", "CEO",
	// "Facebook"));

	// dojœæ do pliku
	// wykasowaæ zawartoœæ w oryginale
	// nadpisaæ ca³¹ listê z argumentu

}
