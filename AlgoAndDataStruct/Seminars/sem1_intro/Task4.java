package AlgoAndDataStruct.Seminars.sem1_intro;

/*
 * Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
 * 
 * 1. Считаем, что 1 и 2 значения последовательности равны 1. 
 * Искать будем по формуле On=On-1+On-2 что предполагает использовать рекурсивного алгоритма.
 * 
 * 2.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот раз
 * откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
 * линейную сложность, т.к. вычисление каждого из чисел последовательности будет происходить ровно 1 раз.
 * 
 * 3.Вариантов решения может быть несколько, но нужно предложить студентам считать
 * последовательность с первого числа и далее до тех пор, пока не доберемся до
 * нужного номера. При этом значение предыдущих элементов нужно сохранять, чтобы
 * не приходилось вычислять заново, как это происходило при рекурсивном методе.
 * 
 * 4.Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
 * Фибоначчи и определить, какой из них работает быстрее. Так различия
 * начнутся уже с 40 члена последовательности.
 */
public class Task4 {
    public static void main(String[] args) {

        test();
    }

    // сложность O(2^n)
    public static int recFibo(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 1;
        }
        return recFibo(num - 1) + recFibo(num - 2);
    }

    public static int fibo(int num) {

        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i < num; i++) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }

    // O(n)
    public static int fbArray(int num) {
        if (num <= 2) {
            return 1;
        } else {
            final int[] numbers = new int[num];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];

            }
            return numbers[num - 1];
        }
    }

    public static void test() {
        for (int i = 5; i <= 45; i = i + 5) {
            long recDuration = System.currentTimeMillis();
            recFibo(i);
            recDuration = System.currentTimeMillis() - recDuration;

            long lineduration = System.currentTimeMillis();
            fbArray(i);
            lineduration = System.currentTimeMillis() - lineduration;

            System.out.printf("i: %s, recFibo duration: %sms, line method duration: %sms\n", i,
                    recDuration,
                    lineduration);
        }
    }
}
