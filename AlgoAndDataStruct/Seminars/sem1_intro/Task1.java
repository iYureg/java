package AlgoAndDataStruct.Seminars.sem1_intro;

/*
* Необходимо написать алгоритм, считающий сумму всех чисел
* от 1 до N. Согласно свойствам линейной сложности,
* количество итераций цикла будет линейно изменяться
* относительно изменения размера N. 
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println(getSum(10034));
    }

    // линейная сложность O(n)
    public static int getSum(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }
        return result;
    }
}
