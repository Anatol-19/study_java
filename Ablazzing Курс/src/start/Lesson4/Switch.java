package start.Lesson4;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 7;

        switch (numberDay) {
            case 1-> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Немай");
        }
    }
}
