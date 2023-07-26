package seminar2;

/*
    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4
    Реализуйте метод, который считывает данные из файла и сохраняет двумерный массив(либо HashMap, если
    студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
    значение ?, заменить его  на соответсвующее число. Если на каком-то месте встречается символ, отличный от
    числа или ?, бросить подходящее исключение. Записать в тот же файл данные с замененными  символами ?.
 */

import java.io.*;
import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        String path = "G:\\GB\\Exceptions\\Exceptions\\Exceptions\\src\\main\\java\\seminar2\\text.txt";
        File file = new File(path);
        HashMap<String, String> myHashMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String stringName = new String();
            while((stringName= reader.readLine()) != null){
                String[] str = stringName.split("=");
                if (str[1].equals("?")){
                    str[1] = String.valueOf(str[0].length());
                }
                myHashMap.put(str[0], str[1]);
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }

        writeFile(path, myHashMap);
    }

    public static void writeFile(String path, HashMap<String, String> myHashMap){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            myHashMap.forEach((key, value) -> {
                String result = key + "=" + value;
                try {
                    writer.write(result + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
