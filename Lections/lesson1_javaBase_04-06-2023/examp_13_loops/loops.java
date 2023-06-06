/**
 * loops
 * 
 * циклы в java
 * ● цикл while;
 * ● цикл do while;
 * ● цикл for; и его модификация for in/foreach - итератор;
 */
public class loops {

    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        // цыкл while
        while (value != 0) {
            value /= 10;
            count++; // количество итераций
        }
        System.out.println(count);

        // do while
        do {
            value /= 10;
            count++; // количество итераций
        } while (value != 0);
        System.out.println(count);

        // for
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * continue, break
         * Операторы для управления циклами — continue и break
         * Выполнение следующей итерации цикла — continue.
         * Прерывание текущей итерации цикла — break.
         * - ближайшего к оператору
         */
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0) continue; // если четное вернется к увеличению счетчика
            System.out.println(i); // в итоге будет выводить только нечетные значения счетчика
        }
        System.out.println("-----------------");
        
        // for in (для коллекций)
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}