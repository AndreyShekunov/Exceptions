package homework3;

import java.io.IOException;
import java.util.Scanner;

import static homework3.UserData.parseUserData;
import static homework3.UserData.writeDataToFile;


public class Main {
    private static final String FILE_EXTENSION = ".txt";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");
            String input = scanner.nextLine().trim();

            try {
                UserData userData = parseUserData(input);
                String filename = userData.getLastName() + FILE_EXTENSION;
                writeDataToFile(userData, filename);
                System.out.println("Data was successfully written to the file " + filename);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (IOException e) {
                System.err.println("Error writing to file");
                e.printStackTrace();
            }
        }
    }
}
