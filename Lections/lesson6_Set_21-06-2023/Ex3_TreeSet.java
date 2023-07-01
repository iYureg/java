import java.util.Arrays;
import java.util.TreeSet;

/**
 * Ex3_TreeSet
 * 
 * ● В основе HashMap.
 * ● Упорядочен по возрастанию.
 * ● null’ов быть не может.
 * 
 * first()
 * last()
 * headSet(E)
 * tailSet(E)
 * subSet(E1, E2)
 * 
 */
public class Ex3_TreeSet {

    public static void main(String[] args) {
        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
        System.out.println(a.subSet(3, 5)); // [3, 4] 
    }
}