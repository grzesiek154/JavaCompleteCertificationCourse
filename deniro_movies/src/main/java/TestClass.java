import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.add("pierwszy");
            list.add("drugi");
            list.add("trzeci");

            String line = "";
            StringBuffer bufferLine = null;
            int count = 0;

            for(String element : list){

                if(count == 0){
                    line = element;
                    count++;
                } else {
                    line = line + ", " + element;
                }
            }


        System.out.println(line);

    }
}
