package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int i;
do {
    scanner.nextInt();
    i = random.nextInt(4);
    System.out.println(i);
        } while (i >= 0);
    }
}
