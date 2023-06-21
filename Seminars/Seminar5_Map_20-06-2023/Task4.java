import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * Task4
 */
public class Task4 {

    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            mp.put(i, new Random().nextInt(1, 10));
        }
        mp.put(10,0);
        System.out.println(mp);
        mp.replaceAll((k,v) ->  v == 0 ? v = 1000 : v * v);
        // for(Integer key : mp.keySet()) mp.replace(key, mp.get(key) * mp.get(key));
        // mp.forEach((k,v) -> System.out.printf("%d=%d, ",k, v * v));
        System.out.println("\n" + mp);
    }
}