package Exceptions.dz.sem3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class UsersData {

    static String menu = ">> Формат ввода данных <<\n ФИО - фамилия имя отчество\n Дата рождения - дд.мм.гггг\n Пол - m/f\n\n -- для завершения введите quite --";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = menu;

        while (!line.equals("quite")) {
            StringBuilder sb = new StringBuilder("");
            System.out.println(line);

            try {
                line = scanner.nextLine();
                if (!checkFIO(line)) {
                    throw new RuntimeException("не верный формат ФИО: " + line);
                } else {
                    sb.append(line).append(" ");

                    line = scanner.nextLine();
                    if (!checkDate(line)) {
                        throw new DateFormatException(line);
                    } else {
                        sb.append(line).append(" ");

                        line = scanner.nextLine();
                        if (!checkPhoneNumber(line)) {
                            throw new RuntimeException("не верный формат номера: " + line);
                        } else {
                            sb.append(getPhoneNumber(line)).append(" ");

                            line = scanner.nextLine();
                            if (!checkGender(line)) {
                                throw new RuntimeException("введен не верный формат пола: " + line);
                            } else {
                                sb.append("- ");
                                if (line.toLowerCase().equals("m"))
                                    sb.append(" М");
                                else
                                    sb.append(" Ж");
                            }
                        }
                    }
                }
                String path = sb.toString().split(" ")[0] + ".txt";

                if (checkFile(path)) {
                    File file = new File(path);
                    try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream(file, true), "UTF-8"))) {
                        bw.newLine();
                        bw.append(sb.toString());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Данные обновлены");

                } else {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

                        bw.write(sb.toString());
                    } catch (IOException e) {
                        // TODO: handle exception
                    }
                    System.out.println("Добавлены новые данные");
                }

            } catch (DateFormatException e) {
                System.out.println(e.getMessage());
            } catch (RuntimeException e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }

        }

    }

    public static boolean checkFile(String path) {

        File f = new File(path);
        if (f.exists() && !f.isDirectory()) {
            return true;
        }
        return false;
    }

    static class DateFormatException extends RuntimeException {
        public DateFormatException(String date) {
            super("введен не верный формат даты: " + date);
        }

        public DateFormatException() {
            super("не верный формат даты ");
        }
    }

    public static boolean checkFIO(String fio) {

        String[] stringsFIO = fio.split(" ");

        if (stringsFIO.length != 3) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkDate(String date) {
        String[] strings = date.split("\\.");

        if (strings.length != 3) {
            return false;
        }
        if (Integer.parseInt(strings[0]) <= 0 || Integer.parseInt(strings[0]) > 31) {
            return false;
        }
        if (Integer.parseInt(strings[1]) <= 0 || Integer.parseInt(strings[1]) > 12) {
            return false;
        }
        if (Integer.parseInt(strings[2]) < 1920 || Integer.parseInt(strings[2]) > 2022) {
            return false;
        }
        return true;
    }

    public static boolean checkPhoneNumber(String num) {
        if (num.length() != 10) {
            return false;
        }
        return true;
    }

    public static String getPhoneNumber(String num) {
        StringBuilder sb = new StringBuilder("+7");

        sb.append(num);
        return sb.toString();
    }

    public static boolean checkGender(String gen) {

        if (gen.toLowerCase().equals("m") || gen.toLowerCase().equals("f")) {
            return true;
        }
        return false;
    }
}
