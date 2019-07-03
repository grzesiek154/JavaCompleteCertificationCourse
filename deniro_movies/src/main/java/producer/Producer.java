package producer;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import java.util.concurrent.LinkedBlockingQueue;

public class Producer implements Runnable {

    Collection<String[]> list = new LinkedBlockingQueue<>();


    public Producer(Collection<String[]> list) {
        this.list = list;
    }

    public void writeDate(String[] data, String file) {

        List<String[]> csvContent = new ArrayList<>();
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

    @Override
    public void run() {

    }
}
