package oop.polymorphism.difference_interface_abstract_class;

public class IvanDurac implements Swimmable {
    private Boat boat;

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void swim() {
        boat.swim();
    }
}
