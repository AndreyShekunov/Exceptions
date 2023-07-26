package lesson2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class UnsupportedOperationException {

    // пример исключения UnsupportedOperationException

    public static void main(String[] args) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());  // Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
