package task5;

/*Найдите сумму первых n целых чисел, которые делятся на 3
NB Поскольку в задаче не указано, от какого числа вести отсчет, а отрицательные числа также являются целыми числами,
задача решена для следующего условия (чтобы можно было вести отсчет от любого введенного целого числа):
 "Найдите сумму первых n целых чисел, которые делятся на 3. Отсчет вести от числа n, введенного с консоли".
 По запросу добавлен второй варинат решения - для отсчета для первых натуральных чисел (от 1).
 */

import java.util.Scanner;

public class SumDivisibleBy3Number {
    public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int inputInteger = sc.nextInt();

        while (inputInteger < 0) {
            System.out.print("Entered number is negative. Enter a positive integer: ");
            inputInteger = sc.nextInt();
        }
        int counter = inputInteger;

        // 1. отсчет ведется от числа inputInteger (оно же счетчик слов)
        while (inputInteger % 3 != 0) {
            inputInteger += 1;
        }

        int sum = inputInteger;
        int addNumber = inputInteger;

        for (int i = 1; i < counter; i++) {
            addNumber += 3;
            sum += addNumber;
        }

        System.out.println("Sum of the first of " + counter + " numbers divisible by 3 is equal to " + sum +
                " (sum counted from entered number).");

        // 2. отсчет ведется от 1
        inputInteger = 1;
        while (inputInteger % 3 != 0) {
            inputInteger += 1;
        }

        sum = inputInteger;
        addNumber = inputInteger;

        for (int i = 1; i < counter; i++) {
            addNumber += 3;
            sum += addNumber;
        }

        System.out.println("Sum of the first of " + counter + " natural numbers divisible by 3 is equal to " + sum +
                ".");
    }
}
