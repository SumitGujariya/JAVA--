package CollectionFrameworkInJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args) {
        
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(4);
        myNumbers.add(6);
        myNumbers.add(3);
        myNumbers.add(1);
        myNumbers.add(9);

        Collections.sort(myNumbers);

        for (Integer i : myNumbers) {

            System.out.println(i);
        }
    }
}
