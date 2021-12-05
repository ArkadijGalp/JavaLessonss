package Homework6;

public class Task2 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String addon = "It's mee";
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        System.out.println(stringBuilder1.append(addon));

        for (int i = 0; i < stringBuilder1.length(); i++) {
            if (stringBuilder1.length() % 2 != 0) {
                stringBuilder1.deleteCharAt(10);
                System.out.println(stringBuilder1.toString());
            }
        }

            }
        }


/*
Задание 2
        Имеется строка “Hello, world!”. Переверните эту строку.
        Добавьте в конец этой строки фразу “It’s me”. В случае,
        если длина строки нечетная удалите элемент по середине.
        Выведите стоку. Используйте StringBuilder.*/
