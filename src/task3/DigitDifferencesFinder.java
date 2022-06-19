package task3;

import java.util.Scanner;

/* Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны? */
public class DigitDifferencesFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        boolean equivalenceIndicator = false;
        for (int i = 0; i < number.length(); i++) {
            if (equivalenceIndicator) {
                System.out.println("Введенное число содержит одинаковые цифры");
                break;
            } else {
                for (int j = i + 1; j < number.length(); j++) {
                    if (number.charAt(i) == number.charAt(j)) {
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
