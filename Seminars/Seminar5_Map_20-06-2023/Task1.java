import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for (int i = 0; i < 10; i++) {
            mp.put(i, new Random().nextInt(0,10));
        }

        for (var elem : mp.entrySet()) {
            System.out.printf("Key: %d  Value: %d\n", elem.getKey(), elem.getValue());
        }
        System.out.println(mp.keySet());
        System.out.println(mp.values());
    }
    
}