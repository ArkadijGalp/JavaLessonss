package TeachmeSkillsHomeworks.domashka1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println("Your result is " + ((b+Math.sqrt((b*b)+4*a*c) / 2*a) - (a*3*c)+Math.pow(b, -3) ));



    }
}
