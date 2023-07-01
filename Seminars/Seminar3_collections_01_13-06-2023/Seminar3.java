import java.util.*;

public class Seminar3 {

    public static void main(String[] args) {

        Object o = new Object();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            list1.add(new Random().nextInt(15));
        }

//        list.add(1);        //Integer
//        list.add(.34f);     //Float
//        list.add("Hello!"); //String
//        list.add(true);     //Boolean
//
//        if (list.get(2) instanceof String) {
//            String s = (String) list.get(2);
//        }

//        list.add(167);
//        list.add(9, 167);
//        list.addAll(list1);
//        list.addAll(2, list1);
//        list.size();
//        if (list.isEmpty());
//        if (list.contains(1));
//        list.get(2);
//        list.set(2, 6);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("1");
        list3.add("2");
        list3.remove(0);
        list3.remove("2");

//        list.clear();
//        list.trimToSize();
//        list.ensureCapacity(100);

//        ArrayList<Integer> list4 = (ArrayList<Integer>) list.subList(0, list.size()/2);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (int i: list) {
//            System.out.println(i);
//        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            System.out.println(i);
//            iterator.remove();
//        }

//        ListIterator<Integer> iterator = list.listIterator(list.size()/2);
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            System.out.println(i);
//            iterator.remove();
//            iterator.nextIndex();
//        }

//        list1.clear();
//        list.forEach(n -> list1.add(0, n));

        System.out.println(list);
        System.out.println(list1);
        System.out.println("-".repeat(16));

//        list.retainAll(list1);
        list.removeAll(list1);

        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%3 != 0) return 0;
                if (o2%2 != 0) return 1;
                return -1;
            }
        });

        System.out.println(list1);

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(null);
        linkedList.add(1);
        int t = linkedList.get(4);
    }

}