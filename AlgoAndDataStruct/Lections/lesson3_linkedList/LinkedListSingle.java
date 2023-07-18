package AlgoAndDataStruct.Lections.lesson3_linkedList;

public class LinkedListSingle {

    Node head;

    // добавление в стек
    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    // извлечение из стека
    public Integer pop() {

        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    // разворот односвязного списка
    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, previousNode);
        }
        currentNode.next = previousNode;
        // previousNode.next = null;
    }

    public class Node {
        int value;
        Node next;
    }
}
