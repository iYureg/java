package dz.sem2;

/*
    Дана json-строка (можно сохранить в файл и читать из файла)
    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    Написать метод(ы), который распарсит json и, используя StringBuilder,
    создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
    Пример вывода:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
*/
public class Students {
    static String data = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    public static void main(String[] args) {

        String[] str = "Студент получил по предмету".split(" ", 3);
        String[] studs = myHoneyJsonParser(data).toString().split("},");
        for (int i = 0; i < studs.length; i++) {
            String[] fields = studs[i].split(",");
            StringBuilder result = new StringBuilder("");
            for (int j = 0; j < fields.length; j++) {

                result
                        .append(str[j])
                        .append(new StringBuilder(fields[j]
                                .replace("\"", " "))
                                .delete(0, fields[j].indexOf(":") + 1));
            }
            System.out.println(result
                    .delete(result.lastIndexOf(" "), result.lastIndexOf(" ") + 1)
                    .append("."));
        }
    }

    static StringBuilder myHoneyJsonParser(String s) {
        StringBuilder result = new StringBuilder(s);
        result
                .delete(result.indexOf("["), result.indexOf("[") + 1)
                .delete(result.lastIndexOf("]"), result.lastIndexOf("]") + 1)
                .replace(result.indexOf("{"), result.indexOf("{") + 1, "")
                .replace(result.indexOf("{"), result.indexOf("{") + 1, "")
                .replace(result.indexOf("{"), result.indexOf("{") + 1, "")
                .delete(result.lastIndexOf("}"), result.lastIndexOf("}") + 1);

        return result;
    }
}
