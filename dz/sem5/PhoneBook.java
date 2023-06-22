package dz.sem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * phoneBook
 * 
 * маша 12345
 * петя 123456
 * маша 4321
 * коля 543210
 * вася 76544321
 * коля 89384958
 * петя 654321
 * маша 09876543210
 */
public class PhoneBook {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        // Map<String,ArrayList<String>> phoneBook = new LinkedHashMap<String,ArrayList<String>>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Формат ввода: <<имя телефон>>\n" + "<< Завершить -> 'q' >>\n\n");
            String line = scanner.nextLine();
            if(line.equals("q")) System.exit(0);

            String name = line.split(" ")[0];
            String phone = line.split(" ")[1];
            
            if(!phoneBook.containsKey(name)){
                ArrayList<String> phones = new ArrayList<String>();
                phoneBook.put(name, phones);
                phones.add(phone);
            }else{
                ArrayList<String> phones = phoneBook.remove(name);
                phones.add(phone);
                phoneBook.put(name, phones);
            }

            ArrayList<Map.Entry<String, ArrayList>> sorted = new ArrayList(phoneBook.entrySet());
            
            Collections.sort(sorted, new Comparator<Map.Entry<String, ArrayList>>() {
                @Override public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
                    return o2.getValue().size() - o1.getValue().size();
                }
            });

            for(Map.Entry<String, ArrayList> elem: sorted){
                System.out.printf("Имя: %s Teл: %s\n",elem.getKey(), elem.getValue());
            }
        }
    }
}