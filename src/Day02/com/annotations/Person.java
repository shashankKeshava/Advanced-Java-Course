package Day02.com.annotations;

@Author(name = "Prabhu")
@Deprecated
public class Person implements AutoCloseable {
    private String name;
    private int age;

    @Deprecated
    public void eat(String... items) {
        System.out.println("Eating " + items);
    }

    @Override
    public void close() throws Exception {

    }
}