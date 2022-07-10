package task7.bookTasks;

/* Задание 21 (Book, Part 2, P. 15). Напишите три цикла выполняющих многократное сложение строк,
                                     один с помощью оператора сложения и String,
                                     другой с помощью StringBuilder и метода append,
                                     а также аналогино для StringBuffer. Сравните скорость их выполнения.*/

public class ArrayAppend {

    public static void main(String[] args) {

        String text = "Java class StringTokenizer allows an application to break a string into tokens";

        text = text.trim();
        String[] words = text.split("\\W");

        // first way - with addition operator and String
        String appendWord1 = new String();
        String temp;

        for (int i = 0; i < words.length; i++) {
            temp = words[i];
            appendWord1 = appendWord1 + temp;
        }
        System.out.println(appendWord1);

        // second way - with StringBuilder and append method
        StringBuilder appendWord2 = new StringBuilder();

        for (String word : words) {
            appendWord2.append(word);
        }
        System.out.println(appendWord2.toString());

        // third way - with StringBuffer and append method
        StringBuffer appendWord3 = new StringBuffer();

        for (String word : words) {
            appendWord3.append(word);
        }
        System.out.println(appendWord3.toString());

        System.out.println("StringBuilder works faster than two other options.");
    }
}

