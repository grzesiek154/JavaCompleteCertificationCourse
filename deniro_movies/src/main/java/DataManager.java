import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataManager implements Manager{

    @Override
    public List<String[]> readData(String file) {

        List<String[]> records = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(file));
            CSVReader csvReader = new CSVReader(reader);
            records = csvReader.readAll();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

    @Override
    public void writeDate(String[] data, String file) {

        List<String[]> csvContent = readData(file);
        csvContent.add(data);
        CSVWriter csvWriter;
        try {
            csvWriter = new CSVWriter(new FileWriter(file));
            csvWriter.writeAll(csvContent);
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
