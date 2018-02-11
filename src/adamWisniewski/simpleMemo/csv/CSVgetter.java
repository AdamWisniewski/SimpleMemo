package adamWisniewski.simpleMemo.csv;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public static Set<FlashCard> makeSetToLearn(List<FlashCard> formattedList) {

		Set<FlashCard> setToLearn = new HashSet<FlashCard>();

		for (FlashCard fc : formattedList) {
			if ("0".equals(fc.getKnowlege())) {
				setToLearn.add(fc);
			}

		}

		return setToLearn;
	}

}
