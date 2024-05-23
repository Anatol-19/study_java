package oop.class_object;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Class<? extends Cat> aClass = cat.getClass();
        System.out.println(aClass.getName());
        System.out.println(cat.toString());
    }
}
