/**
 * fromTerm
 * 
 * получение данных от пользователя
 */

import java.util.Scanner;
public class fromTerm {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!\n", name);
        

        
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // введен ли int
        if (flag) {
            int i = iScanner.nextInt(); // суда поподает введенный int
            System.out.println(i); // вывод: int или исключение
        } else {
            System.out.println(flag); // true/false
        }
        iScanner.close(); // закрываем сессию
    }
}