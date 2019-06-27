
import java.util.ArrayList;
import java.util.List;

public class Main {

   static String csv = "deniro.csv";

    public static void main(String[] args) {

        DataManager dataManager = new DataManager();
        List<String[]> list = new ArrayList<>();
        String[] array = {"pierwszy", "drugi", "trzeci"};
        String[] array2 = {"pierwszy2", "drugi2", "trzeci2"};
        //list.add(array);


        dataManager.writeDate(array2, csv);

        List<String[]> data = dataManager.readData(csv);

        for (String[] line : data){
            for(int i = 0; i< line.length; i++){
                System.out.println(line[i]);
            }
        }
    }
}
