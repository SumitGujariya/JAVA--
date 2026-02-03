package CollectionFrameworkInJava;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class StreamAPI {
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    	
//    	Stream<Integer> s1=nums.stream();
//    	Stream<Integer> s2= s1.filter(n ->n%2==0);
//    	Stream<Integer> s3= s2.map(n->n*2);
//    	int result=s3.reduce(0,(c,e)->c+e);
//    	
//    	s2.forEach(n -> System.out.println(n));
//    	s3.forEach(n -> System.out.println(n));
//    	
//    	s1.forEach(n-> System.out.println(n));
//   	s1.forEach(n-> System.out.println(n));
    	
    	int result=nums.stream()
    					.filter(n -> n%2==0)
    					.map(n -> n*2)
    					.reduce(0, (c,e) -> c+e);
    	System.out.println(result);
    	
    	
    }
}


// complete understanding of streamapi using theory and code.

/*
package CollectionFrameworkInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

// StreamAPI.
// Demonstrates Stream creation, intermediate operations.
// terminal operations, and stream lifecycle.

public class StreamAPI {
    public static void main(String[] args){   

    	// Creating a fixed-size List using Arrays.asList().
    	// Cannot add or remove elements.
    	List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

    	// Stream pipeline broken into steps (commented).
    	// stream()  → creates a Stream
    	// filter()  → intermediate operation (lazy)
    	// map()     → intermediate operation (lazy)
    	// reduce()  → terminal operation (triggers execution)

//    	Stream<Integer> s1 = nums.stream();
//    	Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//    	Stream<Integer> s3 = s2.map(n -> n * 2);
//    	int result = s3.reduce(0, (c, e) -> c + e);

    	// IMPORTANT.
    	// A stream can be consumed ONLY ONCE.
    	// Reusing a stream after terminal operation causes exception.

//    	s2.forEach(n -> System.out.println(n));
//    	s3.forEach(n -> System.out.println(n));
//    	s1.forEach(n -> System.out.println(n));
//    	s1.forEach(n -> System.out.println(n));

    	// Stream pipeline written in fluent style.
    	// 1) filter even numbers.
    	// 2) double each number.
    	// 3) sum all values using reduce().
    	int result = nums.stream()
    					.filter(n -> n % 2 == 0)
    					.map(n -> n * 2)
    					.reduce(0, (c, e) -> c + e);

    	// Final result after stream processing
    	System.out.println(result);
    }
}

*/
