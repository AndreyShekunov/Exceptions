package lesson2;

public class tryCatch {

    // применение конструкции try-catch на базовом примере ArithmeticException

    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");  // На ноль делить нельзя
        } catch (Exception e){
            System.out.println("NullPointer Exception");
        }
        System.out.println(number);  // 1 - программа обработала исключение и продолжила свою работу
    }

}
