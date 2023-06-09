import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Введите первое слово: ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println("Введите второе слово: ");
        scanner = new Scanner(System.in);
        String s2 = scanner.nextLine();

        if(s1.equals(s2)) System.out.println("Слова одинаковы");
        else System.out.println("Разные слова");

    }
}
