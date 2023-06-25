package dz.sem1;


import java.util.Random;

/**
 * RandomNum
 */
public class RandomNum {

    
    public static void main(String[] args) {
                    
        int i = getRandomNum(2000);
        System.out.println("случайное число: " + i);
        int n = getHighBit(i);
        System.out.println("номер старшего бита числа - " + i + " - " + n);
        int[] m1 = getMulipliers(n, i);
        System.out.println("Кратные числу " + n + " длина - " + m1.length + " случайный элемент - " + m1[new Random().nextInt(m1.length)]);
        int[] m2 = getNotMult(n, i);
        System.out.println("Не делятся на " + n + " длина - " + m2.length + " случайный элемент - " + m2[new Random().nextInt(m2.length)]);
    }

    static int getRandomNum(int f){
        Random r = new Random();
        int result = r.nextInt(0, f+1);
        return result; 
    }

    static int getHighBit(int n){
        int highBit = Integer.toBinaryString(n).length();
        return highBit;
    }

    static int[] getMulipliers(int n, int num){
        int arrLength = 0;
        for (int i = num; i < Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                arrLength++;
            }
        }
        
        int[] array = new int[arrLength];
        int count = 0;
        for (int i = num; i < Short.MAX_VALUE; i++) {
            if(i % n == 0){
                array[count++] = i;
            }
        }
        return array;
    }

    static int[] getNotMult(int n, int num){
        int arrLength = 0;
        for (int i = Short.MIN_VALUE; i < num; i++) {
            if (i % n != 0) {
                arrLength++;
            }
        }
        
        int[] array = new int[arrLength];
        int count = 0;
        for (int i = Short.MIN_VALUE; i < num; i++) {
            if(i%n != 0){
                array[count++] = i;
            }
        }
        return array;
    }
}