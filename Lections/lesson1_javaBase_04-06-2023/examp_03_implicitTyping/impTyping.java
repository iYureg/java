/**
 * impTyping
 * 
 * неявная типизация в Java
 */
public class impTyping {

    public static void main(String[] args) {
        var i = 123;
        System.out.println(i);

        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(i));
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);
        // d = "mistake";
        // error: incompatible types:
        // String cannot be converted to double

    }
    
    // методы должны находиться внутри класса
    /*
     * метод для демонстрации типа переменной
     */
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
