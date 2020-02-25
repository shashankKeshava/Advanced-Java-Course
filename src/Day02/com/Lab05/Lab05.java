package Day02.com.Lab05;

import static Day02.com.Lab05.ValidationConstants.isNotEmpty;
import static Day02.com.Lab05.ValidationConstants.isNotNull;
import static Day02.com.Lab05.ValidationConstants.isRightLength;


public class Lab05 {
    public static void main(String[] args) {
        String userName = "Shasha";
        boolean isValid = isNotNull
                .and(isNotEmpty)
                .and(isRightLength)
                .test(userName);

        System.out.println(isValid);
    }
}
