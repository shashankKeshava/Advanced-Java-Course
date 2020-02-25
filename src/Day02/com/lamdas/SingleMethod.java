package Day02.com.lamdas;

interface Greeting {
    void hello(String name);
}

class GreetingClass implements Greeting {
    public void hello(String name) {
        System.out.println("Hello old " + name);
    }
}

public class SingleMethod {
    public static void main(String[] args) {

        // Old School
        Greeting oldGreeting = new GreetingClass();
        oldGreeting.hello("Shashank");

        // Inline
//        Anonymous Class
        Greeting latestGreeting = new Greeting() {
            @Override
            public void hello(String name) {
                System.out.println("Hello Latest " + name);
            }
        };

        latestGreeting.hello("Shashank");


        //        Lamda Style aka New School
//        Lamda is assignment to an interface
        Greeting modernGreeting = name -> System.out.println("Hello Modern " + name);
        modernGreeting.hello("Shashank");

    }
}
