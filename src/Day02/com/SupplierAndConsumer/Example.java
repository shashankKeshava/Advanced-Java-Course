package Day02.com.SupplierAndConsumer;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Example {

    public static void main(String[] args) {
        //Supplier
        //that doesn't take anything and just supplies you with data of any TYPE

        Supplier<Integer> random = () -> (int) (Math.random() * 10000);
        System.out.println(random.get());

        Supplier<LocalDate> now = () -> LocalDate.now();
        System.out.println(now.get());

        //Consumer
        //takes an argument of any TYPE and doesn't return anything

        Consumer<String> printer = data -> System.out.println(data);
        printer.accept("Hello World");

        Consumer<String> filewriter = data -> {
            //Write File Ops code
            //write the data to the file
        };
        filewriter.accept("some data");

        Consumer<String> logger = data -> {
            //Log information to the log files
        };
        logger.accept("INFO: Accessed at 12:00:23");


    }

}
