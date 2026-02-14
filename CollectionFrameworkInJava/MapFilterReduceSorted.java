package CollectionFrameworkInJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MapFilterReduceSorted {
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    	
//    	Predicate<Integer> p = new Predicate<Integer>() {
//    		public boolean test(Integer n) {
//    			return n%2==0;
//    			if(n%2==0)
//    				return true;
//    			else
//    				return false;
//    		}
//    	};
    	
//    	Predicate<Integer> p = n-> n%2==0;
    	
    	
//    	Function<Integer, Integer> fun= new Function<Integer,Integer>() {
//    		public Integer apply(Integer n) {
//    			return n*2;
//    		}
//    	};
    	
//    	Function<Integer,Integer> fun= n-> n*2;
 	
    	
//    	int result=nums.stream()
//    					.filter(n-> n%2==0)
//    					.map(n->n*2)
//    					.reduce(0, (c,e)-> c+e);
//    	System.out.println(result);
    	
//    	Stream<Integer> sortedValues = nums.stream()
//    			.filter(n-> n%2==0)
//    			.sorted();
    	
    	Stream<Integer> sortedValues = nums.parallelStream()
    			.filter(n-> n%2==0)
    			.sorted();
    	
    	sortedValues.forEach(n -> System.out.println(n));
    }
}


/*
package CollectionFrameworkInJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// MapFilterReduceSorted.
// Demonstrates core Stream API operations.
// filter → map → reduce → sorted.
// Shows functional programming style in Java.

public class MapFilterReduceSorted {
    public static void main(String[] args){   

    	// Creating a fixed-size List using Arrays.asList().
    	// Cannot add or remove elements.
    	List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

    	// Predicate Interface.
    	// Represents a boolean condition.
    	// Used mainly with filter().
    	// test(value) → returns true or false.

    	// Predicate using anonymous class (commented).
//    	Predicate<Integer> p = new Predicate<Integer>() {
//    		public boolean test(Integer n) {
//    			return n % 2 == 0;
//    		}
//    	};

    	// Predicate using lambda expression (commented).
//    	Predicate<Integer> p = n -> n % 2 == 0;

    	// Function Interface.
    	// Represents transformation logic.
    	// Used mainly with map().
    	// apply(input) → returns output.

    	// Function using anonymous class (commented).
//    	Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//    		public Integer apply(Integer n) {
//    			return n * 2;
//    		}
//    	};

    	// Function using lambda expression (commented).
//    	Function<Integer, Integer> fun = n -> n * 2;

    	// Map–Filter–Reduce pipeline (commented).
    	// 1) filter even numbers.
    	// 2) double each number.
    	// 3) sum all values.
//    	int result = nums.stream()
//    					.filter(n -> n % 2 == 0)
//    					.map(n -> n * 2)
//    					.reduce(0, (c, e) -> c + e);
//    	System.out.println(result);

    	// sorted().
    	// Arranges stream elements in natural ascending order.

    	// stream() vs parallelStream().
    	// stream()        → sequential processing.
    	// parallelStream()→ parallel processing using multiple threads.

    	// Creating a stream pipeline.
    	// Filters even numbers and sorts them.
    	Stream<Integer> sortedValues = nums.parallelStream()
    			.filter(n -> n % 2 == 0)
    			.sorted();

    	// Terminal operation.
    	// forEach() triggers execution of stream pipeline.
    	sortedValues.forEach(n -> System.out.println(n));
    }
}
*/