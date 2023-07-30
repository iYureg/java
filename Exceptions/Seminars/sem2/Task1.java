package Exceptions.Seminars.sem2;

public class Task1 {
    public static void main(String[] args) {
        isNumber("333");
        isNumber("222dfs");
    }

    public static boolean isNumber(String str) {
        try {
            int a = 0;
            int b = 1;
            // int c = b / a;

            System.out.println(Integer.parseInt(str));
            System.out.println(true);
        } catch (NumberFormatException e) {
            System.out.println(false);
            return false;
        } finally {
            // блок finally выполняется в любом случае
            System.out.println("finally");
        }
        System.out.println("test");
        return true;
    }

}
