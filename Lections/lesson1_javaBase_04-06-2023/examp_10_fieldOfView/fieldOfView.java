/**
 * fieldOfView
 * 
 * область видимости
 */
public class fieldOfView {

    public static void main(String[] args) {
        int b = 111;
        {
            int a = 222;
            System.out.println(a + b);
        }
        int a = 123;
        System.out.println(a + b);

        // {
        //     int i = 123;
        //     System.out.println(i);
        //  }
        //  System.out.println(i); // error: cannot find symbol
    }
}