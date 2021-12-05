package Homework_Lesson4.Task4;

public class Dog extends Animal{
    public Dog(int age, String nickname, String color, String breed, double weight) {
        super(age, nickname, color, breed, weight);
    }

    @Override
    void castVote() {
        System.out.println("Garhhg Garghh! ");
    }

    public void Guard(){
        System.out.println("Dog is guarding ");
    }

    public void Run() {
        System.out.println("Dog is running ");
    }
}
