package dz.sem4;

import java.util.*;

/*
 * IndexSorting
 * 
 * 1. Организовать ввод и хранение данных пользователей. ФИО возраст и пол
 * 2. вывод в формате Фамилия И.О. возраст пол
 * 3 добавить возможность выхода или вывода списка отсортированного по возрасту!)
 * 4 *реализовать сортировку по возрасту с использованием индексов
 * 5 *реализовать сортировку по возрасту и полу с использованием индексов
 */

 /*
Иванов иван иванович 33 м
Сидоров сидор сидорович 22 м
Смирнова алевтина игоревна 55 ж
петров петр петрович 21 м
Яковлева Анна Петровна 36 ж
Бодров Иван Романович 80 м
Павлова Светлана николаевна 32 ж
*/

public class IndexSorting {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> surname = new ArrayList<String>();
    static ArrayList<String> name = new ArrayList<String>();
    static ArrayList<String> lastName = new ArrayList<String>();
    static ArrayList<Integer> age = new ArrayList<Integer>();
    static ArrayList<Boolean> gender = new ArrayList<Boolean>();

    static int[] sortByAge(ArrayList<Integer> ages){
        int[] sortedIdx = new int[ages.size()];
        int[] values = new int [sortedIdx.length];
        for (int i = 0; i < ages.size(); i++) {
            sortedIdx[i] = i;
            values[i] = ages.get(i);
        }
        int vTemp;
        int iTemp;
        for (int i = 0; i < values.length - 1; i++) {
            for(int j = 0; j < values.length - i - 1; j++) {
                if(values[j] > values[j + 1]) {
                    vTemp = values[j];          iTemp = sortedIdx[j];
                    values[j] = values[j + 1];  sortedIdx[j] = sortedIdx[j + 1];
                    values[j + 1] = vTemp;      sortedIdx[j + 1] = iTemp;
                }
            }
        }
        return sortedIdx;
    }

    public static void main(String[] args) {
        
        while (true) {

            System.out.println("\n" +
                    "Команды для сортировок 'age', 'age&gen'\n" +
                    "Введите данные в формате ФИО, возрасе, пол: ");
            String line = scanner.nextLine();
            if(line.equals("q")){
                System.exit(0);
            }else if (line.split( " ").length == 5){
                surname.add(line.split(" ")[0]);
                name.add(line.split(" ")[1]);
                lastName.add(line.split(" ")[2]);
                age.add(Integer.parseInt(line.split(" ")[3]));
                gender.add(line.split(" ")[4].toLowerCase().contains("м"));

                for (int i = 0; i < surname.size(); i++){
                    String gen = gender.get(i) ? "м" : "ж";
                    System.out.printf(" %s %s. %s. %s, %s.\n",
                            surname.get(i),
                            name.get(i).toUpperCase().charAt(0),
                            lastName.get(i).toUpperCase().charAt(0),
                            age.get(i),
                            gen);
                }
            }


            if(line.equals("age")){
                int [] sorted = sortByAge(age);
                for(int i: sorted) {
                    System.out.printf(" %s %s. %s. %s.\n",
                            surname.get(i),
                            name.get(i).toUpperCase().charAt(0),
                            lastName.get(i).toUpperCase().charAt(0),
                            age.get(i));
                }
            }

            if(line.equals("age&gen")){
                int [] sorted = sortByAge(age);
                for (int i = 0; i < sorted.length - 1; i++) {
                    for (int j = 0; j < sorted.length - i - 1; j++) {
                        if(!gender.get(sorted[j])) {
                            int temp = sorted[j];
                            sorted[j] = sorted[j + 1];
                            sorted[j + 1] = temp;
                        }
                    }
                }

                for(int i: sorted) {
                    String gen = gender.get(i) ? "м" : "ж";
                    System.out.printf(" %s %s. %s. %s, %s.\n",
                            surname.get(i),
                            name.get(i).toUpperCase().charAt(0),
                            lastName.get(i).toUpperCase().charAt(0),
                            age.get(i),
                            gen);
                }
            }
        }
    }
}