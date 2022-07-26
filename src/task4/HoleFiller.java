package task4;
/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.*/

import java.util.Scanner;

public class HoleFiller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int sideA = scanner.nextInt();
        System.out.print("Enter side b: ");
        int sideB = scanner.nextInt();
        System.out.print("Enter radius r: ");
        int radiusR = scanner.nextInt();
        if (radiusR >= (Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2))) / 2) {
            System.out.println("HoleFiller works");
        } else {
            System.out.println("HoleFiller doesn't work");

        }

    }
}
