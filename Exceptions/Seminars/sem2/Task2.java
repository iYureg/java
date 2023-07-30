package Exceptions.Seminars.sem2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String[]> result = readFile("File.txt");

        changeList(result);

        for (var item : result) {
            System.out.println(Arrays.toString(item));
        }

        writeFile(result, "Result.txt");

    }

    public static void writeFile(List<String[]> lst, String path) {

        File file = new File(path);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String[] item : lst) {
                bw.write(item[0] + "=" + item[1]);
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("file not found in write metod: " + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<String[]> readFile(String path) {
        List<String[]> lst = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lst.add(line.split("="));
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("file not found in read method: " + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lst;
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void changeList(List<String[]> lst) {
        for (var item : lst) {
            if (!item[1].equals("?") && !isNumber(item[1])) {
                throw new RuntimeException("incorrect value: " + "< " + item[1] + " >");
            }
            if (item[1].equals("?")) {
                item[1] = String.valueOf(item[0].length());
                // item[1] = String.format("%d", item[0].length());
            }
        }
    }
}
