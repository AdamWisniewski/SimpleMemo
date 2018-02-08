package adamWisniewski.simpleMemo.csv;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import adamWisniewski.simpleMemo.controller.ListController;
import adamWisniewski.simpleMemo.controller.LoginController;
import adamWisniewski.simpleMemo.model.FlashCard;
import adamWisniewski.simpleMemo.util.RepositoryInitializer;

public class CSVgetter {

	public static List<FlashCard> readCSVtoList() throws IOException {

		File csvData = new File(RepositoryInitializer.getRepositorypath() + "/" + LoginController.getUserName() + "/"
				+ ListController.getFlashCardSetName());
		// wydruk kontrolny do konsoli

		System.out.println(csvData);

		CSVParser parser = CSVParser.parse(csvData, StandardCharsets.UTF_8, CSVFormat.DEFAULT.withSkipHeaderRecord(true));
		List<CSVRecord> list = parser.getRecords();
		parser.close();

		// wydruk kontrolny do konsoli
		System.out.println(list.get(1));
		System.out.println(list.get(1).get(0));
		
		List<FlashCard> formattedList = new ArrayList<FlashCard>();
		
		for (CSVRecord csvr : list) {
			FlashCard fc = new FlashCard(csvr.get(0), csvr.get(1), csvr.get(2), csvr.get(3));
			
			formattedList.add(fc);
			
			// wydruk kontrolny do konsoli
			System.out.println(fc);
		}
		
		return formattedList;
	}
	
}
