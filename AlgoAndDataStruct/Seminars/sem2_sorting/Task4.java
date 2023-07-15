package AlgoAndDataStruct.Seminars.sem2_sorting;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1_000_000; i <= 10_000_000; i += 1_000_000) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = r.nextInt(i);
            }
            int[] arr2 = arr;

            long timer = System.currentTimeMillis();
            find(arr, r.nextInt(i));
            System.out.printf("find: size: %d, time: %dms <----> ", arr.length,
                    System.currentTimeMillis() - timer);

            timer = System.currentTimeMillis();
            binarySearch(arr2, r.nextInt(i), 0, arr2.length - 1);
            System.out.printf("binarySearch: size: %d, time: %dms\n", arr.length, System.currentTimeMillis() - timer);
        }
    }

    // Простой перебор элементов O(n)
    public static int find(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    // Бинарный поиск O(log n)
    // отсортированный массив!
    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;

        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }

        if (array[midPoint] < value) {
            return binarySearch(array, value, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return binarySearch(array, value, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }
}
