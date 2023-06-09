public class StrBldr {
    public static void main(String[] args) {

        String s = "Привет!";
        String s1 = "Привет world!";

        StringBuilder builder = new StringBuilder("Hello!");
        System.out.println(builder);

        builder = new StringBuilder(s);
        System.out.println(builder);

        s += builder.toString();
        System.out.println(s);

        builder     // добавление любых значений в любом количестве
                .append(0.34) // значения преобразуются в строку
                .append("+")
                .append(1.66)
                .append("=")
                .append(2.0f);
        System.out.println(builder);

        System.out.println(builder.indexOf("+")); // индекс элемента поиск слева
        System.out.println(builder.lastIndexOf("=")); // индекс элемента поиск поисл справа
        System.out.println(builder.charAt(11)); // возвращает символ по индексу
        System.out.println(builder.charAt(16)); // возвращает символ по индексу
        System.out.println(builder.reverse()); // разворот строки
        System.out.println(builder.replace(0,builder.length()/2, "&^&")); //3 параметра от куда, до куда, на что заменить
        System.out.println(builder.insert(0, "Привет!")); // сдвигает строку вправо и вставляет то, что указано во втором параметре
        System.out.println(builder.delete(builder.length()/2, builder.length()/2 + 3)); // удаляет кусок строки(от и до)

        String testStr = "";
        StringBuilder testBuilder = new StringBuilder("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            testStr += Character.getName(i);
        }
        System.out.println("String time: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            testBuilder.append(Character.getName(i));
        }

        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start));

        s1 = new StringBuilder(s1).reverse().toString();
        System.out.println(s1);

    }
}
