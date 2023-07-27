package Exceptions.dz.sem2;

/*
 * Задание 1
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task1 {

    public static boolean isFloat(String num) {
        try {
            Float.parseFloat(num);
            return true;
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("введено не дробное число: " + "< " + num + " >");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");

        String line = scanner.nextLine();
        while (!isFloat(line)) {
            System.out.println("Введите дробное число: ");
            line = scanner.nextLine();
        }
        scanner.close();

        System.out.println("Ваше дробное число -> " + Float.parseFloat(line));
    }
}
