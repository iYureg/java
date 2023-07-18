package AlgoAndDataStruct.Seminars.sem3_linkedLists;

/*
 * Задание 1 
 * 1.Реализуем простой односвязный список.
 * 2.Пишем только структуру, никаких методов не требуется. 
 * 
 * Задание 2 
 * Реализуем метод добавления новых элементов в начало списка и удаление
 * первого элемента связного списка.
 * 
 * Задание 3 
 * Реализуем метод поиска элемента в односвязном списке для проверки наличия
 * элемента внутри списка.
 * 
 * Задание 4 
 * Реализуем метод добавления новых элементов в конец списка и удаление
 * последнего элемента связного списка.
 * 
 * Задание 5
 * 1. Расширяем структуру связного списка до двухсвязного.
 * 2. Обновляем методы согласно новой структуре. 
 */
public class List<T> {

    private Node head;

    public void addLast(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;

            }
            last.next = node;
        }
    }

    public void removeLast() {
        if (head != null) {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {

                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }

    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
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
    }

}
