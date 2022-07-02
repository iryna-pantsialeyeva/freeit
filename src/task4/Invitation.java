package task4;
/* Написать программу, которая приветствует пользователя в зависимости от его пола и возраста
(имя, пол и возраст задаются при старте программы)*/

import java.util.Scanner;

public class Invitation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your sex (male of female): ");
        String sex = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println(name + ", unfortunately, access to this site is restricted to persons under 18!" +
                    " We are waiting for you in " + (18 - age) + " years.");
        } else {
            switch (sex) {
                case "male":
                    System.out.println(name + ", welcome back! We have missed you so much! See our special offers for " +
                            "real men - \nJACK DANIELS FOR 10 USD/1L");
                    break;
                case "female":
                    System.out.println(name + ", welcome! See our special offers for ladies - \nTWO-FOR-ONE DEAL FOR " +
                            "MARTINI BIANCO");
                    break;
                default:
                    System.out.println(name + ", welcome! We have drinks for everyone. Only today a special offers for " +
                            "you - \nORIGINAL AMBASSADOR \"MERLOT DI ALEXANDRINA\" (LIMITED EDITION)");
            }
        }
    }
}
