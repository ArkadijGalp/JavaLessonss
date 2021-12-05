package Homework_Lesson4.Task2;

import java.util.Scanner;

public class Balance {


private int cent;

Balance(int cent) {
    this.cent = cent;
}

public void accountBalance() {
    System.out.println("Your account has" + cent/100 + "рублей и " + cent%100 + "копеек. ");
    System.out.println("On your account there is " + cent/100 + "рублей и " + cent%100 + "копеек. ");
}

public double withdrawMoney(int actionMoney) {
    if (actionMoney < cent && actionMoney > 0) {
        cent -= actionMoney;
    } else {
        System.out.println("The amount you entered causes error in case not enough of funds on your account ");

    }
    return cent;
}
public double depositMoney(int actionMoney) {
    if (actionMoney < cent && actionMoney > 0) {
        cent += actionMoney;
    } else {
        System.out.println("You entered a negative amount ");
   } return cent;
}
        }


/*Задание 2
        Создайте класс Balance.
        У него есть одно поле, которое отображает, количество копеек на вашем счету (int).
        Напишите методы:
        1) который выводит на экран количество рублей и копеек.
        2) метод, который увеличивает баланс и уменьшает баланс. Добавить проверки на
        случай попытки ввести некорректные данные( например, попытка снять больше денег
        или попытка ввести отрицательное значение)*/




/*
Задание 2
        Создайте класс Balance.
        У него есть одно поле, которое отображает, количество копеек на вашем счету (int).
        Напишите методы:
        1) который выводит на экран количество рублей и копеек.
        2) метод, который увеличивает баланс и уменьшает баланс. Добавить проверки на
        случай попытки ввести некорректные данные( например, попытка снять больше денег
        или попытка ввести отрицательное значение)*/
