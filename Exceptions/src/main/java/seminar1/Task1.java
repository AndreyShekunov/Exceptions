package seminar1;
// написать метод принимающий в качетсве аргумента целочисленный массив и некторое значение
// метод ищит в массиве заданное значение и возвращает его индекс
// если длина массива меньше некоторого заданного минимума, то метод возвращает -1, если искомый
// элемент не найден метод вернет -2, если вместо массива пришел null метод вернет -3
// Так же написать метод в котором будет реализовано взаимодействие с пользоватиелем
public class Task1 {

    public static void main(String[] args) {
        Integer[] array = new Integer[12];
        for (int i = 0; i < array.length; i++){
            array[i] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        int value = 7;
        System.out.println(arrayLength(array, value));

    }

    public static int arrayLength(Integer[] array, int value) {
        if (array == null) {
            return -3;
        }
        if (array.length < 10) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -2;
    }
}
