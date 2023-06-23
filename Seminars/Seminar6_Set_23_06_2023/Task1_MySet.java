package Seminars.Seminar6_Set_23_06_2023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


/**
 * Task1_MySet
 */
public class Task1_MySet {

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        System.out.println("add 9 -> " + mySet.add(9));
        System.out.println("add 9 -> " + mySet.add(9));
        System.out.println("size -> " +mySet.size());
        System.out.println("isEmpty -> "+mySet.isEmpty());
        System.out.println("remove 9 -> "+mySet.remove(9));
        System.out.println("remove 9 -> "+mySet.remove(9));
        System.out.println("size -> " +mySet.size());
        System.out.println("isEmpty -> "+mySet.isEmpty());
        
        System.out.println("add 9 -> " + mySet.add(9));
        System.out.println("add 6 -> " + mySet.add(6));
        System.out.println("add 3 -> " + mySet.add(3));

        Iterator<Integer> iterator = mySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(mySet.toString());
        // HashMap mp = new HashMap<>();
        // mp.toString();
    }
}

class MySet <E> {
    private HashMap<E,Object> mp = new HashMap<E, Object>();
    private static final Object OBJECT = new Object();

    public boolean add(E num) {
        return mp.put(num, OBJECT) == null;
        // if(!mp.containsKey(num)){
        //     mp.putIfAbsent(num, OBJECT);
        //     return true;
        // }
        // return false;
    }
    public boolean remove(E num) {
        return mp.remove(num) != null;
    }

    public int size() {
        return mp.size();
    }

    public boolean isEmpty(){
        return mp.size() == 0;
    }

    public Iterator<E> iterator (){
        return mp.keySet().iterator();
    }

    public String toString(){
        return !mp.isEmpty()? mp.keySet().toString() : "[]";
    }
}