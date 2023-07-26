package lesson1;

import java.io.File;

public class Application {


    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("C:\\Users\\Andy\\PycharmProjects\\python\\main.py")));
        System.out.println(divide(-10,0));
    }

    // функция деления
    public static int divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Нельзя делить на 0");
        }
        return a1/a2;
    }


    // функция получения размера файла в байтах
    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
