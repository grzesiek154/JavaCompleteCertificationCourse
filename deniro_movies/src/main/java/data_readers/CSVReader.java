package data_readers;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements DataReader{


    @Override
    public List<String[]> readData(String file) {

        List<String[]> records = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(file));
            com.opencsv.CSVReader csvReader = new com.opencsv.CSVReader(reader);
            records = csvReader.readAll();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
