package seminar1;

import java.util.Random;

/*
Нужно реализовать метод принимающий в качетсве аргумента целочисленный двумерный массив
необходимо посчитать и вернуть сумму элементов этого массива при этом накладывается на метод
два ограничения:
1. метод может работать только с квадратными массивами, т.е. кол-во строк ровняется количеству столбцов
2. в каждой ячейке может лежать значение 0 или 1
Если нарушено одно из этих условий метод должен бросить runtimeExeptions
*/
public class Task2 {

    public static void main(String[] args) {
        int[][] array = new int[7][7];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = rand.nextInt(3);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }

        System.out.println(sumElemArray(array));
    }

    public static int sumElemArray(int[][] array) {
        if (array.length != array[0].length) {
            throw new RuntimeException("Размер массива " + array.length + " на " + array[0].length + " не квадратный");
        }
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Значение не равно [0, 1]");
                }
                summ += array[i][j];
            }
        }
        return summ;
    }
}
