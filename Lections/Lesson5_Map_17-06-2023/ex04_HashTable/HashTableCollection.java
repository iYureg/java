import java.util.Hashtable;
import java.util.Map;

/**
 * HashTableCollection
 * 
 * «Устаревший брат» коллекции HashMap,
 * который не знает про null
 */
public class HashTableCollection {

    public static void main(String[] args) {
        
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "two");
        table.put(11, "one one");
        table.put(2, "one");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }
}