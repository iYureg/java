package dz.sem2;

//        Дана строка sql-запроса "select * from students where ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
public class BuildWhere {
    static String data = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

    public static void main(String[] args) {

        String[] strs;
        strs = new StringBuilder(data
                .replace("{", "")
                .replace("}", ""))
                .toString()
                .split(",");

        String request = "select * from students where ";
        StringBuilder sb = new StringBuilder(request);
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].contains("null")) {
                sb.append(strs[i].replace(":", "='").replace("\"", ""))
                        .append("' AND");

            }
        }
        request = sb.delete(sb.length() - 4, sb.length()).toString();
        System.out.println(request);
    }
}