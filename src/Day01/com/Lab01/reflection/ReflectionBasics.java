package Day01.com.Lab01.reflection;

public class

ReflectionBasics {
    public static void main(String[] args) throws Exception {

        //Loading the metadata of Person class
        Class cls = Class.forName("Day01.com.Lab01.reflection.Person");
        System.out.println(cls.getName());
        Object person = cls.getDeclaredConstructor().newInstance();
        cls.getMethod("eat").invoke(person);


    }
}
