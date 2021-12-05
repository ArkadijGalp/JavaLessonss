package Homework6;

public class Task3 {
    public static void main(String[] args) {

        String string = "Hello, world";

        String result = string.substring(0, string.lastIndexOf("world"));
        System.out.println(result);


/*                StringBuffer stringBuffer = new StringBuffer("Hello, world");
      String uw = stringBuffer.substring(0,6);
        System.out.println(uw);*/

    }
}

/*
    Введите строку. Введите подстроку, которую вы хотите вырезать из этой строки. Вырезать подстроку из строки. Пример,
        Строка: “Hello, world”;
        Подстрока: “world”.
        Вырезать “world” из строки.*/
