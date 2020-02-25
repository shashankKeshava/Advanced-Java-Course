package Day02.com.Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = num -> num + 1;
        int result = inc.apply(10);
        System.out.println(result);


        Function<String, Integer> len = val -> val.length();
        System.out.println(len.apply("Shashank"));


        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
        System.out.println(addition.apply(1, 2));
    }
}
