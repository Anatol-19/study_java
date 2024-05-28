package oop.exceptions;

public class Car {
    private boolean isBroken;
    public Car(boolean isBroken){
        this.isBroken = isBroken;
    }

    public void start() throws CarIsBrokenExceptions {
        if (isBroken){
            throw new CarIsBrokenExceptions("Машина сломана");
        }
        System.out.println("Машина стартовала");
    }
}
