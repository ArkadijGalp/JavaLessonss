package TeachmeSkillsHomeworks.domashka1;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seconds");
        int T = in.nextInt();

        int sec = T % 60;
        int min = (T / 60)%60;
        int hours = (T/60)/60;

        System.out.println(hours + "ч" + min + "м" + sec +"с");
    }
}
