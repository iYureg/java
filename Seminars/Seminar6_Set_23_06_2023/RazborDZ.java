package Seminars.Seminar6_Set_23_06_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class RazborDZ {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
//        addNumber(map, "Ivan", "123");
//        addNumber(map, "Ivan", "234");
//        addNumber(map, "Ivan", "345");
//        addNumber(map, "Petr", "456");
//        addNumber(map, "Petr", "567");
//        addNumber(map, "Anna", "456");

        map.merge("Ivan", "123", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "234", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "345", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Petr", "456", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Petr", "567", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Anna", "456", (o, n) -> o == null ? n : o + " " + n);

        System.out.println(map);

        ArrayList<String> list = new ArrayList<>();
        for(String s : map.keySet()){
            list.add(s);
        }

        Collections.sort(list, (o1, o2) -> map.get(o2).split(" ").length - map.get(o1).split(" ").length);


//        Collections.sort(list, (o1, o2) -> map.get(o2).split(" ").length - map.get(o1).split(" ").length);

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return map.get(o2).split(" ").length - map.get(o1).split(" ").length;
//            }
//        });

        for(String s : list){
            System.out.println(s + " - " + map.get(s));
        }
    }

//    private static void addNumber(HashMap<String, ArrayList<String>> map, String name, String number){
//        map.putIfAbsent(name, new ArrayList<>());
//        map.get(name).add(number);
//    }
}