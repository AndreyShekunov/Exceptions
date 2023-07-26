package homework2;

import java.util.Random;

public class Task2 {

    /*
    Если необходимо, исправьте данный код:
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }
    */

    public static void main(String[] args) {
        exception();
    }
    static public void exception(){
        try {
            int d = 0;
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++ )
                array[i] = new Random().nextInt();
            double catchRes1 = array[8] / d;
            System.out.println("результат = " + catchRes1);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e);
        }

    }
}
