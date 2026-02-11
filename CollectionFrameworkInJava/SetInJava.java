package CollectionFrameworkInJava;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;

/*
import java.util.List;
import java.util.ArrayList;

public class SetInJava {
    public static void main(String[] args){   
    	
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);  
    	nums.add(2);
    	nums.add(6);
    	//nums.add("5");
    	
    	for(Object n:nums)
    	{
    		int num=(Integer)n;
    		System.out.println(num+2);
    	}
    }
}
*/

public class SetInJava {
    public static void main(String[] args){   
    	
//    	Set<Integer> nums = new HashSet<Integer>();  	
//    	Set<Integer> nums = new TreeSet<Integer>();
    	Collection<Integer> nums = new TreeSet<Integer>();
    	nums.add(62);
    	nums.add(54);
    	nums.add(82);
    	nums.add(21);
    	
    	//nums.add("5");
    	
    	Iterator<Integer> values = nums.iterator();
    	
    	while(values.hasNext())
    		System.out.println(values.next());
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(n);
//   	}
    }
}


// complete example of setinjava.

/*
package CollectionFrameworkInJava;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;

// SetInJava.
// Demonstrates Set interface and its implementations.
// Focuses on uniqueness, ordering, and iteration methods.

public class SetInJava {
    public static void main(String[] args){   

    	// Set Interface.
    	// Stores UNIQUE elements only.
    	// Duplicate values are automatically ignored.
    	// Does NOT support index-based access.

    	// HashSet.
    	// No duplicate elements.
    	// No guaranteed order.
    	// Faster than TreeSet.
//    	Set<Integer> nums = new HashSet<Integer>();

    	// TreeSet.
    	// No duplicate elements.
    	// Elements are stored in SORTED (ascending) order.
    	// Slower than HashSet due to sorting.
//    	Set<Integer> nums = new TreeSet<Integer>();

    	// Collection reference.
    	// Demonstrates polymorphism.
    	// Allows switching implementations without changing logic.
    	Collection<Integer> nums = new TreeSet<Integer>();

    	// Adding elements:
    	// Duplicate values (if any) will be ignored by Set
    	nums.add(62);
    	nums.add(54);
    	nums.add(82);
    	nums.add(21);

    	// Invalid.
    	// Sets are type-safe with generics.
    	// nums.add("5");

    	// Iterator:
    	// Used to traverse Collection elements
    	// Works for all Collection implementations
    	Iterator<Integer> values = nums.iterator();

    	// Iterating using Iterator
    	while (values.hasNext())
    		System.out.println(values.next());

    	// Enhanced for-loop (alternative):
    	// Simpler and more readable
//    	for (int n : nums)
//    	{
//    		System.out.println(n);
//    	}
    }
}

*/