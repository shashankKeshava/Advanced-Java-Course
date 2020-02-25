package Day02.com.lamdas;


import java.util.Arrays;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Ruby", "XCode");
        String item = languages.parallelStream().filter(lang -> "Ruby".equals(lang)).findAny().orElse("Ruby not found");

        System.out.println(item);


    }
}
