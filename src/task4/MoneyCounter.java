package task4;

import java.util.Random;

/* Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже. */

public class MoneyCounter {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        x = Math.abs(x);


        if (x == 1 || (x % 10 == 1 && x % 100 != 11 && x != 11)) {
            System.out.println(x + " рубль");
        } else if ((x > 1 && x < 5) || (x % 10 > 1 && x % 10 < 5 && x % 100 > 20)) {
            System.out.println(x + " рубля");
        } else {
            System.out.println(x + " рублей");
        }

    }
}
