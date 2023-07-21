package AlgoAndDataStruct.dz.sem4;

public class RedBlackTree {

    private Node root;

    private class Node {
        private int value;
        private Color color;
        private Node lCh;
        private Node rCh;
    }

    public boolean add(int value) {
        if (root != null) {
            boolean temp = addNode(root, value);
            root = balance(root);
            root.color = Color.black;
            return temp;
        } else {
            root = new Node();
            root.color = Color.black;
            root.value = value;
            return true;
        }
    }

    private Node balance(Node node) {
        Node temp = node;
        boolean isBalance;
        do {
            isBalance = false;
            if (temp.rCh != null
                    && temp.rCh.color == Color.red
                    && (temp.lCh == null || temp.lCh.color == Color.black)) {
                isBalance = true;
                temp = turnRight(temp);
            }
            if (temp.lCh != null
                    && temp.lCh.color == Color.red
                    && temp.lCh.lCh != null
                    && temp.lCh.lCh.color == Color.red) {
                isBalance = true;
                temp = turnLeft(temp);
            }
            if (temp.lCh != null
                    && temp.lCh.color == Color.red
                    && temp.rCh != null
                    && temp.rCh.color == Color.red) {
                isBalance = true;
                changeColor(temp);
            }
        } while (isBalance);
        return temp;
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.lCh != null) {
                    boolean flag = addNode(node.lCh, value);
                    node.lCh = balance(node.lCh);
                    return flag;
                } else {
                    node.lCh = new Node();
                    node.lCh.color = Color.red;
                    node.lCh.value = value;
                    return true;
                }
            } else {
                if (node.rCh != null) {
                    boolean flag = addNode(node.rCh, value);
                    node.rCh = balance(node.rCh);
                    return flag;
                } else {
                    node.rCh = new Node();
                    node.rCh.color = Color.red;
                    node.rCh.value = value;
                    return true;
                }
            }
        }
    }

    private Node turnRight(Node node) {
        Node rCh = node.rCh;
        Node tempCh = rCh.lCh;
        rCh.lCh = node;
        node.rCh = tempCh;
        rCh.color = node.color;
        node.color = Color.red;
        return rCh;
    }

    private Node turnLeft(Node node) {
        Node lCh = node.lCh;
        Node tempCh = lCh.rCh;
        lCh.rCh = node;
        node.lCh = tempCh;
        lCh.color = node.color;
        node.color = Color.red;
        return lCh;
    }

    private void changeColor(Node node) {
        node.rCh.color = Color.black;
        node.lCh.color = Color.black;
        node.color = Color.red;
    }
}
