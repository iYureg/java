import java.util.Scanner;

/**
 * IndivisibleNums
 * 
 * программа выводит в консоль
 * все простые числа до задонного значения
 */
public class IndivisibleNums {

    public static void main(String[] args) {
        System.out.printf("Введите положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int to = scanner.nextInt();
        scanner.close();

        getIndivNums(to);
    }

    static void getIndivNums(int end){
        
        Boolean res = false;

        for (int i = 2; i <= end ; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0){   
                    res = false;
                } 
            }
            if (res) System.out.println(i);
            else res = true;
        }
    }
}