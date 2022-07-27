package task6;
/*Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями*/

public class SumIntegerMinMaxGap {
    public static void main(String[] args) {

        int[] array = new int[] {6, 8, 9, 12, 67, 5, 51, 33, 2};
        int maxInteger = array[0];
        int minInteger = array[0];

        for (int i : array) {
            if (i > maxInteger) {
                maxInteger = i;
            }
        }

        for (int i : array) {
           if (i < minInteger) {
               minInteger = i;
           }
        }

        int indexMaxInteger = 0;
        int indexMinInteger = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxInteger) {
                indexMaxInteger = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minInteger) {
                indexMinInteger = i;
            }
        }

        int sumIntegerMinMaxGap = 0;
        if (indexMaxInteger < indexMinInteger) {
            for (int i = indexMaxInteger + 1; i < indexMinInteger; i++) {
                sumIntegerMinMaxGap += array[i];
            }
        } else if (indexMinInteger < indexMaxInteger) {
            for (int i = indexMinInteger + 1; i < indexMaxInteger; i++) {
                sumIntegerMinMaxGap += array[i];
            }
        } else {
            System.out.println("There aren't elements between maximum and minimum numbers.");
        }
        System.out.println("The sum of all elements located between minimum and maximum numbers in the array " +
                "is equal to " + sumIntegerMinMaxGap + ".");
    }
}
