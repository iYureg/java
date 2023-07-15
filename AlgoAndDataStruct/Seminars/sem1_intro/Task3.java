package AlgoAndDataStruct.Seminars.sem1_intro;

/*
 * 1. Необходимо написать алгоритм поиска всех доступных комбинаций
 * (посчитать количество) для количества кубиков K с количеством граней N.
 * 2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
 * ограничено (4 кубика, например), либо их количество будетдинамическим. Выбор за вами.
 * 3. Если вы реализуете простой вариант, обращает внимание, что данное
 * решение имеет сложность O(n4), но если количество кубиков сделать
 * переменной, то она трансформируется в O(nk), что будет представлять
 * собой экспоненциальную сложность. Для второго решения очевидно, что
 * его сложность O(nk) с самого начала.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(resultsCounter(6));
        System.out.println(recursiveCounter(1, 4, 6));
    }

    public static int resultsCounter(int faces) {

        int count = 0;
        for (int i = 0; i < faces; i++) {
            for (int j = 0; j < faces; j++) {
                for (int k = 0; k < faces; k++) {
                    for (int l = 0; l < faces; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // экспоненциальная сложность O(n^k)
    public static int recursiveCounter(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 0; i < faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }
}
