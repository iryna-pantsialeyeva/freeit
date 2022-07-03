package task5;
/*Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
При каждом вводе пользователем программа долна говорить "warmly, hot" или "chilly, cold"
в зависимости от того, как далеко буква пользователя от загаданной*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) {

        String alphabet = "abcdefghigklmnopqrstuvwxyz";
        Random random = new Random();
        int chosenLetterPosition = random.nextInt(alphabet.length());
        boolean isLetterGuessed = false;

        //System.out.println(alphabet.charAt(chosenLetterPosition)); // for easy check

        Scanner sc = new Scanner(System.in);

        while (!isLetterGuessed) {
            System.out.print("Guess the letter (use lower case): ");
            String inputLetter = sc.nextLine().toLowerCase();

            if (chosenLetterPosition == alphabet.indexOf(inputLetter)) {
                System.out.println("You are right!");
                isLetterGuessed = true;
            } else if (Math.abs(chosenLetterPosition - alphabet.indexOf(inputLetter)) <= 2) {
                System.out.println("warmly, hot");
            } else {
                System.out.println("chilly, cold");
            }
        }
    }
}
