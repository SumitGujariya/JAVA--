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

        while (i<=4) {
            System.out.println("Hii " + i);

            int j = 0;
            while (j<=3) {
                System.out.println("Hello compiler");
                j++;
            }
            i++;
        }
    }
}
