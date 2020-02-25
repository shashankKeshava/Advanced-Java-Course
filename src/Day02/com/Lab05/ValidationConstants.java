package Day02.com.Lab05;

import java.util.function.Predicate;

public interface ValidationConstants {
    Predicate<String> isRightLength = name -> name.length() <= 6;
    Predicate<String> isNotEmpty = name -> !name.isEmpty();
    Predicate<String> isNotNull = name -> name != null;
//        Predicate<String> isNotBlank = name -> !name.isBlank();


}
