package AlgoAndDataStruct.Seminars.sem2_sorting;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        // int[] array = new int[100_000];
        // int[] array = new int[1_000_000];
        // int[] array = new int[10_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1001);
        }

        long timer = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        System.out.printf("insertSort timer: %dms\n", System.currentTimeMillis() -
                timer);

        System.out.println(Arrays.toString(array));

    }

    // 100_000 - 24ms
    // 1_000_000 - 88ms
    // 10_000_000 - 624ms
    // O(n * log n)
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

}
