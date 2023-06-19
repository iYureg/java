import java.util.HashMap;
import java.util.Map;

/**
 * HashMapCollection
 */
public class HashMapCollection {

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "one"); System.out.println(db);
        db.put(2, "two"); System.out.println(db);
        db.put(3, "three"); System.out.println(db);
        db.put(31, "three one"); System.out.println(db);
        db.put(13, "one three"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}