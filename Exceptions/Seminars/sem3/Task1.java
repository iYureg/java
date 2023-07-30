package Exceptions.Seminars.sem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    public void rwLine(String read, File write) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(read));
                BufferedWriter bw = new BufferedWriter(new FileWriter(write))) {

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

}
