package Homework6.Task8;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String br = "ABCD";

        char[] array = br.toCharArray();

        String result = "";

        for (int i = array.length - 1 ; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(result);

        }
    }



/*        Задание 8*
                Дана строка. Сделать ее реверс не используя StringBuilder.
        Подсказка, у String есть метод toCharArray.
        На выходе имеем массив всех символов, которые входят в строку.*/