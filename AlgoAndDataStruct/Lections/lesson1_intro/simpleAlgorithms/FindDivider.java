package AlgoAndDataStruct.Lections.lesson1_intro.simpleAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FindDivider {

    public static void main(String[] args) {
        // List<Integer> results = findAvailableDivider(100);
        // System.out.println(results);

        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(30, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());

    }

    // O(n)
    public static List<Integer> findAvailableDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            counter++;
            if (number % i == 0)
                result.add(i);
        }
        System.out.println("Counter: " + counter);
        return result;
    }

    // O(n^2)
    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        ArrayList<Integer> result = new ArrayList();
        for (int i = 1; i <= max; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0)
                    flag = false;
            }
            if (flag) {
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }

    // O (2^n) !плохо
    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }

        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}
