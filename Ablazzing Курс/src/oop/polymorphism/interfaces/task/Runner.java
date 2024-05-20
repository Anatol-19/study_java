package oop.polymorphism.interfaces.task;

public class Runner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        Swimable[] swimpool = {fish, duck};
        Flyable[] sky = {duck, airplane};
        for (Swimable swimable : swimpool) {
            swimable.swim();
        }
        for (Flyable flyable : sky) {
            flyable.fly();
        }


    }
}
