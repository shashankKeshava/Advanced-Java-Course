package Day01.main.Lab01;

import java.util.HashMap;
import java.util.Map;

public class MyStore {

    Map<Integer,String> RomanNumber=new HashMap<Integer, String>();
    public void add(int number,String value){
        RomanNumber.put(number,value);
    }

    public String get(int number){
        try {
            return RomanNumber.get(number);
        }catch (NullPointerException e){
            return "Not Found";
        }

    }

    public Integer gertSize(){
        return RomanNumber.size();
    }
}

