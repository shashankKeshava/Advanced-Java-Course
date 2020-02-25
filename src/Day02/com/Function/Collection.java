package Day02.com.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;


class Util {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Collection {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Chennai", "Mumbai", "Bengaluru", "Boston", "Cochin");

        cities.stream()
                .filter(it -> it.startsWith("C"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Util util = new Util();

        BiFunction<Integer, Integer, Integer> inc = util::add;
        System.out.println(inc.apply(1, 2));
    }
}
