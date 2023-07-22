package Exceptions.Seminars.sem1_exceptionHandling;

public class Task {

    public static void main(String[] args) {
        int[] array = new int[0];
        int[] array2 = new int[] { 1, 2, 3, 4, 5 };

        // System.out.println(checkLength(array, 3));
        // System.out.println(checkLength(array2, 4));

        message(checkValue(array, 4));
        message(checkValue(array2, 6));
        message(checkValue(null, 3));
        message(checkValue(array2, 3));
    }

    static int checkLength(int[] array, int size) {

        if (array.length < size)
            return -1;
        return array.length;
    }

    static int checkValue(int[] array, int value) {
        if (array == null)
            return -3;
        if (checkLength(array, 1) < 0)
            return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -2;
    }

    static void message(int exception) {
        switch (exception) {
            case -1:
                System.out.println("длина массива не соответствует заданному минимуму");
                break;

            case -2:
                System.out.println("искомое значение не найдено");
                break;

            case -3:
                System.out.println("вместо массива пришел null");
                break;
            default:
                System.out.println(exception);
        }
    }
}
