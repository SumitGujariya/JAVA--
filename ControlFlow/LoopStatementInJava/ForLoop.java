/*
Sets a variable before the loop starts: int i = 0
Sefines the condition for the loop to run: i < 5. If the condition is true, the loop will run again; if it is false, the loop ends.
Sncreases a value each time the code block has run: i++
Just like a while loop, a for loop may also never run. If the condition is false right from the start, the code inside the loop will be skipped entirely:



For Loop Syntax:
for (<iterator-initialization>; <condition>; <update>) {
    // Block of code to execute.
}

public class ForLoop {
    public static void main(String[] args) {
        for(int iterator = 0; iterator <= 20; iterator++) {
            System.out.println(iterator);
        }
    }
}
*/
// ForLoop Using Example.
package LoopStatementInJava;

public class ForLoop {
    public static void main(String[] args) {
        // int i = 0; // You can define the value eveywher, If you decide in (For Loop) already


        for (int i = 0; i < 5; i++) { // In this line you write all the condition at once you dont need to define variable in any other side.
        // for (int i = 0; i < 5; i++) { // If you write (i<5) it will print before raching the value 5 it will run the loop (0 to 4).
        // for (int i = 0; i <= 5; i++) { // If you write (i<=5) it will print untill it gets 5 value
            System.out.println("For loop " + i);
        }
    }
}

/*            ******   Nested Loops    *******

// This is the example of nested loop.
// Nested loop is use to write the loop inside the loop.
// It is also possible to place a loop inside another loop. This is called a nested loop.
// The "inner loop" will be executed one time for each iteration of the "outer loop":

public class ForLoop {
    public static void main(String[] args) {
        int i = 0; // if you 

        for (int iterator = 0; i <= 5; i++) { // It will run 5 times.
            System.out.println("This is For loop" + iterator);
            int j = 0;  // You need to write this nested loop inside the single block of code.
            for (int jitendra = 0; j <= 3; j++) { // It will run 3 times after first loop reapeted their loop.
                System.out.println("This is nested loop" + jitendra);
        }
        }
    }
}
*/


/*          *******    For Each Loop    *******
// There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data structures).
// The for-each loop is simpler and more readable than a regular for loop, since you don't need a counter (like i < array.length).

public class NestedLoop {
  public static void main(String[] args) {
    String[] cars = {"Maruti", "Scorpio", "Fortuner", "Wolkswagon"};
    
    for (String car : cars) {
      System.out.println(car);
    }    
  }
}

*/


/*
Question No 1
Use a loop to calculate the factorial of a given number:

Example

public class ForLoop {
  public static void main(String[] args) { 
    int n = 5;
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    System.out.println("Factorial of " + n + " is " + fact);
  }
}
// Output: Factorial of 5 is 120
*/