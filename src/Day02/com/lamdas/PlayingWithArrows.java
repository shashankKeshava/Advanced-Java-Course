package Day02.com.lamdas;

interface Increment {
    int add(Integer a, Integer b);
}

public class PlayingWithArrows {
    public static void main(String[] args) {
        Increment addNum = (a, b) -> a + b;
        System.out.println(addNum.add(1, 2));
    }
}
