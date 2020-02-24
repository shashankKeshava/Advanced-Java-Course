package Day01.main;

import Day01.main.Lab01.MyStore;

public class main {

    public static void main(String args[]){


        // Lab01 RomanNumbers Excersise
        MyStore store1=new MyStore();
        store1.add(1,"I");
        store1.add(2,"II");
        store1.add(3,"III");
        store1.add(4,"IV");

        System.out.println("Value is:"+store1.get(1));

        System.out.println("Value of invalid index:"+store1.get(10));

        System.out.println("Size of the store is:"+store1.gertSize());
    }

}
