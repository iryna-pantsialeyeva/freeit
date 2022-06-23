package task4;
/* Написать 5 способов создания/получения строки*/

public class FiveWayToCreateString {
    public static void main(String[] args) {

        String string1 = new String("1st way to create a string");

        String string2 = "2nd way to create a string";

        // 3rd way to create a string
        String string3 = string1 + string2;

        StringBuilder string4 = new StringBuilder("4th way to create a string");

        String string5 = string4.replace(0, 2, "5th").toString();

    }
}
