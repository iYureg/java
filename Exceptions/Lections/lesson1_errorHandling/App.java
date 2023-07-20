package Exceptions.Lections.lesson1_errorHandling;

import java.io.File;

public class App {
    public static void main(String[] args) {

        // a();

        // System.out.println(getFileSize(new File("test.txt")));

        System.out.println(divide(10, 0));
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divide(int n1, int n2) {
        if (n2 == 0) {
            throw new RuntimeException("Divide by zero not permited");
            // return -1;
        }
        return n1 / n2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
