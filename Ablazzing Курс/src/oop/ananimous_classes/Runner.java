package oop.ananimous_classes;

public class Runner {
    public static void main(String[] args) {
        Alive dog = new Alive() {
            @Override
            public void eat() {
                System.out.println("Собака ест");
            }

            @Override
            public void breath() {
                System.out.println("Собака дышит");

            }
        };
        dog.breath();
        dog.eat();

        Animal cat = new Animal() {
            @Override
            public void run() {
                System.out.println("Кот съебал");
            }
        };
        cat.run();
    }
}
