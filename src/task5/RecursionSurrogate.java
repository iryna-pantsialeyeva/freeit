package task5;

/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionSurrogate {
    public static void main(String[] args) {
        System.out.print("Enter the number from 10 to 15: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        while (inputNumber < 10 || inputNumber > 15) {
            System.out.print("The entered number is not valid. \n" +
                    "Enter the number from 10 to 15: ");
            inputNumber = sc.nextInt();
        }

        int x = 1;
        long factorial = 1L;

        while (x <= inputNumber) {
            factorial *= x;
            x++;
        }
        System.out.println();
        System.out.println("Factorial of number " + inputNumber + " is " + factorial + ".");
    }
}
