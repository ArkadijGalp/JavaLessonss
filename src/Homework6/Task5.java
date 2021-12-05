package Homework6;

public class Task5 {
    public static void main(String[] args) {
        String police = "Police drives to the bank";

String policei = police.substring(0, 15);
        int index1 = policei.indexOf('P');
        System.out.println(index1);
        int index2 = policei.lastIndexOf("");
        System.out.println(index2);
    }
}
/*
Задание 5
        Имеется строка. Введите подстроку и найдите первый и последний индексы
         вхождения этой подстроки в строку. Используйте indexOf и lastIndexOf.*/

/*
    Get the First Character Using the charAt() Method in Java
    The charAt() method takes an integer index value as a parameter
     and returns the character present at that index.
     The String class method and its return type are a char value.*/
