package AlgoAndDataStruct.Lections.lesson4_tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private Node root;

    // // обход дерева в глубину с помощью рекурсии
    // public boolean exist(int value) {
    // if (root != null) {
    // Node node = find(root, value);
    // if (node != null) {
    // return true;
    // }
    // }
    // return false;
    // }

    // private Node find(Node node, int value) {
    // if (node.value == value) {
    // return node;
    // } else {
    // for (Node child : node.children) {
    // Node result = find(child, value);
    // if (result != null) {
    // return result;
    // }
    // }
    // }
    // return null;
    // }

    // обход в ширину
    private Node find(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;

    }

    private class Node {
        private int value;
        private List<Node> children;

    }

}
