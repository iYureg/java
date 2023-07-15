package AlgoAndDataStruct.dz.sem2;

import java.util.Random;

public class HeapSort {

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1_000_000; i <= 10_000_000; i += 1_000_000) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = r.nextInt(i);
            }
            int[] arr2 = arr;

            long timer = System.currentTimeMillis();
            quickSort(arr, 0, arr2.length - 1);
            System.out.printf("quickSort: size: %d, time: %dms <----> ", arr.length,
                    System.currentTimeMillis() - timer);

            timer = System.currentTimeMillis();
            heapSort(arr2);
            System.out.printf("heapSort: size: %d, time: %dms\n", arr.length, System.currentTimeMillis() - timer);
        }

        System.out.println("HeapSort is Winner!");
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapy(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapy(arr, i, 0);
        }
    }

    private static void heapy(int[] arr, int hSize, int root) {
        int lg = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < hSize && arr[left] > arr[lg]) {
            lg = left;
        }

        if (right < hSize && arr[right] > arr[lg]) {
            lg = right;
        }

        if (lg != root) {
            int temp = arr[root];
            arr[root] = arr[lg];
            arr[lg] = temp;

            heapy(arr, hSize, lg);
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
}
