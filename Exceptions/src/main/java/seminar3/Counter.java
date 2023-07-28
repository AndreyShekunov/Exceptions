package seminar3;

import java.io.IOException;

public class Counter implements AutoCloseable {

    /*
    Создайте класс Счетчик, у которого есть метод add(), увеличивающий
    значение внутренней int переменнойна 1.Сделайте так, чтобы с объектом
    такого типа можно было работать в блоке try-with-resources. Нужно бросить
    исключение, еслиработа с объектом типа счетчикбылане в ресурсном try
    и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
    лучше всего.
     */
    Integer counter = 0;

    public static void main(String[] args) {

        Counter counter2 = new Counter();
        System.out.println(counter2.checked());
        counter2.close();
        System.out.println(counter2.checked());

        try (Counter counter1 = new Counter()) {
            System.out.println(counter1);

            counter1.add();
            System.out.println(counter1);

        } catch (IOException e) {
            System.out.println("Ошибка IOException");
        }
    }
    public void add() throws IOException{
        if (counter == null){
            throw new IOException("Error IOException");
        }
        this.counter++;
    }
    public void close(){
        this.counter = null;
    }

    public String checked(){
        if (counter == null){
            return "Закрыто";
        }
        return "Открыто";
    }
}
