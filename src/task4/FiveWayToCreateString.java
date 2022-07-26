package task4;
/* Написать 5 способов создания/получения строки*/

public class FiveWayToCreateString {
    public static void main(String[] args) {

        String string1 = new String("1st way to create a string");

        String string2 = "2nd way to create a string";

        // 3rd way to create a string
        String string3 = string1 + string2;

        // 4th way to create a string - with constructor of class StringBuilder that takes a String
        // and makes new instance of class StringBuilder - new stringBuilder on the basis String
        // To create a String we need to transform instance of class StringBuilder to String object
        StringBuilder strBuilder = new StringBuilder("4th way ");
        String string4 = strBuilder.append("to create a string").toString();

        // 5th way to create a string
        String string5 = new String(new char[]{'a', 'd', 'd', 'e', 'd', ' ', '5', 't', 'h', ' ', 'w', 'a', 'y',
                ' ', 't', 'o',' ', 'c', 'r', 'e', 'a', 't', 'e', ' ', 'a', ' ', 's', 't', 'r', 'i', 'n', 'g',
                ':', '-', ')'}, 6, 26);
    }
}
