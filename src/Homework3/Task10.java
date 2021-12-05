package Homework3;

public class Task10 {
    public static void main(String[] args) {
        int array[] = {1, 1, 32, 32 , 3, 3, 3, 25, 0};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
