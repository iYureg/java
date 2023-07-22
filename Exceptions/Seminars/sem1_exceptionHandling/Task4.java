package Exceptions.Seminars.sem1_exceptionHandling;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(Arrays.toString(newArray(array1, array2)));
    }

    public static int[] newArray(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int[] result = new int[arr1.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = arr1[i] + arr2[i];
            }

            return result;
        } else {

            throw new RuntimeException(
                    "Длины массивов не равны: длина первого - " + arr1.length + ", длина второго - " + arr2.length);
        }
    }

}
