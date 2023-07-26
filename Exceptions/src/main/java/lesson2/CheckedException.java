package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    // Checked. Класс Exception и его подклассы — исключения, которые вы обязаны обработать в
    // вашем коде. Если этого не сделать, будет ошибка на этапе компиляции.

    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("G:\\GB\\Exceptions\\Exceptions\\Exceptions\\src\\main\\java\\lesson2\\ClassNotFoundException.java");  // открываем файл test
            //test.read();  // читаем файл
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch Exception: " + e.getClass().getSimpleName());;
        } finally {
            System.out.println("finally start");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}
