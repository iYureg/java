package dz.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


/**
 * ArrayListing
 * 
 * Задание
 * Пусть дан произвольный список целых чисел.
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 */
public class ArrayListing {

    public static void main(String[] args) throws Exception {
        try{
            Random rnd =  new Random();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 50; i++) {
                list.add(i,rnd.nextInt(0,101));
            }
            
            System.out.println(list);

            list = delEvens(list);     // 1)
            System.out.println(list);

            showMinValue(list);       // 2)

            int maxValue = getMaxValue(list);   // 3)
            System.out.println("Максимальное значение -> " + maxValue);

            System.out.println("Среднее арифметическое -> " + getMidMath(list));

        }finally{
            System.out.println("to be continued ...");
        }     
    }

    static ArrayList<Integer> delEvens(ArrayList<Integer> data){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i)%2 != 0) result.add(data.get(i));;
        }

        return result;
    }

    static void showMinValue(ArrayList<Integer> data){
        int min = data.get(0);
        for (Integer elem : data) {
            min = elem < min? elem : min;
        }
        System.out.println("Минимальное занчение -> " + min);
    }

    static int getMaxValue(ArrayList<Integer> data){
        int max = 0;
        Iterator<Integer> values = data.iterator();
        while (values.hasNext()) {
            int temp = values.next();
            if(temp > max) max = temp;
        }

        return max;
    }

    static int getMidMath(ArrayList<Integer> data){
        int result = 0;
        for (Integer elem : data) {
            result += elem;
        }
        return result / data.size();
    }
}