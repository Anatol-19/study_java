package oop.class_object.equels_hashcode_practic;

public class Task {
    public static void main(String[] args) {
        User user1 = new User("Win huy izo rta", "68168168464");
        User user2 = new User("Win huy izo rta", "22222222222");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
