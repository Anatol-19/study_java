package input_output;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputExample {
    public static void main(String[] args) {
        // сохранение настройки вывода в консоль
        PrintStream consoleOut = System.out;

        // переменная класса ByteArray, в которуб сохраним ввывод
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        // Перенастройка на "печать" в переменную
        System.setOut(new PrintStream(data));
        System.out.println("Печать текста");


        // Перенастройка на "печать" обратно в консоль
        System.setOut(consoleOut);
        System.out.println(String.valueOf(data).toUpperCase());
    }
}
