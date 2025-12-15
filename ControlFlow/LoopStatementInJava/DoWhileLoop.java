/*
The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. 
Then it will repeat the loop as long as the condition is true.
In the while loop chapter, we saw that if the condition is false at the beginning, the loop never runs at all.
The do/while loop is different: it will always run the code block at least once, even if the condition is false from the start.
In the example below, the variable i starts at 10, so i < 5 is false immediately. Still, the loop runs once before checking the condition:


Do-while Loop Syntax:
<iterator-initialization>

do {
    // Block of code to execute.

    <update iterator>
} (<condition>)

package LoopingStatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int iterator = 0;
        do {
            System.out.println(iterator);
            iterator++;
        } while (iterator <= 20);
    }
}
*/


// Using Example.
package LoopStatementInJava;

// The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("i is " + i);
            // Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!
            i++;
        } 
        while (i<11); // The semicolon ; after the while condition is required!
    }
}