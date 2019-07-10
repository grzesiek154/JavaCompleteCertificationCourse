package data_readers;

import java.util.List;

public interface DataReader {

    List<String[]> readData(String file);
}
