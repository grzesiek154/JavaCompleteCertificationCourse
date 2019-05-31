import java.util.HashMap;
import java.util.Map;

/**
 * MapInterface
 */
public class MapInterface {

    //linkedHashMap = przechowuje elemnty w kolejnosci
    //treeHashMap = przechowuje elementy w alfabetycznym porzadku
    //Map nie pozwala na przechowywanie zduplikowanych wartosci
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("some key", "some val");
        dictionary.put("some key2", "some val2");
        dictionary.put("some key3", "some val3");

        // loop through keys
        for(String word: dictionary.keySet()){
            System.out.println(word);
        }

        //loop through values
        for(String word: dictionary.values()){
            System.out.println(word);
        }

        for(Map.Entry<String,String> entry:dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}