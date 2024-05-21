package oop.polymorphism.interfaces.dependency_inversion;

public class Runner {
    public static void main(String[] args) {
        Poodel poodel = new Poodel();
        Shepherd sheephard = new Shepherd();
        Terier terier = new Terier();
        DogZoo dogZoo = new DogZoo(terier, sheephard);
        DogZoo dogZoo1 = new DogZoo(poodel, sheephard);
    }
}
