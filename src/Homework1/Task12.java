package TeachmeSkillsHomeworks.domashka1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        x = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе число ");
        y = scanner1.nextInt();

        z = x+y;
        System.out.println("Ваше число от суммы будет равняться " + z);
    }
}
