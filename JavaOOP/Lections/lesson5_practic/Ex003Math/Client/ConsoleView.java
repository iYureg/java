package JavaOOP.Lections.lesson5_practic.Ex003Math.Client;

import JavaOOP.Lections.lesson5_practic.Ex003Math.Core.Views.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
