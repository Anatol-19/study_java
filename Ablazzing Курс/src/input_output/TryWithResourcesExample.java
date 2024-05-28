package input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {
        String fileName = new String("C:\\Study_QA\\study_java\\Ablazzing Курс\\resources\\article.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            throw new RuntimeException("Ошибка!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Гарантированное закрытие потока!");
            fileReader.close();
        }

        try (FileReaderWrapper fileReaderWrapper = new FileReaderWrapper(
                new FileReader(fileName))) {
            throw new RuntimeException("Ошибка!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

