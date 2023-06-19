import java.util.TreeMap;

/**
 * TreeMapCollection
 */
public class TreeMapCollection {

    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"one"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"six"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"four"); System.out.println(tMap);
         // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"three"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"two"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

        for (var item : tMap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}