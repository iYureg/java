import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LindedHashMap
 * 
 * “Старший брат” коллекции HashMap, который всё помнит…
 * Помнит порядок добавления элементов ➜ более медлительный
 */
public class LindedHashMapCollection {

    public static void main(String[] args) {
        
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "one one");
        linkmap.put(1, "two");
        linkmap.put(2, "one");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "one one");
        map.put(2, "two");
        map.put(1, "one");
        System.out.println(map); // {1=один, 2=два, 11=один один}

        for (var item : linkmap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

        for (var item : map.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}