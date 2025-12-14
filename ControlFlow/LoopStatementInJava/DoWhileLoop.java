/*
While Loop Syntax:
<iterator-initialization>

while (<condition>) {
    // Block of code to execute.

    <update iterator>
}

package LoopingStatements;

public class WhileLoop {
    public static void main(String[] args) {
        int iterator = 0;
        while (iterator <= 20) {
            System.out.println(iterator);
            iterator++;
        }
    }
}
*/

package LoopStatementInJava;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // Starts a while loop.
        // Condition: run the loop as long as i is less than or equal to 4.
        // Since i = 1, the condition is true, so the loop starts.
        while (i<=4) { 
            System.out.println("Hii " + i);

            // Declares another integer variable j.
            // Initializes it to 0.
            // This variable controls the inner while loop.
            // IMPORTANT: j is reset to 0 every time the outer loop runs.
            // This is calles nested loop in while loop, Because its written in inside the loop.
            int j = 0; 
            while (j<=3) {  // Starts the inner while loop, Runs as long as j is less than or equal to 3.
                System.out.println("Hello compiler");
                // This is help to run your code at given condition. 
                // Increments j by 1.Prevents an infinite loop.j values will be: 0 → 1 → 2 → 3 → 4
                j++; 
            }
            // Increments i by 1.
            // Moves the outer loop toward termination.
            i++; 
        }
    }
}

/*
How many times does everything run?
Outer loop (i)
Runs 4 times (i = 1 to 4)
Inner loop (j)
Runs 4 times for each outer loop
Total inner executions = 4 × 4 = 16
*/