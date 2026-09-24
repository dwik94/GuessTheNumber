package com.dennis;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 1 + random.nextInt(100);
        int guessedInt = scanner.nextInt();
        IO.println(guessedInt);

        scanner.close();
    }
}
