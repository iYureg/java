import java.util.Random;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int i;
        long l;
        float f = .234f;
        double d = .346;
        short s;
        byte b;
        char c = 'd';
        boolean bool;
        //----------------------

        int[] ints = new int[12];
        ints[0] = 1;

        Random random = new Random();
        for (int j = 0; j < ints.length; j++) ints[j] = random.nextInt(0, 22);
        for (int j : ints) System.out.printf("%d ", j); 
        System.out.println("\n");

        int[] tmp = new int[ints.length + 1];
        for (int j = 0; j < ints.length; j++) {
            tmp[j] = ints[j];
        }
        ints = tmp;

        // String s1 = new String("Привет");
        // System.out.println(s1);
        String s1 = "Hello!";
        s1 += "?";
        System.out.println(s1.repeat(4));
        System.out.println("!".repeat(32));
        System.out.println(Integer.toBinaryString(123));

        int num = 1;
        if(1<2 & (num >= 2 || num < 100)) System.out.println(true);

        Scanner scanner = new Scanner(System.in, "UTF-8");
        String s2 = scanner.nextLine();
        System.out.println(s2);
        scanner.close();

    }
}