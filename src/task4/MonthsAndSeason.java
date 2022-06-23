package task4;
/*Написать программу, в которой в консоль будет выводится название месяца и сезон,
к которому этот месяц относится (написать с помощью  if  и с помощью switch)*/

import java.util.Scanner;

public class MonthsAndSeason {
    public static void main(String[] args) {

        System.out.print("Enter the month name: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        if (month.equals("January") || month.equals("February") || month.equals("December")) {
            System.out.println(month + " is winter.");
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println(month + " is spring.");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println(month + " is summer.");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println(month + " is autumn.");
        } else {
            System.out.println("No such month in the year.");
        }

        switch (month) {
            case "January":
                System.out.println(month + " is winter.");
                break;
            case "February":
                System.out.println(month + " is winter.");
                break;
            case "March":
                System.out.println(month + " is spring.");
                break;
            case "April":
                System.out.println(month + " is spring.");
                break;
            case "May":
                System.out.println(month + " is spring.");
                break;
            case "June":
                System.out.println(month + " is summer.");
                break;
            case "July":
                System.out.println(month + " is summer.");
                break;
            case "August":
                System.out.println(month + " is summer.");
                break;
            case "September":
                System.out.println(month + " is autumn.");
                break;
            case "October":
                System.out.println(month + " is autumn. The time to fly to Munich");
                break;
            case "November":
                System.out.println(month + " is autumn.");
                break;
            case "December":
                System.out.println(month + " is winter.");
                break;
            default:
                System.out.println("No such month in the year.");
        }
    }
}
