package oop.polymorphism.interfaces.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Poodel poodel = new Poodel();
        Shepherd sheephard = new Shepherd();
        DogZoo dogZoo = new DogZoo(poodel, sheephard);
    }
}
