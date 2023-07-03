package JavaOOP.Lections.lesson3_standardInterfaces.Ex4_comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);
        // List<Integer> numbers = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        // numbers.add(r.nextInt(1, 20));
        // }

        // System.out.println(numbers);
        // Collections.sort(numbers);
        // System.out.println(numbers);
        // #endregion

        // #region Comparable<Worker>
        // List<Worker> db = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        // db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31),
        // r.nextInt(10000)));
        // }
        // System.out.println(db);

        // Collections.sort(db);
        // // Array.sort(...)

        // System.out.println(db);

        // #endregion

        // #region Comparable<Worker>

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31),
                    r.nextInt(10000)));
        }
        System.out.println(db);

        // db.sort(new AgeComporator());
        db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));
        System.out.println(db);

        db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));
        System.out.println(db);

        // #endregion

        // #region

        // Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        // Worker w2 = new Worker("Имя", "Фамилия", 20, 20);

        // #endregion

    }
}
