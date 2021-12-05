package Homeworkk7.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        WorkingwithString string = new WorkingwithString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your season: ");
        String enteredSeason = scanner.nextLine();

        try {
            string.getSeason(enteredSeason);
            System.out.println(string);
            System.out.println("You're welcome! ");

        } catch (RuntimeException e) {
            System.out.println("Wrong season ");
        }

    }
}
/*
Имеется enum Season. В нем имеются знаения WINTER(“winter”), SUMMER(“summer”),
        AUTUMN(“autumn”), SPRING(“spring”). Добавьте метод, который принимает строку и
        возвращает enum. В случае, если такого enum не существует сгенерируйте исключение типа
        RuntimeException. Обработайте исключение в методе main*/
