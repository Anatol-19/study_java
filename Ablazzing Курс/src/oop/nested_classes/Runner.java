package oop.nested_classes;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human(
                "1875-G",
                "12_34_56uff",
                PassportType.FOREIGN,
                300
        );
        System.out.println(human);

    }
}
