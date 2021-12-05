package Homework6;

public class Task1 {
    public static void main(String[] args) {
        String site = "https://my-site.com";
        String addon = "-hidden";
        String siteChanged = site.substring(0,15) + addon + site.substring(15, 19);
        System.out.println(siteChanged);
    }
}
/*    Напишите метод, который принимает url. Убедитесь, что строка начинается с подстрок
        и (http:// или https://) и заканчивается на (.ru, .by или .com). Убедитесь,
// что строка содержит слово “my-site” и замените его на слово “my-hidden-site”.*/


