package task7.bookTasks;

/*Задание 18 (Book, Part 2, P. 13). Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
                                    общее их количество.*/

public class PunctuationMarksCalculator {

    public static void main(String[] args) {

        String text = "Java является объектно-ориентированным языком, поэтому такие понятия как \"класс\" и " +
                "\"объект\" играют в нем ключевую роль. Любую программу на Java можно представить как набор " +
                "взаимодействующих между собой объектов. *Metanit";

        int number = 0;
        char symbol;

        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i); // take each symbol of text
            if (symbol == ',' || symbol == '.' || symbol == '-' || symbol == '!' || symbol == '?') {
                number++;
            }
        }

        System.out.println("The text consists " + number + " punctuation marks");
    }
}
