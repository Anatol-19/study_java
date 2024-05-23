package oop.polymorphism.interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if (bird instanceof Alive) {
            System.out.println("живой");
        } if (airplane instanceof Alive) {
            System.out.println("живой");
        } else {
            System.out.println("не живой");
        }
    }
}
