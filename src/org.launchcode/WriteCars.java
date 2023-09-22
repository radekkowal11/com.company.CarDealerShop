package src.org.launchcode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteCars {
    public static void writeCars(){
        try(PrintWriter carsPrintWriter = new PrintWriter("passwords\\offer.csv")){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
