package Day02.com.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        //Predicate
        //that accepts an argument of any Type and returns boolean
        //filter method

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(31));
        System.out.println(isEven.test(11));

        Predicate<Integer> isOdd = num -> num % 2 != 0;
        isOdd.test(11);
        isEven
                .negate()
                .test(11);


        Predicate<String> startsWithA = val -> val.startsWith("A");

        System.out.println(startsWithA.test("Alpha"));

		/*
		int num = 20;
		boolean value = num % 2 == 0;

		if(num % 2 == 0) {
			System.out.println("Even");
		}
		*/
    }

}