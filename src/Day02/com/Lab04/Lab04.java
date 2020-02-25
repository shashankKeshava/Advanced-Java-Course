package Day02.com.Lab04;


public class Lab04 {
    public static void main(String[] args) {
        Calc add = (a, b) -> a + b;
        Calc sub = (a, b) -> a - b;
        Calc multipy = (a, b) -> a * b;
        Calc operate = (add);

        System.out.println(add.math(1, 2));
        System.out.println(sub.math(3, 2));
        System.out.println(multipy.math(3, 6));
        System.out.println(operate.math(1, 4));
    }
}
