import java.util.List;

public interface Manager {

    List<String[]> readData(String file);
    void writeDate(String[] data, String file);
}
