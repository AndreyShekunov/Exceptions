package seminar3;

/*
    Создайте класс исключений, которое будет возникать при обращении к
    пустому элементу в массиве ссылочного типа. Исключение должно
    отображать понятное для пользователя сообщение об ошибке

 */

public class NullPointer extends NullPointerException {

    public static void main(String[] args) {
        throw new NullPointer(1);
    }

    public NullPointer(int index){
        super("пустой элемент по индексу [" + index + "]");
    }
}
