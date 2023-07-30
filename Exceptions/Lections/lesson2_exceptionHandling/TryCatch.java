package Exceptions.Lections.lesson2_exceptionHandling;

import java.util.Collections;

public class TryCatch {
    public static void main(String[] args) {
        int num = 1;
        try {
            // num = 10 / 0;
            num = 10 / 1;

            String test = null;
            // System.out.println(test.length());

            Collections.emptyList().add(new Object());

        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("operation divide by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("nullpointer exception");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println(num);
    }
}
