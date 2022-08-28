package task7.bookTasks;

/* Задание 22 (Book, Part 2, P. 19). Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
                                     записаных по правилам Java, с помощью регулярных выражений и вывести их на
                                     страницу.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexadecimalNumberFinder {

    public static void main(String[] args) {

        int integer1 = 1678;
        int integer2 = 15;
        int integer3 = 0;
        int integer4 = -180;
        int integer5 = 19462;

        // represent integers on hexadecimal string (method toHexString(int))
        String hexString = Integer.toHexString(integer1) + "... " + Integer.toHexString(integer2) + "         " +
                Integer.toHexString(integer3) + " :^) " + Integer.toHexString(integer4) + " ^-) " +
                Integer.toHexString(integer5);

        // System.out.println(hexString); // for quick check

        Pattern regexTemplate = Pattern.compile("[\\dA-Fa-f]+");
        Matcher matcher = regexTemplate.matcher(hexString);

        int index = 0;
        while (matcher.find()) {
            index++;
            System.out.println("Hexadecimal " + index + " :" + (matcher.group()));
        }
    }
}
