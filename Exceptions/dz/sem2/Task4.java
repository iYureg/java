package Exceptions.dz.sem2;

import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод строки: ");
        String line = scanner.nextLine();

        while (isEmptyString(line)) {
            System.out.println("Вы ввели: " + line + "\n\n");
            System.out.println("Ввод строки: ");
            line = scanner.nextLine();
        }

        scanner.close();

    }

    public static boolean isEmptyString(String str) {
        if (str.length() > 0) {
            return true;
        } else {
            System.out.println("Пустые строки вводить нельзя!");
            return false;
        }
    }
}
