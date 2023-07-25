package Exceptions.Lections.lesson2_exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test"); // error: unreported exception FileNotFoundException; must be
                                           // caught or declared to be thrown
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            // -------------
            System.out.println("finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally end");
            // --------------
        }
    }
}
