package homework2;

import java.util.Scanner;

public class Task4 {

    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {
        interLine();
    }

    public static void interLine() {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String stringLine = scanner.nextLine();
        if (stringLine.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая!");
        } else {
            System.out.println(stringLine);
        }
    }
}
