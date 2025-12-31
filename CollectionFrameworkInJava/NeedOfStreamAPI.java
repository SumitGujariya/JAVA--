package CollectionFrameworkInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NeedOfStreamAPI {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
    	
//    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
    	
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}
    	
    	nums.forEach(n -> System.out.println(n));
    	
    	
    	int sum = 0;
    	for(int n : nums)
    	{
    		if(n%2==0)
    		{
    			n = n*2;
    			sum = sum + n;
    		}
    	}
    	
//    	System.out.println(nums);
    	System.out.println(sum);
  
    }
}


// complete code with the example of NeedOfStreamAPI.

/*
package CollectionFrameworkInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// StreamAPI:
// Demonstrates different ways of processing collections
// Shows transition from traditional loops to functional style

public class StreamAPI {
    public static void main(String[] args){   

    	// Creating a fixed-size List using Arrays.asList()
    	// Backed by array → size cannot be changed (no add/remove)
    	List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

    	// Traditional for-loop (commented):
    	// Index-based iteration
//    	for (int i = 0; i < nums.size(); i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}

    	// Enhanced for-loop (commented):
    	// Cleaner iteration without index
//    	for (int n : nums)
//    	{
//    		System.out.println(n);
//    	}

    	// forEach() with lambda:
    	// Internal iteration handled by Java
    	// More concise and readable
    	nums.forEach(n -> System.out.println(n));

    	// Traditional logic to:
    	// 1) Check even numbers
    	// 2) Double them
    	// 3) Calculate sum
    	int sum = 0;
    	for (int n : nums)
    	{
    		if (n % 2 == 0)
    		{
    			n = n * 2;
    			sum = sum + n;
    		}
    	}

    	// Final result after processing
    	System.out.println(sum);

    }
}
*/