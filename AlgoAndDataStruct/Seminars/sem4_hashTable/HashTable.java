package AlgoAndDataStruct.Seminars.sem4_hashTable;

import AlgoAndDataStruct.Lections.lesson3_linkedList.LinkedList.Node;
import AlgoAndDataStruct.Seminars.sem3_linkedLists.List;

public class HashTable<K, V> {

    private final int SIZE = 10;
    private int length = 0;
    private double loadFactor = 0.75;
    List[] list;

    public HashTable(int size) {
        list = (List[]) new Object[size];
    }

    public HashTable() {
        list = (List[]) new Object[SIZE];
    }

    public V find(K key) {
        int index = calcBucketIndex(key);
        if (list[index] != null) {
            return list[index].getValue(key);
        }
        return null;
    }

    public boolean addItem(K key, V value) {
        if (list.length * loadFactor < length) {
            recalcBucketIndex();
        }

        Entity newEntity = new Entity();
        newEntity.key = key;
        newEntity.value = value;
        int index = calcBucketIndex(key);
        List item = list[index];
        if (item == null) {
            item = new List();
            list[index] = item;
        }
        boolean flag = list[index].add(newEntity);
        if (flag) {
            length++;
        }
        return flag;
    }

    public boolean removeItem(K key) {
        int index = calcBucketIndex(key);
        boolean flag = list[index].remove(key);
        if (flag) {
            length--;
        }
        return flag;
    }

    public void recalcBucketIndex() {
        List[] oldList = list;

        list = (List[]) new Object[oldList.length + (oldList.length / 2)];

        for (int i = 0; i < oldList.length; i++) {
            List item = oldList[i];
            List.Node node = item.head;
            while (node != null) {
                addItem(node.data.key, node.data.value);
                node = node.next;
            }
            oldList[i] = null;
        }
    }

    public int calcBucketIndex(K key) {
        return key.hashCode() % list.length;
    }

    class Entity {
        private K key;
        private V value;
    }

    class List {
        private Node head;

        class Node {
            private Entity data;
            private Node next;
        }

        public V getValue(K key) {
            Node node = head;
            while (head.next != null) {
                Node next = new Node();
                if (next.data.key.equals(key)) {
                    return next.data.value;
                }
                node = node.next;
            }
            return null;
        }

        public boolean add(Entity item) {

            Node node = head;
            while (node != null) {
                if (node.data.key.equals(item.key)) {
                    return false;
                }
                if (node.next == null)
                    break;
                node = node.next;
            }

            Node newNode = new Node();
            newNode.data = item;
            node.next = newNode;
            return true;
        }

        public boolean remove(K key) {
            Node node = head;
            Node prevNode = head;
            if (head != null) {
                if (head.data.key.equals(key)) {
                    head = head.next;
                    return true;
                }
            }
            while (node != null) {
                if (node.data.key.equals(key)) {
                    prevNode.next = node.next;
                    return true;
                }
                prevNode = node;
                node = node.next;
            }
            return false;
        }
    }
}
