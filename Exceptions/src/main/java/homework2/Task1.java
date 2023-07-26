package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    /*
   1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
   вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

    public static void main(String[] args) {
        inputFloat();
    }
    public static void inputFloat (){
        System.out.println("Введите дробное число: ");
        float num;
        Scanner scanner = new Scanner(System.in);
        try {
            num = scanner.nextFloat();
            System.out.println(num);
        } catch (InputMismatchException e){
            inputFloat();
        }
    }
}
