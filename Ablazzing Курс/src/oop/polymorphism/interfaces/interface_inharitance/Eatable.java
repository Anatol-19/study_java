package oop.polymorphism.interfaces.interface_inharitance;

public interface Eatable {
    default void eat() {
        System.out.println("Объект ест");
    };
}
