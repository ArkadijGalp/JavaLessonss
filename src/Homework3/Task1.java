package Homework3;

public class Task1 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;
        int count=10;
        System.out.print(n1 + " " + n2); //выводим 0 и 1

        for (i = 2; i < count; i++) //начинаем цикл с двух ибо 0 и 1 уже вывели
            {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
                }
            }
}
