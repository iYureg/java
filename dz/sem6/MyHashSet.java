package dz.sem6;

import java.util.HashMap;
import java.util.Iterator;

/**
 * ДЗ
 * Разработать программу, имитирующую поведение коллекции HashSet.
 * В программе содать метод add добавляющий элемент, метод toString возвращающий
 * строку с элементами множества
 * и метод позволяющий читать элементы по индексу.
 * Реализовать все методы из семинара.
 * Формат данных Integer.
 */
public class MyHashSet {

    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        System.out.println("add 9 -> " + mySet.add(9));
        System.out.println("add 9 -> " + mySet.add(9));
        System.out.println("size -> " + mySet.size());
        System.out.println("isEmpty -> " + mySet.isEmpty());
        System.out.println("remove 9 -> " + mySet.remove(9));
        System.out.println("remove 9 -> " + mySet.remove(9));
        System.out.println("size -> " + mySet.size());
        System.out.println("isEmpty -> " + mySet.isEmpty());

        System.out.println("add 9 -> " + mySet.add(9));
        System.out.println("add 6 -> " + mySet.add(6));
        System.out.println("add 3 -> " + mySet.add(3));

        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(mySet.toString());
        System.out.println(mySet.get(1));

    }
}

class MySet<E> {
    private HashMap<E, Object> mp = new HashMap<E, Object>();
    private static final Object OBJECT = new Object();

    public boolean add(E num) {
        return mp.put(num, OBJECT) == null;
        // if(!mp.containsKey(num)){
        // mp.putIfAbsent(num, OBJECT);
        // return true;
        // }
        // return false;
    }

    public boolean remove(E num) {
        return mp.remove(num) != null;
    }

    public int size() {
        return mp.size();
    }

    public boolean isEmpty() {
        return mp.size() == 0;
    }

    public Iterator<E> iterator() {
        return mp.keySet().iterator();
    }

    public String toString() {
        return !mp.isEmpty() ? mp.keySet().toString() : "[]";
    }

    public Object get(int index) {
        return !mp.isEmpty() && mp.size() > index && index >= 0 ? mp.keySet().toArray()[index] : null;
        // return !mp.isEmpty() && mp.size() > index ?
        // Integer.parseInt(mp.keySet().toArray()[index].toString()) : null;
    }
}