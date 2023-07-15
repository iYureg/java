package AlgoAndDataStruct.Lections.lesson2_arrayAlgos.Sorting;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[] { 9, 3, 2, 0, 3, 6, 8, 3, 2, 1 };

        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

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
