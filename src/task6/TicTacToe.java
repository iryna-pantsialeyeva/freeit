package task6;
/* Написать игру крестики нолики */

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        String[][] array = new String[3][3];

        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = num + "";
                num++;
            }
        }
        printArray(array);
        System.out.println("***************************");


        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int counter = random.nextInt(2);
        int raw;
        int column;
        String computerOrHuman;
        while (isWinner(array) == false) {
            if (counter % 2 == 0) {
                raw = random.nextInt(3);
                column = random.nextInt(3);
                if (isCellEmpty(array, raw, column) == true) {
                    array[raw][column] = "X";
                    computerOrHuman = "computer";
                } else {
                    continue;
                }
            } else {
                computerOrHuman = getRawAndColumn(array, sc);

                if (computerOrHuman == null) continue;
            }
            printArray(array);

            if (isWinner(array)) {
                System.out.println("The winner is " + computerOrHuman);
                break;
            }

            if (isGameDraw(array)) {
                System.out.println("The game is over. Draw.");
                break;
            }

            System.out.println("***************************");
            counter++;
        }
    }

    static String getRawAndColumn(String[][] array, Scanner sc) {
        String computerOrHuman;
        int column;
        int raw;
        do {
            System.out.print("Enter the raw (choose number from 0 to 2): ");
            raw = sc.nextInt();
        } while (raw < 0 || raw > 2);

        do {
            System.out.print("Enter the column (choose number from 0 to 2): ");
            column = sc.nextInt();
        } while (column < 0 || column > 2);

        if (isCellEmpty(array, raw, column) == true) {
            array[raw][column] = "O";
            computerOrHuman = "human";
        } else {
            return null;
        }
        return computerOrHuman;
    }

    static boolean isWinner(String[][] array) {
        if (Objects.equals(array[0][0], array[0][1]) && Objects.equals(array[0][1], array[0][2]) ||
                Objects.equals(array[1][0], array[1][1]) && Objects.equals(array[1][1], array[1][2]) ||
                Objects.equals(array[2][0], array[2][1]) && Objects.equals(array[2][1], array[2][2]) ||
                Objects.equals(array[0][0], array[1][0]) && Objects.equals(array[1][0], array[2][0]) ||
                Objects.equals(array[0][1], array[1][1]) && Objects.equals(array[1][1], array[2][1]) ||
                Objects.equals(array[0][2], array[1][2]) && Objects.equals(array[1][2], array[2][2]) ||
                Objects.equals(array[0][0], array[1][1]) && Objects.equals(array[1][1], array[2][2]) ||
                Objects.equals(array[0][2], array[1][1]) && Objects.equals(array[1][1], array[2][0])) {
            return true;
        } else {
            return false;
        }
    }

    static void printArray(String[][] array) {
        //System.out.println(Arrays.deepToString(array));
        System.out.println(array[0][0] + " | " + array[0][1] + " | " + array[0][2]);
        System.out.println(array[1][0] + " | " + array[1][1] + " | " + array[1][2]);
        System.out.println(array[2][0] + " | " + array[2][1] + " | " + array[2][2]);
    }

    static boolean isCellEmpty(String[][] array, int raw, int column) {
        if (array[raw][column].equals("X") || array[raw][column].equals("O")) {
            System.out.println("The cell is busy. Tray again.");
            return false;
        } else {
            return true;
        }
    }

    static boolean isGameDraw(String[][] array) {
        char[] arrayAsChars = Arrays.deepToString(array).toCharArray();
        int digitCounter = 0;
        for (char charAtArray : arrayAsChars) {
            if (Character.isDigit(charAtArray)) {
                digitCounter++;
            }
        }
        return digitCounter == 0;
    }
}

