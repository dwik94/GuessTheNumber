package com.dennis;
import java.util.Random;
public class Main {
    static void main() {

        Random random = new Random();

        int secretNumber = 1 + random.nextInt(100);

        IO.println(secretNumber);
    }
}
