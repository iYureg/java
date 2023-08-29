package ToyStore;

import ToyStore.data.Toy;
import ToyStore.exception.quantityException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

import ToyStore.data.Store;

public class Program {

    static Store store = generate(10);
    static String menu = "\n\n\n      ---- Меню ----\n 1. Показать список игрушек.\n 2. Добавить случайную игрушку в корзину.\n 3. Показать корзину.\n 4. Забрать игрушку.\n 5. Завершить работу.";

    public static void main(String[] args) {

        Random r = new Random();
        String choice = "";
        Scanner scanner = new Scanner(System.in);

        while (choice != null) {
            System.out.println(menu);

            switch (scanner.nextLine()) {
                case "1":
                    store.forEach(toy -> System.out.println(toy.getInfo()));
                    break;

                case "2":
                    try {
                        int random = r.nextInt(0, 10);
                        store.addToCart(random);
                        System.out.println(store.get(random).getName() + " Добавлена в корзину");

                    } catch (quantityException e) {
                        System.out.println(e.getMessage() + "попробуйте еще раз");
                    }
                    break;

                case "3":
                    if (!store.cart.isEmpty()) {
                        store.cart.forEach(v -> System.out.println(v));
                    } else {
                        System.out.println("Корзина пуста");
                    }
                    break;
                case "4":
                    if (!store.cart.isEmpty()) {
                        File file = new File("delivery.txt");
                        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(file, true), "UTF-8"))) {
                            bw.append(store.cart.remove(store.cart.size() - 1));
                            bw.newLine();
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Корзина пуста");
                    }
                    break;
                case "5":

                    choice = null;
            }
        }

    }

    public static Store generate(int size) {
        Store storeList = new Store();

        for (int i = 0; i < size; i++) {
            storeList.add(new Toy("Name_" + i));
        }
        return storeList;
    }
}
