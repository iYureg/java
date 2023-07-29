package Exceptions.Seminars.sem3;

import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {
        try {
            doSomethig();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception catched with message: " + e.getMessage());
        }
    }

    public static void doSomethig() throws IOException {
        throw new IOException("I/O exception");
    }
}
