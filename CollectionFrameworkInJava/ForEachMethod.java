package CollectionFrameworkInJava;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
    	
//    	Consumer<Integer> con = new Consumer<Integer>() {
//    		
//    		public void accept(Integer n)
//    		{
//    			System.out.println(n);
//    		}
//    	};
    	
    	Consumer<Integer> con = n -> System.out.println(n);
 
    	nums.forEach(n -> System.out.println(n));
   
 //  	nums.forEach(null);
 //   	nums.forEach(con);
    	
    	
    	//nums.forEach(n -> System.out.println(n));
    	
    }
}



// complete understanding of mapfilterreducesorted.


/*
package CollectionFrameworkInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

// ForEachMethod.
// Demonstrates forEach() method and Consumer functional interface.
// Shows how actions are performed on each element of a collection.

public class ForEachMethod {
    public static void main(String[] args){   

    	// Creating a fixed-size List using Arrays.asList().
    	// Elements cannot be added or removed.
    	List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

    	// Consumer Interface.
    	// Represents an action performed on a value.
    	// accept(value) → returns nothing (void).
    	// Commonly used with forEach().

    	// Consumer using anonymous class (commented).
//    	Consumer<Integer> con = new Consumer<Integer>() {
//    		public void accept(Integer n)
//    		{
//    			System.out.println(n);
//    		}
//    	};

    	// Consumer using lambda expression:
    	// Cleaner and more readable.
    	Consumer<Inte

*/