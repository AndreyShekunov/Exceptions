package seminar3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotFound extends IOException {

    /*
    Создайте класс исключения, которое будет возникать при попытке открыть
    несуществующий файл. Исключение должно отображать понятное для
    пользователя сообщение об ошибке.
     */
    public static void main(String[] args) throws NotFound {

        try (FileReader reader = new FileReader("123")){

        } catch (IOException e){
            throw new NotFound("123");
        }
    }

    public NotFound(String message){
        super("Файл по адресу " + message + " не найден.");
    }

}
