import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Ex4_LinkedHashSet
 * 
 * ● В основе HashMap.
 * ● Помнит порядок.
 * Использовать, когда нужен HashSet с запоминанием порядка элемента.
 * 
 * isEmpty() – проверка на пустоту.
 * add(V) – добавление элемента в коллекцию.
 * remove(V) – удаление элемента из коллекцию.
 * contains(V) – проверка на включение элемента в коллекции.
 * clear() – удаление всех элементов коллекции.
 * size() – возвращает количество элементов коллекции.
 */
public class Ex4_LinkedHashSet {

    public static void main(String[] args) {
        var a = new LinkedHashSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new LinkedHashSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));
        a.add(28);
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
    }
}
