// In java the (IF ELSEIF AND ELSE) condition are help you to check the multiple condition.
// The IF condition you to access to check the first condition to check the, if you want chech more conditon with the first conditon.
// You use ELSE IF to check multiple condition. 

// Use of IF

public class IfElseIfElse {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        
        if (a > b)
            System.out.println("A is greater than B");
    }
}

// Use of ELSE 

public class IfElseIfElse {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        
        if (a > b)
            System.out.println("A is greater than B");
        else 
            System.out.println("B is less than A");
    }
}


// Use of ELSE IF

public class IfElseIfElse {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        int c = 9;
        
        if (a > b && a < b)
            System.out.println(a);
        else if (b < c) 
            System.err.println(c);
        else 
            System.out.println("you give a wrong data to the computer");
    }
}

// In IF ELSE we have one more (Ternary operator) in java with the help we reduce the bunch of code line in single line code.


public class IfElseIfElse {
    public static void main(String[] args) {
        int n = 4;
        int m = 5; // Here your value decide what output you get, It's basis one ODD and EVEN number value.
        int result1 = 0;
        int result2 = 0;

        // if (n%2==0) // If the given value divide by 2 than you get the output: 10.
            // result = 10;
        // else        // IF the given value is not divide by 2 than you get the output: 20.
            // result = 20;


        // Another short form write the code
        // The (?) Its workd on if else operators (if it is ture if it is false).
        result1 = n%2==0 ? 10 : 20;
        result2 = m%2==0 ? 10 : 20; // Its works on simple rule is like the given value divie by the 2 its print odd even value other wise its print odd value.
        System.out.println(result1);
        System.out.println(result2);
    }
}

