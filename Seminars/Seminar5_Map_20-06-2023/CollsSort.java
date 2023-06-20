import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * CollsSort
 * 
 * 
 */
public class CollsSort {

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<Integer>(10);
        List<Integer> arr2 = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            arr1.add(i);
            arr2.add(new Random().nextInt(0,10));
        }
        System.out.println(arr1);
        System.out.println(arr2);

//        Collections.sort(arr1, (o1, o2)-> arr2.get(o1) - arr2.get(o2));
        Collections.sort(arr1, Comparator.comparing(arr2::get));

        System.out.println(arr1);
        System.out.println(arr2);

    }
}