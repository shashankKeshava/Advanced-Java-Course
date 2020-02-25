package Day01.main.com.Lab01;

import java.util.HashMap;
import java.util.Map;

public class MyStore<T1, T2> {
    //    Map<Integer,String> RomanNumber=new HashMap<Integer, String>();
    private Map<T1, T2> RomanNumber;

    public MyStore() {
//        Map<Integer,String> RomanNumber=new HashMap<Integer, String>();
        RomanNumber = new HashMap<T1, T2>();
    }

    public void add(T1 key, T2 value) {
        RomanNumber.put(key, value);
    }

    public String get(T1 key) {
        try {
            return (String) RomanNumber.get(key);
        } catch (NullPointerException e) {
            return "Not Found";
        }

    }

    public Integer gertSize() {
        return RomanNumber.size();
    }
}

