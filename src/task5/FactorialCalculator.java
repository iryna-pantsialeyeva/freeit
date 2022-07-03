package task5;

/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
        произведение, т.е. факториал числа. */

public class FactorialCalculator {
    public static void main(String[] args) {
        double multiplier = 1;
        int x = (int) (Math.random() * 20);

        while (x != 0) {
            multiplier *= x;
            x = (int) (Math.random() * 20);
        }

        System.out.println("multiplication result: " + multiplier);
    }
}
