package task4;
/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Scanner;

public class NumberVerificator {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();

        if (Math.abs(number) < 1000 && Math.abs(number) > 99) {
            System.out.println("Введенное число - трехзначное");
        } else {
            System.out.println("Введенное число - не трехзначное");
        }

        System.out.println((number % 10 == 7) ? "Последняя цифра введенного числа - 7" :
                "Последняя цифра введенного числа не равна 7");

        System.out.println((number % 2 == 0) ? "Введено четное число" : "Введено нечетное число");
    }
}
