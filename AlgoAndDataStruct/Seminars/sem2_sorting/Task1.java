package AlgoAndDataStruct.Seminars.sem2_sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * 1.Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(n2).
 * 2.Можно выбрать из пузырьковой сортировки, сортировки вставками и сортировки выбором.
 * 3.Следует обратить внимание на сложность данных алгоритмов и указать признаки квадратичной сложности для каждого из них.
 */
public class Task1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }

        long timer = System.currentTimeMillis();
        insertSort(array);
        System.out.printf("insertSort timer: %dms", System.currentTimeMillis() -
                timer);

        System.out.println(Arrays.toString(array));
    }

    // 1000 - insertSort timer: 5ms
    // 10000 - insertSort timer: 75ms
    // 100000 - insertSort timer: 4462ms
    // O(n^2)
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
