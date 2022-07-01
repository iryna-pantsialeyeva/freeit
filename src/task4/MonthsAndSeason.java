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

        System.out.println("*******************************");

        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println(month + " is winter.");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println(month + " is spring.");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println(month + " is summer.");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println(month + " is autumn.");
                if (month.equals("October")) {
                    System.out.print(month + " The time to fly to Munich");
                }
                break;
            default:
                System.out.println("No such month in the year.");
            }
    }
}
