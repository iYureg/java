import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * Task3
 */
public class Task3 {

    public static void main(String[] args) {
        Map<Integer, String> coll1 = new HashMap<Integer, String>();
        Map<Integer, String> coll2 = new HashMap<Integer, String>();

        for (int i = 0; i < 10; i++) {
            coll1.put(new Random().nextInt(10, 100), "Mary");
            coll2.put(new Random().nextInt(10, 100), "John");
        }


        System.out.println(coll1);
        System.out.println(coll2);
       
        for(Integer elem: coll1.keySet()){
            if(coll2.containsKey(elem)) {
                System.out.println( elem + ": " + coll1.get(elem) + " - " + elem + ": " + coll2.get(elem));    
            }
        }
    }
}