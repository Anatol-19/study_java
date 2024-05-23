package oop.polymorphism.interfaces.interface_segrigation;

public class Airplane implements Flyable, Drivable{
    @Override
    public void fly() {
        System.out.println("Самолёт летит");
    }

    @Override
    public void drive() {
        System.out.println("Самолёт едет");
    }
}
