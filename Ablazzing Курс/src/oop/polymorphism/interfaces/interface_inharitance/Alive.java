package oop.polymorphism.interfaces.interface_inharitance;

public interface Alive extends Eatable, Moveable {
    @Override
    default void eat() {
        Eatable.super.eat();
    }
}
