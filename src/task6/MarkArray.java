package task6;
/*Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.*/

import java.util.Scanner;

public class MarkArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many marks does the program need to generate? Enter the integer:");
        int size = sc.nextInt();
        int mark;
        int[] markArray = new int[size];

        for (int i = 0; i < size; i++) {
            mark = (int) (Math.random() * 10 + 1);
            markArray[i] = mark;
        }

        for (int i : markArray) {
            System.out.println(i);
        }

        int maxMark = markArray[0];
        int minMark = markArray[0];
        int indexMaxMark = 0;
        int indexMinMark = 0;

        for (int i = 0; i < size - 1; i++) {
            if (markArray[i + 1] > maxMark) {
                maxMark = markArray[i + 1];
            }
        }
        System.out.print("The maximum mark is " + maxMark + " with index(es) ");

        for (int i = 0; i < size; i++) {
            if (markArray[i] == maxMark) {
                System.out.print(i + " ");
            }
        }

        for (int i = 0; i < size - 1; i++) {
            if (markArray[i + 1] < minMark) {
                minMark = markArray[i + 1];
            }
        }
        System.out.println("");
        System.out.print("The minimum mark is " + minMark + " with index(es) ");

        for (int i = 0; i < size; i++) {
            if (markArray[i] == minMark) {
                System.out.print(i + " ");
            }
        }
    }
}