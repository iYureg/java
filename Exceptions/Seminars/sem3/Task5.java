package Exceptions.Seminars.sem3;

public class Task5 {

    public static void main(String[] args) {
        // String[][] ints1 = new String[][] { { "1", "2", "3", "4" }, { "1", "2", "3"
        // }, { "1", "2", "3" },
        // { "1", "2", "3" } };
        String[][] ints2 = new String[][] { { "1", "2", "3", "4" }, { "1", "2", "3",
                "4" }, { "1", "2", "3", "4" },
                { "1", "2", "3", "4" } };
        String[][] ints3 = new String[][] { { "1", "2", "3", "4" }, { "1", "2", "3", "4" },
                { "1dsfd", "2", "3ks", "4" },
                { "1", "2", "3", "4" } };

        try {

            // System.out.println("sum of elems: " + getSumArray(ints1));
            System.out.println("sum of elems: " + getSumArray(ints2));
            System.out.println("sum of elems: " + getSumArray(ints3));

        } catch (MyArraySizeException | MyArrayValueException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public static int getSumArray(String[][] array) {
        int sum = 0;
        final int ROW = 4;
        final int COL = 4;

        if (array.length != ROW)
            throw new MyArraySizeException();
        for (int i = 0; i < ROW; i++) {
            if (array[i].length != COL) {
                throw new MyArraySizeException(array.length, array[i].length);
            }
            for (int j = 0; j < COL; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayValueException(i, j);
                }
            }
        }
        return sum;
    }

    /**
     * MyArraySizeException
     */
    static class MyArraySizeException extends RuntimeException {

        public MyArraySizeException(int row, int col) {
            super("rows != columns :" + row + "x" + col);
        }

        public MyArraySizeException() {
            super("not valid sizes of rows and columns");
        }
    }

    /**
     * MyArrayValueException
     */
    static class MyArrayValueException extends NumberFormatException {
        public MyArrayValueException(int rowIndx, int colIndx) {
            super("inposible convert to integer: " + "data[" + rowIndx + "][" + colIndx + "]");

        }

        public MyArrayValueException() {
            super("incorrect value");
        }

    }
}
