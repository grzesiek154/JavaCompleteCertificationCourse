/**
 * MyFileUtils
 */
public class MyFileUtils {

    public int substract10FromLargeNumber(int number) throws Exception {
        if( number < 10) {
            throw new FooRunetimeException("The number passed was smaller than 10");
        }
        return number - 10;
    }

    public class FooRunetimeException extends Exception {

        public FooRunetimeException(String message) {
            super(message);
        }
    }
}