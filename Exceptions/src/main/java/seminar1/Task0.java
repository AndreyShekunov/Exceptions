package seminar1;

public class Task0 {

    public static void main(String[] args) {
        int[] array = new int[8];
        System.out.println(arrayLength(array));

    }

    public static int arrayLength(int[] array) {
        if (array.length < 10) {
            return -1;
        }
        return array.length;
    }
}
