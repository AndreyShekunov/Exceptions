package lesson2;

public class NullPointerException extends Throwable {
    // пример NullPointerException - самое часто исключение
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());  // Exception in thread "main" java.lang.NullPointerException
    }
}
