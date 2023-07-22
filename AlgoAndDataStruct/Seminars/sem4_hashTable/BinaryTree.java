package AlgoAndDataStruct.Seminars.sem4_hashTable;

public class BinaryTree<V extends Comparable<V>> {

    private Node root;

    class Node {
        private V value;
        private Node lCh;
        private Node rCh;
    }

    public boolean find(V value) {
        Node rNode = root;
        while (rNode != null) {
            if (rNode.value.equals(value))
                return true;
            if (rNode.value.compareTo(value) > 0)
                rNode = rNode.lCh;
            else
                rNode = rNode.rCh;
        }
        return false;
    }
}
