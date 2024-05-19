package start.Lesson6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Анатолий";
        int age = 36;

//        String phrase = String.format("Меня зовут %s, мне %d лет", name, age);
//        System.out.println(phrase);
        System.out.printf("Меня зовут %s, мне %d лет", name, age);
    }
}
