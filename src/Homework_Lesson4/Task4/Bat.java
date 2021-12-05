package Homework_Lesson4.Task4;

public class Bat extends Animal {

    public Bat(int age, String nickname, String color, String breed, double weight) {
        super(age, nickname, color, breed, weight);
    }

    @Override
    void castVote() {
        System.out.println("Bat is screeching loud ");
    }

    public void fly() {
        System.out.println("Bat can fly ");
    }

    public void vampire() {
        System.out.println("Bat is sucking blood ");

    }
}
