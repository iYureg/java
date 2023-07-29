package Exceptions.Seminars.sem3;

import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try (Counter count = new Counter()) {
            count.upCount();
            System.out.println(count.getCount());
            count.upCount();
            System.out.println(count.getCount());
            count.upCount();
            System.out.println(count.getCount());
            count.upCount();
            System.out.println(count.getCount());

            count.close();
            System.out.println(count.getCount());

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
