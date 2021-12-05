package Homeworkk7.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Try with index: ");

        try {
            int Arrayindex = scanner.nextInt();
            System.out.println(array[Arrayindex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This array doesnt have this index you want ");
            e.printStackTrace();
        } catch (InputMismatchException g) {
            System.out.println("You cannot use the strings when the numbers are listed ");
            g.printStackTrace();
        }
    }
}
/*
    Имеется массив целых чисел. Пользователь вводит индекс элемента, который он хочет
        вывести на экран. Спользуйте Scanner. Не делая проверок введенных данных через if,
        обработайте возможные исключения. 1) выход за пределы массива; 2) возможность того, что
        пользователь введет не число а строку*/
