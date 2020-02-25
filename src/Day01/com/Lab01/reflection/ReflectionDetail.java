package Day01.com.Lab01.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionDetail {

    public static void main(String[] args) throws Exception {
        //java.util.List
        //java.util.ArrayList
        ArrayList<String> lst = new ArrayList<String>();

        //Class cls = Class.forName("java.util.ArrayList");
        Class cls = lst.getClass();
        System.out.println("Name -> " + cls.getName());
        System.out.println("Super class name -> " + cls.getSuperclass().getName());
        System.out.println("Interface ? -> " + cls.isInterface());

        System.out.println("*****FIELDS******");
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }


        System.out.println("******METHODS******");
        Method[] methods = cls.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

        System.out.println("****INTERFACES*****");
        Class[] interfaces = cls.getInterfaces();
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println(interfaces[i].getName());
        }
    }

}