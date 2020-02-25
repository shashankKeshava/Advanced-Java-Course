package Day02.com.annotations;

import java.lang.reflect.Field;

public class Validation {

    public static void main(String[] args) throws Exception {
        Credentials credentials = new Credentials();
        credentials.setUserName("use239847");
        credentials.setPassword("abcde12");

        validateLength(credentials);

        Account account = new Account();
        account.setAccountNumber("3209482343242");
        validateLength(account);

    }

    static void validateLength(Object instance) throws Exception {
        Class cls = instance.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String value = (String) field.get(instance);
            Length length = field.getAnnotation(Length.class);
            int max = length.max();
            int min = length.min();
            if (value.length() >= min && value.length() <= max) {
                System.out.println(field.getName() + " length validation success");
            } else {
                System.out.println(field.getName() + " length validation failure");
            }


        }
        //Get the Class
        //Get all the fields
        //Get the length annotation in each field
        //check for min and max conditions
        //if success, print the message
        //if failure, print the error message
    }


}