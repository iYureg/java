package Exceptions.dz.sem2;

/*
 * Задание 2
 *  try {
 *     int d = 0;
 *     double catchedRes1 = intArray[8] / d;
 *     System.out.println("catchedRes1 = " + catchedRes1);
 *  } catch (ArithmeticException e) {
 *      System.out.println("Catching exception: " + e);
 *  }
 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int r = new Random().nextInt(1, 3);

        try {
            int d = 0;
            int[] intArray;
            if (r == 1) {
                intArray = new int[8];
            } else {
                intArray = new int[10];
            }
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
