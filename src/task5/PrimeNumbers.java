package task5;
/*Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        boolean isNumberPrime = true;

        if (inputNumber == 2) {
            System.out.println("Number " + inputNumber + " is prime");
        } else if (inputNumber <= 1 || inputNumber % 2 == 0) {
            System.out.println("Number " + inputNumber + " is not prime");
        } else {
            for (int i = 3; i < 8; i += 2) {
                if (inputNumber % i == 0) {
                    isNumberPrime = false;
                }
            }
            if (!isNumberPrime) {
                System.out.println("Number " + inputNumber + " is not prime");
            } else {
                System.out.println("Number " + inputNumber + " is prime");
            }
        }
    }
}

