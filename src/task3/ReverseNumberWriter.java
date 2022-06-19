package task3;

import java.util.Scanner;

/* Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n */
public class ReverseNumberWriter {
    public static void main(String[] args) {
        System.out.println("Введите 4хзначное натуральное число");
        Scanner numerScaner = new Scanner(System.in);
        int number = numerScaner.nextInt();
        if (number <= 0) {
            System.out.println("Вы ввели не натуральное число");
        } else if (number > 9999 || number < 1000) {
            System.out.println("Вы ввели не 4хзначное число");
        } else {
            // получаем СТРОКУ в виде числа путем перестановки (например, для 1000 получим 0001)
            System.out.println("" + number % 10 + number % 100 / 10 + (number / 100) % 10 + number / 1000);
            // получаем ЧИСЛО, полученное выписыванием в обратном порядке
            System.out.println(number % 10 * 1000 + number % 100 / 10 * 100 + (number / 100) % 10 * 10 + number / 1000);
        }
    }
}
