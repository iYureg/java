package AlgoAndDataStruct.Seminars.sem3_linkedLists;

/* Задание 5
 * 1. Расширяем структуру связного списка до двухсвязного.
 * 2. Обновляем методы согласно новой структуре. 
 */
public class DoublyLinked<T> {

    private Node head;
    private Node tail;

    public void addLast(T value) {
        Node node = new Node();
        node.value = value;
        if (tail != null) {
            node.prev = tail;
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
    }

    public void removeLast() {
        if (tail != null && tail.prev != null) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            head = null;
            tail = null;
        }

    }

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }

    public void removeFirst() {
        if (head != null && head.next != null) {
            head.next.prev = null;
            head = head.next;
        } else {
            head = null;
            tail = null;
        }

    }

    public boolean isIn(T value) {

        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private class Node {
        private T value;
        private Node next;
        private Node prev;
    }

}