package Exceptions.Seminars.sem1_exceptionHandling;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] { { 0, 1 }, { 1, 0, 1 } };
        int[][] arr2 = new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };
        int[][] arr3 = new int[][] { { 1, 0 }, { 0, 1 }, { 1, 0 } };

        System.out.println(sum(arr1));
        // System.out.println(sum(arr2));
        System.out.println(sum(arr3));
    }

    public static int sum(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                throw new RuntimeException("не квадратный массив " + arr.length + " != " + arr[i].length);
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0 || arr[i][j] > 1) {
                    throw new RuntimeException("значение не удовлетворяет требованиям");
                }
                result += arr[i][j];
            }
        }
        return result;
    }

}
