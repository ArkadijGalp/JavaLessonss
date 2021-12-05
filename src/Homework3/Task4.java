package Homework3;


public class Task4 {
    public static void main(String[] args) {
        int a[] = {12,43,57,66,69,84};
        int evenSum = 0;
        for (int i = 0; i < a.length; i++) {   //i <
            if (a[i] % 2 == 0) {
                evenSum = evenSum + a[i];
            }
        }
        System.out.println(evenSum);
    }
}
