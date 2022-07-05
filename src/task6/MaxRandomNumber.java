package task6;
/* Создать последовательность случайных чисел, найти и вывести наибольшее из них.*/

import java.util.Arrays;
import java.util.Scanner;

public class MaxRandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many random numbers does the program need to generate? Enter the integer:");
        int size = sc.nextInt();

        int[] arrayRandomNumber = new int[size];
        for (int i = 0; i < size; i++) {
            arrayRandomNumber[i] = (int)(Math.random() * 200);
            System.out.println(arrayRandomNumber[i]);
        }

        Arrays.sort(arrayRandomNumber);
        System.out.println(arrayRandomNumber[size-1]);
    }
}
