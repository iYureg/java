/**
 * structControl
 * 
 * управляющие конструкции в java
 */
import java.util.Scanner;
public class structControl {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
            System.out.println(c);

        int d = 1;
        int e = 2;
        int f = 0;
        if (d > e) f = d;
        if (e > d) f = e;
        System.out.println(f);

        // тернарный оператор
        int i = 1;
        int j = 2;
        int min = i < j ? i : j; // если i меньше j, то min = i, иначе min = j
        System.out.println(min);

        // оператор выбора 
        Scanner iScanner = new Scanner(System.in);
        boolean flag = iScanner.hasNextInt(); // введен ли int
        
        if (flag) {
            int mounth = iScanner.nextInt(); // суда поподает введенный int
            String text = "";

            switch (mounth) {
                case 1:
                    text = "Autumn";
                    break;
                default:
                    text = "mistake";
                    break;
                }
                System.out.println(text);
        } else {
            System.out.println("Вы ввели не число"); // true/false
        }
        
        iScanner.close();

    }
}