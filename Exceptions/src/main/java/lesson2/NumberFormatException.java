package lesson2;

public class NumberFormatException {

    // пример исключения NumberFormatException

    public static void main(String[] args) {
        String number = "123fq";
        int result = Integer.parseInt(number);
        System.out.println(result);  // Exception in thread "main" java.lang.NumberFormatException: For input string: "123fq"
    }
}
