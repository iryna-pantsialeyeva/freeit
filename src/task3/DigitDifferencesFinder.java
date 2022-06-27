package task3;

import java.util.Scanner;

/* Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны? */
public class DigitDifferencesFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите 4-значное число: ");
        int number = input.nextInt();

        while (number < 1000 || number > 9999) {
            System.out.print("Введите 4-значное число: ");
            number = input.nextInt();
        }

        String numberString = number + "";
        boolean equivalenceIndicator = false;
        for (int i = 0; i < numberString.length(); i++) {
            if (equivalenceIndicator) {
                System.out.println("Введенное число содержит одинаковые цифры");
                break;
            } else {
                for (int j = i + 1; j < numberString.length(); j++) {
                    if (numberString.charAt(i) == numberString.charAt(j)) {
                        equivalenceIndicator = true;
                    }
                }
            }

        }
        if (!equivalenceIndicator) {
            System.out.println("Введенное число не содержит одинаковые цифры");
        }
    }
}
