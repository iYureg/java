package AlgoAndDataStruct.Seminars.sem2_sorting;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 10_000; i <= 100_000; i += 10_000) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = r.nextInt(i);
            }
            int[] arr2 = arr;

            long timer = System.currentTimeMillis();
            insertSort(arr);
            System.out.printf("bubbleSort: size: %d, time: %dms <----> ", arr.length,
                    System.currentTimeMillis() - timer);

            timer = System.currentTimeMillis();
            quickSort(arr2, 0, arr2.length - 1);
            System.out.printf("quickSort: size: %d, time: %dms\n", arr.length, System.currentTimeMillis() - timer);
        }
    }

    public static void quickSort(int[] array, int s, int e) {
        int l = s;
        int r = e;
        int pivot = array[(s + e) / 2];

        do {
            while (array[l] < pivot)
                l++;
            while (array[r] > pivot)
                r--;
            if (l <= r) {
                if (l < r) {
                    int temp = array[l];
                    array[l] = array[r];
                    array[r] = temp;
                }
                l++;
                r--;
            }
        } while (l <= r);

        if (l < e)
            quickSort(array, l, e);
        if (s < r)
            quickSort(array, s, r);
    }

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
