package lesson2;

import java.io.File;

public class ClassNotFoundException {

    // пример исключения ClassNotFoundException

    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);  // Exception in thread "main" java.lang.ClassCastException:
                                   // class java.lang.String cannot be cast to class java.io.File
                                   // (java.lang.String and java.io.File are in module java.base of loader 'bootstrap')
    }
}
