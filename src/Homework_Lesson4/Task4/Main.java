package Homework_Lesson4.Task4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(15, "Garry", "Black", "Labrador", 48.0);
        Cat cat = new Cat(4, "Puffy", "White", "Scottish-fold", 6.5);
        Bat bat = new Bat(1, "Polly", "Black", "Hoary", 0.3);
        System.out.println("Dog " + dog);
        dog.castVote();
        dog.infoAnimal();
        dog.Guard();
        dog.Run();
        System.out.println();
        System.out.println("Cat " + cat);
        cat.castVote();
        cat.infoAnimal();
        cat.scratch();
        cat.sleep();
        System.out.println();
        System.out.println("Bat " + bat);
        bat.castVote();
        bat.infoAnimal();
        bat.fly();
        bat.vampire();
        System.out.println();

        Animal doggy = new Dog(15, "Garry", "Black", "Labrador", 48.0);
        Animal kitty = new Cat(4, "Puffy", "White", "Scottish-fold", 6.5);
        Animal mouse = new Bat(1, "Polly", "Black", "Hoary", 0.3);

        doggy.castVote();
        doggy.infoAnimal();
        //doggy.Guard; not available
        //doggy.Run; Same as for kitty/Bat equivalents

        kitty.castVote();
        kitty.infoAnimal();

        mouse.castVote();
        mouse.infoAnimal();

        if (doggy instanceof Animal) {
            System.out.println("Dog can be cast to the type of Animal ");
        } else {
            System.out.println("Dog cannot be cast to the type of Animal");
        }
        if (doggy instanceof Cat) {
            System.out.println("Dog can be cast to the type of Cat");
        } else {
            System.out.println("Dog cannot be cast to the type of Cat");
        }
        if (doggy instanceof Dog) {
            System.out.println("Dog can be cast to the type of Dog ");
        } else {
            System.out.println("Dog cannot be cast to the type of Dog ");
        }
        if (doggy instanceof Bat) {
            System.out.println("Dog can be cast to the type of Bat ");
        } else {
            System.out.println("Dog cannot be cast to the type of Bat ");
        }


    }
}
