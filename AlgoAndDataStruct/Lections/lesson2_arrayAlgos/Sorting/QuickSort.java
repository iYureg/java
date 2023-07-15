package AlgoAndDataStruct.Lections.lesson2_arrayAlgos.Sorting;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[1_000_000];
        for (int index = 0; index < array.length; index++) {
            array[index] = r.nextInt(Integer.MAX_VALUE);
        }

        long timer = System.currentTimeMillis();
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.printf("quickSort timer: %dms", System.currentTimeMillis() - timer);
    }

    // O(n * log n)
    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];

        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition) {
            quickSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            quickSort(array, startPosition, rightPosition);
        }
    }
}
