/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // short
        short age = 10;
        System.out.println(age);

        // int
        int salary = 12345;
        System.out.println(salary);

        // float
        float e = 2.7f;  // f - обязательно для типа float
        System.out.println(e);

        // double
        double pi = 3.1415;  // D - не является обязательной
        System.out.println(pi);
        
        // char
        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch)); 

        // boolean
        boolean flag1 = 123 <= 456;
        System.out.println(flag1);

        boolean flag2 = 123 >= 456;
        System.out.println(flag2);

        boolean flag3 = flag1 ^ flag2; // разделительная дизъюнкция (истина, тогда и только тогда, если строго одна истина)
        System.out.println(flag3);

        String msg = "Hello world";
        System.out.println(msg);

    }    
}
