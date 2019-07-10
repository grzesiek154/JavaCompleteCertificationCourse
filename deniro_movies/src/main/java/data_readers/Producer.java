package data_readers;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {


    private final int LIMIT = 10;
    private final DataReader dataReader;
    private List<String[]> dataBuffer = new ArrayList<>();

    public Producer(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void reaData(String csv) throws InterruptedException {
        List<String[]> csvData = dataReader.readData(csv);

        synchronized (dataBuffer) {
            while (dataBuffer.size() == LIMIT){
                dataBuffer.wait();
            }
        }

        synchronized ()
    }

    @Override
    public void run() {

    }
}
