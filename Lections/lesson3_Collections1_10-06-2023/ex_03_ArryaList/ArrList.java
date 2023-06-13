import java.util.ArrayList;
import java.util.List;

/**
 * ArrList
 */
public class ArrList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);
        
        for (Object o : list) {
            System.out.println(o);
        }
        
        List list2 = new ArrayList();
        list2.add(1);
        list2.add(123);
        list2.add("list");

        for (Object obj : list2) {
            System.out.println(obj);
        }
    }
}