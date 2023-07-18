package AlgoAndDataStruct.dz.sem3;

/*
 * 1.Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
 * 2.Доп Задача.Добавляем метод сортировки для связного списка.
 */
public class DoublyLinkedList {

    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node prev;
        private Node next;
    }

    /* ((1)) */
    public void reverse() {
        Node node = head;

        while (node != null) {
            Node nextNode = node.next;
            Node prevNode = node.prev;
            node.next = prevNode;
            node.prev = nextNode;
            if (prevNode == null) {
                tail = node;
            }
            if (nextNode == null) {
                head = node;
            }
            node = nextNode;
        }
    }

    /* ((2)) */
    public void bubbleSort() {

        boolean flag;
        Node prevNode;
        Node lastNode = null;
        Node firstNode = head;

        do {
            flag = false;
            prevNode = firstNode;

            while (prevNode.next != lastNode) {
                if (prevNode.value > prevNode.next.value) {
                    int temp = prevNode.value;
                    prevNode.value = prevNode.next.value;
                    prevNode.next.value = temp;
                    flag = true;
                }
                prevNode = prevNode.next;
            }
            lastNode = prevNode;
        } while (flag);
    }
}
