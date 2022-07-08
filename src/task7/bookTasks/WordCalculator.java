package task7.bookTasks;

/*Задание 19 (Book, Part 2, P. 13). Имеется строка с текстом. Посчитать количество слов в тексте. Желательно
                                    учесть, что слова могут разделяться несколькими пробелами, в начале и конце
                                    текста также могут быть пробелы, но могут и отсутствовать..*/

public class WordCalculator {

    public static void main(String[] args) {

        String text = " Все члены класса в языке Java - поля     и методы - имеют модификаторы доступа. " +
                "Модификаторы доступа позволяют задать допустимую область видимости для членов класса, " +
                "то есть контекст, в котором можно употреблять данную переменную  или метод. ";

        text = text.trim();
        String[] words = text.split("\\s*(\\s|,|!|-|\\.)\\s*");

        int numberWord = 0;
        for (String word : words) {
            numberWord++;
        }

        System.out.println("The text consists " + (numberWord) + " word(s).");
    }
}
