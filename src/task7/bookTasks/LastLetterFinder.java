package task7.bookTasks;

/*  Задание 20 (Book, Part 2, P. 13).  Имеется строка с текстом. Вывести текст, составленный из последних букв
                                       всех слов.*/

public class LastLetterFinder {

    public static void main(String[] args) {

        String text = "time off - a period of time when you do not work because of illness or holidays, " +
                "or because your employer has given you permission to do something else; ";

        text = text.trim();
        String[] words = text.split("\\s*(\\s|,|!|-|;|\\.)\\s*");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].charAt((words[i].length()) - 1));
        }
    }
}

