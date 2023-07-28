package lesson3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tryWithResources {

    // пример использования конструкции try-with-resources

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("G:\\GB\\Exceptions\\Exceptions\\Exceptions\\src\\main\\java\\seminar2\\text.txt");
             FileWriter writer = new FileWriter("test1.txt")){
            while (reader.ready()){
                writer.write(reader.read());  // выполняем копирование из файла в text.txt в файл test1
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch Exception: " + e.getClass().getSimpleName());;
        }

        System.out.println("Копирование выполнено успешно");
    }
}
