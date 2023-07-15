package AlgoAndDataStruct.Lections.lesson2_arrayAlgos.Finding;

public class Find {

    public static void main(String[] args) {
        int[] array = new int[] { 9, 3, 2, 0, 3, 6, 8, 3, 2, 1 };

        System.out.println(find(array, 5));
        System.out.println(find(array, 9));

        System.out.println("_".repeat(60));
        int[] array2 = new int[] { 1, 2, 3, 5, 6, 6, 7, 8, 9, 10, 10, 11, 12 };
        System.out.println(binarySearch(array2, 4, 0, array2.length - 1));
        System.out.println(binarySearch(array2, 6, 0, array2.length - 1));
        System.out.println(binarySearch(array2, 10, 0, array2.length - 1));
        System.out.println(binarySearch(array2, 11, 0, array2.length - 1));
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
