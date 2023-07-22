package AlgoAndDataStruct.Lections.lesson4_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        final BinaryTree tree = new BinaryTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println("finish");
                } catch (Exception ingnored) {

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
