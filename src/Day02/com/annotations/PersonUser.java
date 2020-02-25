package Day02.com.annotations;

public class PersonUser {

    static void checkAuthor(Class cls) {
        Author authorAnnotation = (Author) cls.getAnnotation(Author.class);
        if ("Prabhu".equals(authorAnnotation.name())) {
            System.out.println("Useless class. Don't use it");
        } else {
            System.out.println("That's a good author " + authorAnnotation.name());
        }
    }


    @SuppressWarnings(value = "")
    public static void main(String[] args) {
        Person person = new Person();
        checkAuthor(person.getClass());

        Car bmw = new Car();
        checkAuthor(bmw.getClass());


    }

}