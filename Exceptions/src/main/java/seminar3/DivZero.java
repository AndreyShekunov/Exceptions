package seminar3;

/*
    Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class DivZero extends ArithmeticException{

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e){
            throw new DivZero();
        }
    }

    public DivZero(){
        super("Не дели на ноль!");
    }

}
