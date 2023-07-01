import java.util.Arrays;
import java.util.HashSet;

/**
 * Ex2_MathSet
 * 
 * addAll(Coll) – объединение множеств.
 * retainAll(Coll) – пересечение множеств
 * removeAll(Coll) – разность множеств.
 */
public class Ex2_MathSet {

    public static void main(String[] args) {

        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
    }
}