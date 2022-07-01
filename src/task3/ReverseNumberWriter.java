package task3;

import java.util.Scanner;

/* Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n */
public class ReverseNumberWriter {
    public static void main(String[] args) {
        System.out.print("Введите 4хзначное натуральное число: ");
        Scanner numberScanner = new Scanner(System.in);
        int number = numberScanner.nextInt();

        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = number % 100 / 10;
        int forthDigit = number % 10;

        if (number <= 0) {
            System.out.println("Вы ввели не натуральное число");
        } else if (number > 9999 || number < 1000) {
            System.out.println("Вы ввели не 4хзначное число");
        } else {
            // получаем СТРОКУ в виде числа путем перестановки (например, для 1000 получим 0001)
            System.out.println("" + forthDigit + thirdDigit + secondDigit + firstDigit);
            // получаем ЧИСЛО c помощью выписывания в обратном порядке (например, для 1000 получим 1)
            System.out.println(forthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit * 1);
        }
    }
}
