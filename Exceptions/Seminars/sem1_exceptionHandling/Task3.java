package Exceptions.Seminars.sem1_exceptionHandling;

public class Task3 {

    public static void main(String[] args) {
        Integer[] array = new Integer[] { 1, 2, null, 4, 5, null, 7, 8, null, 10 };

        try {
            isNull(array);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void isNull(Integer[] arr) {
        StringBuilder sb = new StringBuilder("Null index: ");
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                sb.append(i).append(", ");
                flag = !flag;
            }
        }
        if (flag)
            throw new RuntimeException(sb.toString());
    }
}
