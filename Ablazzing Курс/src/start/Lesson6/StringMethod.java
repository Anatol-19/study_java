package start.Lesson6;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";

        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        //Замена всех кусков текста на другой текст
        String replacedText = text.replaceAll("r", "a");
        System.out.println(replacedText);

        //Повторить текст n раз
        String repeatedText = text.repeat(10);
        System.out.println(repeatedText);

        //Разбить текст на массив String
        String names = "Oleg;Ivan;Sergey;Anastaiya";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));

        //Объединение строк (Конкатенация)
        String word1 = "hi ";
        String word2 = "friend";
        String result = word1 + word2;
        System.out.println(result);

        //Начинается на подстроку
        boolean startsWithHel = text.startsWith("Hel");
        System.out.println(startsWithHel);

        //Заканчивается на подстроку
        boolean endWithWorld = text.endsWith("world!");
        System.out.println(endWithWorld);

        //Обрезка строки
        String firstFiveLetters = text.substring(0, 5);
        System.out.println(firstFiveLetters);


    }
}
