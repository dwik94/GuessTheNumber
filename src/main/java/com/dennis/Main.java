package com.dennis;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        while (true) {

            IO.println("Guess a number between 1 and 100!");
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int secretNumber = 1 + random.nextInt(100);
            IO.println(secretNumber);
            int guessedInt = scanner.nextInt();
            int numberOfTries = 1;



            while (guessedInt != secretNumber) {
                if (guessedInt > secretNumber)
                    IO.println("Your number is too big");

                else
                    IO.println("Your number is too small");

                guessedInt = scanner.nextInt();
                numberOfTries++;
            }

            IO.println("You found the number " + guessedInt + " after " + numberOfTries + " guesses! Write 1 if you want to play again. Otherwise, write 0");

            int ContinueOrNot = scanner.nextInt();
            if (ContinueOrNot != 1)
                break;


        }
    }
}