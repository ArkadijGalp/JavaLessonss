package Homework6.Task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.print("Enter the order ");
        Orders.valueOf(scanner.nextLine());
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your eye color ");
        Eyes.valueOf(scanner.nextLine());

        String abr = "add Arkady GREEN";
        String[] abrr = abr.split(" ");
        for (String aber : abrr) {
            System.out.println(aber);
        }
    }
}
/*
Задание 7 *
        Введите с консоли строку по следующему шаблону:
<команда> <имя> <цвет глаз>
Вместо команды могут быть введены следующие значения: add, delete, update. Можно создать enum.
        Вместо цвета глаз: green, blue, brown. Можно сделать enum.
        Имя: просто строка без пробелов.
        Проверьте введенную строку на соответствие этому шаблону.
        Каждое последующее слово разделяется через пробел. Используйте команду split.*/
