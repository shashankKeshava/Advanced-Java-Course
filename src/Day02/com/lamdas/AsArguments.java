package Day02.com.lamdas;

interface Worker {
    void doSomething(String message);
}

public class AsArguments {
    public static void main(String[] args) {
        Worker builder = message -> System.out.println(message + " builds");
        Worker baker = message -> System.out.println(message + " bakes");
        Worker anything = (message) -> System.out.println(message + " Does anything");

        builder.doSomething("Mary");
        baker.doSomething("Mario");
        anything.doSomething("bravo");


    }
}
