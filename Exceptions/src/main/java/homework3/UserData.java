package homework3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserData {
    private final String lastname;
    private final String firstname;
    private final String secondname;
    private final String birthDate;
    private final long phoneNumber;
    private final char gender;

    public static UserData parseUserData(String input) {
        String[] inputData = input.split("\\s+");
        if (inputData.length != 6) {
            throw new IllegalArgumentException("Invalid amount of data");
        }

        String lastname = inputData[0];
        String firstname = inputData[1];
        String secondname = inputData[2];
        String birthDate = inputData[3];
        long phoneNumber = parsePhoneNumber(inputData[4]);
        char gender = parseGender(inputData[5]);

        return new UserData(lastname, firstname, secondname, birthDate, phoneNumber, gender);
    }

    public static long parsePhoneNumber(String phoneNumber) {
        try {
            return Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid phone number format");
        }
    }

    public static char parseGender(String gender) {
        char genderChar = gender.charAt(0);
        if (genderChar != 'f' && genderChar != 'm') {
            throw new IllegalArgumentException("Invalid gender value");
        }
        return genderChar;
    }

    public static void writeDataToFile(UserData userData, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            String dataLine = userData.getLastName() + " " + userData.getFirstName() + " " + userData.getSecondName()
                    + " " + userData.getBirthDate() + " " + userData.getPhoneNumber() + " " + userData.getGender();
            writer.write(dataLine);
            writer.newLine();
        }
    }

    public UserData(String lastname, String firstname, String secondname, String birthDate, long phoneNumber, char gender) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.secondname = secondname;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastname;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getSecondName() {
        return secondname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }
}
