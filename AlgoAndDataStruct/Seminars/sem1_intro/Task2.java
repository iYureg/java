package AlgoAndDataStruct.Seminars.sem1_intro;

import java.util.ArrayList;

/*
 * Написать алгоритм поиска простых чисел (делятся только на себя и
 * на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
 * вложенный for, что явно говорит о квадратичной сложности, на этом
 * стоит акцентировать внимание
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(getPrimeNumbers(100));
    }

    // O(n^2)
    public static ArrayList<Integer> getPrimeNumbers(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(i);
            }
        }
        return result;
    }
}
