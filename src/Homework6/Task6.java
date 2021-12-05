package Homework6;

public class Task6 {
    public static void main(String[] args) {
        String banana = "Monkey gathers banana, monkey sniffs banana, monkey eats banana, monkey loves banana";

        String bananaRepeat = banana.substring(15,21);
        int countbanana = banana.indexOf("banana", 14);
        System.out.println(countbanana);
        int countbanana1 = banana.indexOf("banana", 22);
        System.out.println(countbanana1);
        int countbanana2 = banana.indexOf("banana", 38);
        System.out.println(countbanana2);
        int countbanana3 = banana.indexOf("banana", 58);
        System.out.println(countbanana3);
    }
}

/*
Задание 6 *
        Имеется строка. Введите строку и найдите сколько раз подстрока встречается в строке.
        У indexOf существует перегрузка, в которую можно помимо строки передавать вторым
        параметром номер символа, с которого необходимо начинать поиск. Например,
        если передать сделать следующий вызов indexOf(“substr”, 4),
        то метод начнет поиск подстроки с 5 символа строки.*/
