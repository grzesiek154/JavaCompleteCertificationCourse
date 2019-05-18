/**
 * WorkingWithStrings
 */
public class WorkingWithStrings {

    public static void main(String[] args) {
        String a = "hello";

        String statement = "Hello there yogi";
        int intVal = statement.indexOf("yogi");// search from left to right
        int anotheIntVal = statement.indexOf("ello"); // search from right to left
        System.out.println(intVal);
        System.out.println(anotheIntVal);

        String extractedString = a.substring(1);
        // prints "ello", substring creates new string form 1 element of previous string

        String extractedString2 = new String("radomiak").substring(1,5);

        System.out.println(extractedString);
        System.out.println(extractedString2);

        //String comparing
        if(a.equals("hello")) {
            System.out.println("YES");
        }

        if(a.equalsIgnoreCase("Hello")) {
            System.out.println("YES");
        } 
        System.out.println(a.charAt(3));
    }
}