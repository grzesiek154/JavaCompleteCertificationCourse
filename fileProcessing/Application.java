import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Application
 */
public class Application {

   

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // // System.in - input stream of data
        // System.out.println("Enter some Text: ");
        // String entredText = input.nextLine();
        // System.out.println(entredText);

        try {
            File file = new File("someFile.txt");
            Scanner input = new Scanner(file);

            while(input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
        }
       
            input.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        MyFileUtils myFileUtils = new MyFileUtils();
        try {
            System.out.println(myFileUtils.substract10FromLargeNumber(1)); 

            } catch (Exception e){
               e.printStackTrace(); 
            }
       
      
    }

}