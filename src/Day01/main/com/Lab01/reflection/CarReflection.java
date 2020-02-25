package Day01.main.com.Lab01.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class CarReflection {

    public static void main(String[] args) throws Exception {
        Car myCar = new Car();
        System.out.println(myCar.getYear());
        Class myCarCls = myCar.getClass();
        Field field = myCarCls.getDeclaredField("year");
        field.setAccessible(true);
        field.set(myCar, 2019);
        System.out.println(myCar.getYear());

        //myCar.setYear(2019);


        Class cls = Class.forName("com.reflection.Car");
        Constructor constructor = cls.getConstructor();
        Object bmw = constructor.newInstance();

        Field modelField = cls.getDeclaredField("model");
        modelField.setAccessible(true);
        modelField.set(bmw, "BMW");
        System.out.println(modelField.get(bmw));

        Field yearField = cls.getDeclaredField("year");
        yearField.setAccessible(true);
        yearField.set(bmw, 2019);
        System.out.println(yearField.get(bmw));
    }

}