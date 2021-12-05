package Homeworkk7.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store store = new Store(10);

            try {
                store.addUser(new Userstore("Alexey12", "lambda223", "SeriousSam"));
            } catch (ArrayIsFull e) {
                e.printStackTrace();
            }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин и пароль");

            String loginAuthorize = scanner.nextLine();
            String passwordAuthorize = scanner.nextLine();

try {
    store.searchUser(loginAuthorize, passwordAuthorize);
} catch (UserNotFoundException e) {
    System.out.println("Пользователь не найден");
}
        }
    }

