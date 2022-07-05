package task6;
/*Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
и снова распечатать (при переворачивании нежелательно создавать еще один массив).*/

import java.lang.Math;

public class TurnedArray {
    public static void main(String[] args) {

        int[] randomNumberArray = new int[10];

        for (int i = 0; i < 10; i++) {
            randomNumberArray[i] = (int) (Math.random() * 20);
        }

        System.out.println("Random number array: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(randomNumberArray[i] + " ");
        }

        int temp;
        for (int i = 0, j = randomNumberArray.length - 1; i < randomNumberArray.length / 2; i++, j--) {
            temp = randomNumberArray[i];
            randomNumberArray[i] = randomNumberArray[j];
            randomNumberArray[j] = temp;
        }

        System.out.println("\nReversed array: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(randomNumberArray[i] + " ");
        }

    }
}
