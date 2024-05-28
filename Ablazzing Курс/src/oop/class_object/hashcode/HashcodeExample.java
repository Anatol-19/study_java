package oop.class_object.hashcode;

import oop.class_object.equals.Child;

public class HashcodeExample {
    public static void main(String[] args) {
        Child child1 = new Child("Киров Сергей", 2018);
        Child child2 = new Child("Петров Иван", 2018);
        Child child3 = new Child("Меньшикова Анастасия", 2017);
        Child child4 = new Child("Иванов Валентин", 2019);

        Child[] group0 = {child1, child2};
        Child[] group1 = {child3, child4};
        Child[][] children = {group0, group1};

        Child childForFind = new Child("Иванов Валентин", 2019);

        ChildrenGardenWhithGpoups childrenGardenWhithGpoups = new ChildrenGardenWhithGpoups(children);

        boolean resalt = false;
        for (Child child : childrenGardenWhithGpoups.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)) {
                resalt = true;
                break;
            }
        }

        System.out.println(resalt);
    }
}
