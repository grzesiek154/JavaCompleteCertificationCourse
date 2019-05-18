

/**
 * Application
 */
import java.io.*;

public class Application {

    public static void main(String[] args) {

        File file = new File("myfile.txt");
        // BufferedReader bufferedReader = null;
        

        // try {
        //     FileReader fileReader = new FileReader(file);
            
        //     bufferedReader = new BufferedReader(fileReader);

        //     String line = bufferedReader.readLine();

        //     while (line != null) {
        //         System.out.println();
        //     }
        // } catch(FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     System.out.println("Problem reading the file " + file.getName());
        // } finally {
        //     try {
        //         bufferedReader.close();
        //     } catch(IOException e) {
        //         System.out.println("unable to close file " + file.getName());
        //     }
            
       // }

       BufferedReader bufferedReader = null;
        

        try {
            FileReader fileReader = new FileReader(file);
            
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem reading the file " + file.getName());
        } finally {
            try {
                bufferedReader.close();
            } catch(IOException e) {
                System.out.println("unable to close file " + file.getName());
            }    }
}