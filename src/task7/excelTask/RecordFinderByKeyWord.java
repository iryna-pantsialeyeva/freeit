package task7.excelTask;

/* Задание из Excel для class7. Написать в классе записной книжки метод, который выводит в консоль название всех дел/
                                сами дела, в которых есть переданное в этот метод в качестве аргумента слово */

import java.util.Scanner;

public class RecordFinderByKeyWord {
    public static void main(String[] args) {

        Record record1 = new Record("English", "Решить тест по English (Unit 3)");
        Record record2 = new Record("Work", "Подготовить 2 регдосье по Миофолик, Прегна5 для Монголии");
        Record record3 = new Record("Java", "Закрыть все долги по таскам Java");

        // 1. создать записную книжку из записей
        int size = Record.index;
        Record[] notebook = new Record[size];
        notebook[0] = record1;
        notebook[1] = record2;
        notebook[2] = record3;

        // 2. ввести ключевое слово для поиска
        System.out.print("Введите ключевое слово для поиска в записной книжке: ");
        Scanner sc = new Scanner(System.in);
        String keyWord = sc.nextLine();

        // 3. вызвать метод поиска и вывода записи, содержащей ключевое слово
        Record.findKeyWordAndPrintRecord(keyWord, notebook);
    }
}

class Record {
    static int index;
    private String name;
    private String text;

    // конструктор записей
    public Record(String name, String text) {
        this.name = name;
        this.text = text;
        index++;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    // поиск слов в записной книжке и вывод в консоль записи с ключевым словом
    static void findKeyWordAndPrintRecord(String keyWord, Record[] notebook) {

        for (Record record : notebook) {
            String recordStr = record.getText();

            if (recordStr.contains(keyWord)) {
                System.out.print(record.getName() + ". ");
                System.out.println(recordStr);
            }
        }
    }
}