package Homework3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;


        System.out.println("Enter command: \n increase \n decrease \n exit ");

        boolean exit = true;

        while (exit) {
            String enterCommand = scanner.nextLine();
            switch (enterCommand) {
                case "increase":
                    count++;
                    System.out.println("Result: " + count);
                    break;
                case "decrease":
                    count--;
                    System.out.println("Result: " + count);
                    break;
                case "exit":
                        System.out.println("Final result is: " + count);
                        exit = true;
                    return;
                default:
                    System.err.println("Error, try next time ");
                    break;
            }
        }
                }
            }
