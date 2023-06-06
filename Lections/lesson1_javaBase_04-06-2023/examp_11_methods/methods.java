/**
 * methods
 * 
 * футкции и методы в Java
 */
public class methods {

    // сумма чисел - возвращает int
    static int sum(int a, int b) { 
        return a+b;
    }
    
    // факториал через рекурсию - возвращает double
    static double factor(int n) { 
        if(n==1)return 1;
        return n * factor(n-1);
    }
    
    // method main
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
    
    // void
    static void sayHi() {
        System.out.println("hi!"); 
    }
}