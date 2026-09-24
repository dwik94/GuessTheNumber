package com.dennis;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 1 + random.nextInt(100);
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

        IO.println("You found the number " + guessedInt + " after " + numberOfTries + " guesses!" );

        scanner.close();
    }
}