public class Seminar2 {
    public static void main(String[] args) {
        String s = "!Привет!";
        String s1 = "Привет world! ";
//        s1 = s;
        Throwable t = new Throwable();
        Throwable t1 = new Throwable();
        System.out.println(s);
        System.out.println(t == t1);
        System.out.println(s.contains("рив")); // проверка на присутствие последовательности символов в строке true/false
        System.out.println(s.equals(s1)); // сравнение - возвращает true/false
        System.out.println(s.repeat(3).toLowerCase()); // повторение строка.repeat(кол-во повторений
        System.out.println(s.charAt(s.length()/2)); // возвращает символ по индексу
        System.out.println(s.indexOf("!")); // индекс первого найденного символа слева
        System.out.println(s.indexOf("!", s.indexOf("!"))); // индекс второго найденного символа слева
        System.out.println(s.lastIndexOf("!", s.lastIndexOf("!"))); // второй справа
        System.out.println(s.repeat(5).replace("!","?"));
        System.out.println(s.repeat(5).replace("!",""));
        System.out.println(s.replaceFirst("!",""));

        String[] str = s1.repeat(5).split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("------------");
        System.out.println(s.substring(s.length()/2, s.length()-1));
        System.out.println(s1.substring(s1.length()/2, s1.length()-1));

    }
}
