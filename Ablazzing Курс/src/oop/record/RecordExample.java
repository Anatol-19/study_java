package oop.record;

public class RecordExample {
    public static void main(String[] args) {
        Human human = new Human(1992,
                "Иван", "Иванович", "Иванов");
        System.out.println(human);
        HumanRecord humanR = new HumanRecord(1992,
                "Иван", "Иванович", "Иванов");
        System.out.println(humanR);
    }
}
