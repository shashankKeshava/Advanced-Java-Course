package Day02.com.Lab07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lab07 {
    private BiConsumer<Integer, String> romanPrinter;

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Chennai", "Mumbai", "Bengaluru", "Boston");
        Consumer<String> printer = data -> System.out.println(data);
        cities.forEach(city -> printer.accept(city));

        Map<Integer, String> roman = new HashMap<Integer, String>() {{
            put(1, "I");
            put(2, "II");
            put(3, "III");
            put(4, "IV");
        }};

        BiConsumer<Integer, String> romanPrinter = (a, b) -> System.out.println(a + "->" + b);

        roman.forEach((k, v) -> romanPrinter.accept(k, v));
        roman.forEach(romanPrinter);

    }
}
