package Homework_Lesson4.Task4;

public class Cat extends Animal {
    public Cat(int age, String nickname, String color, String breed, double weight) {
        super(age, nickname, color, breed, weight);
    }

    @Override
    void castVote() {
        System.out.println("Meow meow!! ");
    }

    public void scratch() {
        System.out.println("Cat likes scratching the walls ");
    }

    public void sleep() {
        System.out.println("The cat is sleeping ");
    }

}
