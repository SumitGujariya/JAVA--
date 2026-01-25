package CollectionFrameworkInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListInJava {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums = new ArrayList<Integer>();
//  	Collection nums = new ArrayList();
    	List<Integer> nums = new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");

        Collections.sort(nums);
    	
    	System.out.println(nums.get(2));
    	
    	System.out.println(nums.indexOf(2));
    	
//    	for(int n : nums)
//    	{
//    		System.out.println(nums);	
//    	}
    	for(Object n : nums)
    	{
    		int num = (Integer)n;
    		System.out.println(num);	
    	}
    }
}


/*
package CollectionFrameworkInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ArrayListInJava:
// Demonstrates List interface using ArrayList.
// Focuses on ordering, indexing, sorting, and iteration.

public class ArrayListInJava {
    public static void main(String[] args){   

    	// List Interface:
    	// Allows duplicate elements.
    	// Maintains insertion order.
    	// Supports index-based access.

    	// Different ways to declare ArrayList (commented):
    	// Collection<Integer> nums = new ArrayList<Integer>();
    	// Collection nums = new ArrayList();   // raw type (not recommended)

    	// Preferred:
    	// List reference with generic type safety.
    	List<Integer> nums = new ArrayList<Integer>();

    	// Adding elements.
    	// Elements are stored in insertion order
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);

    	// Invalid:
    	// Generics enforce type safety at compile time.
    	// nums.add("5");

    	// Collections.sort().
    	// Sorts List elements in ascending (natural) order.
    	// Elements must implement Comparable.
        Collections.sort(nums);

    	// get(index):
    	// Retrieves element at a specific index.
    	System.out.println(nums.get(2));

    	// indexOf(value):
    	// Returns index of first occurrence.
    	// Returns -1 if element is not found.
    	System.out.println(nums.indexOf(2));

    	// Enhanced for-loop (commented).
    	// Recommended for readability.
//    	for (int n : nums)
//    	{
//    		System.out.println(n);
//    	}

    	// Iteration using Object reference.
    	// Demonstrates type casting (not required with generics).
    	for (Object n : nums)
    	{
    		int num = (Integer) n;
    		System.out.println(num);
    	}
    }
}

*/


// Not compulsory to read this example.
/*
Just a normal example.

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

*/
