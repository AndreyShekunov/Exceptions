package seminar1;

/*
Нужно реализовать метод checkArray, который на вход будет принимать целочисленный одномерный массив
метод должен пройтись по каждому элементу и проверить что он не равен null.
Дальше нужно реализовать следующую логику: если в какой то ячейке встретился null, то об этом необходимо оповестить
пользователя и если null встретился в нескольких ячейках, то идеально было бы все их "подсветить".
 */

import javax.management.StringValueExp;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random rand =new Random();
        Integer[] array = new Integer[17];
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(2);
            System.out.print(" " + array[i]);
        }
        array[0] = null;
        array[2] = null;
        array[3] = null;
        array[4] = null;
        checkArray(array);
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder nullable = new StringBuilder(new String());
        boolean isnull = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullable.append(i + " ");
                isnull = true;
            }
        }
        if (isnull){
            throw new RuntimeException(String.valueOf(nullable));
        }
    }
}
