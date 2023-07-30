package Exceptions.Lections.lesson2_exceptionHandling;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Exceptions {

    public static void main(String[] args) {

        // String str = null;
        // System.out.println(str.length());
        // // java.lang.NullPointerException: Cannot invoke "String.length()" because
        // // "<local1>" is null

        // -----------------------------

        // Object obj = new String("123");
        // File file = (File) obj;
        // System.out.println(file);
        // // java.lang.ClassCastException: class java.lang.String cannot be cast to
        // class
        // // java.io.File

        // -----------------------------

        // String num = "123fe";
        // int result = Integer.parseInt(num);
        // System.out.println(result);
        // java.lang.NumberFormatException: For input string: "123fe"

        // -----------------------------

        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
        // java.lang.UnsupportedOperationException
    }
}
