package AlgoAndDataStruct.Lections.lesson2_arrayAlgos.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] { 9, 3, 2, 0, 3, 6, 8, 3, 2, 1 };

        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    // O(n^2) на миллион элементов - около 5 минут
    public static void sort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);

    }

}
