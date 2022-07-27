package task6;

/*Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1 */

public class Butterfly {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 2 || i == 4 || (i == 1 && (j == 1 || j == 3)) || (i == 3 && (j == 1 || j == 3))) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + "\n");
                }
            }
        }
    }
}
