/**
 * operate
 */
public class operate {

    public static void main(String[] args) {
        int a = 123; // = присваивание
        System.out.println(a);

        System.out.println(++a); // префиксный иткремент

        System.out.println(a--); // постфиксный дискремент
        System.out.println(a);
        System.out.println(a-- - --a); // 2
        System.out.println(--a-a--); // 0

        int b = a%2; // % деление по модулю
        System.out.println(b);

        // операции сравнения <, >, ==, !=, >=, <=
        boolean f = 123 > 456;
        // boolean f = 123 >= 456;
        // boolean f = 123 <= 456;
        // boolean f = 123 != 456;
        System.out.println(f);

        // логические операторы ||, &&, ^, !
        boolean f1 = true;
        boolean f2 = false;
        System.out.println(f1 && f2);
        System.out.println(f1 || f2);
        System.out.println(f1 ^ f2);
        System.out.println(!f1 && !f2);

        // побитовые операции <<, >>, &, |, ^
        int c = 8;
        // 1000 двоич 8
        System.out.println(c << 1); // сдвигаем на 1 бит влево // 100
        System.out.println(c >> 1); // сдвигаем на 1 бит вправо // 10000

        int d = 5;
        int e = 2;
        System.out.println(d | e);
        // d - 101
        // e - 010
        // d или е = 7 // 111
        System.out.println(d & e); // 000
        System.out.println(d ^ e); // 111

        String s = "qwe1";
        System.out.println(s.length() >= 5 && s.charAt(4) == '1'); // false
        System.out.println(s.length() >= 5 & s.charAt(4) == '1'); // false и всеравно посмотрю что в правой части
        // || и | работают аналогично
    }
}