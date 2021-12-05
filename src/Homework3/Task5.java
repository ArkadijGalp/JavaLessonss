package Homework3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int a = Arrays.stream(array).max().getAsInt();
        System.out.println(a);

    }


}
