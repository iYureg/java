package Exceptions.Seminars.sem3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {

    /**
     * DivisionByZeroException
     */
    static class DivisionByZeroException extends ArithmeticException {

        public DivisionByZeroException() {
            super("division by zero not supported");
        }
    }

    /**
     * ArrayNullPointer
     */
    static class ArrayNullPointerException extends NullPointerException {
        int index;

        public ArrayNullPointerException() {
            super("array element is empty: elem index-");
        }

        public ArrayNullPointerException(int index) {
            super("array element is empty: elem index-" + index);
            this.index = index;
        }

    }

    /**
     * MyFileNotFoundException
     */
    static class MyFileNotFoundException extends FileNotFoundException {
        String path = "";

        public MyFileNotFoundException(String path) {
            super("file not exists by path: " + path);
            this.path = path;
        }

        public MyFileNotFoundException() {
            super("file not exists ");
        }

    }

    public static void main(String[] args) {
        String path = "test.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            try {
                throw new MyFileNotFoundException(path);
            } catch (MyFileNotFoundException f) {
                System.out.println(f.getMessage());
            }
        }

        // ---------------------------------

        // Integer[] ints = new Integer[] { 1, 2, 3, null, 5 };
        // int i = 0;
        // try {
        // for (; i < ints.length; i++) {
        // ints[i]++;
        // }
        // } catch (NullPointerException e) {
        // try {
        // throw new ArrayNullPointerException(i);
        // } catch (ArrayNullPointerException f) {
        // System.out.println(f.getMessage());
        // }
        // }

        // --------------------------
        // try {
        // System.out.println(3 / 0);
        // } catch (ArithmeticException e) {
        // try {
        // throw new DivisionByZeroException();
        // } catch (DivisionByZeroException f) {
        // System.out.println(f.getMessage());
        // }
        // }
    }
}
