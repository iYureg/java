import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * Task2
 */
public class Task2 {

    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>(20);
        for (int i = 0; i < 20; i++) {
            mp.put(i, new Random().nextInt(10, 100));
        }

        
        for (Integer key : mp.keySet()) {
            if(mp.get(key)%3 == 0){
                System.out.println(mp.get(key) + " / 3" + " = " + mp.get(key) / 3 );
            } 
        }
    }
}