package Exceptions.Lections.lesson3_exceptionsAdvanced;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt");
                FileWriter fw = new FileWriter("testCopy.txt");) { // будет закрыт автоматически
            while (fr.ready()) {
                fw.write(fr.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("copy successfully");

        try {
            System.out.println("try opperation");
        } finally {
            System.out.println("finally opperation");
        }
    }
}
