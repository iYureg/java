package JavaOOP.Lections.lesson3_standardInterfaces.Ex4_comparator;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }

}