/*
// Throw keyword.
public class ExceThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;  // Here we are divide the 18 with the value of (i) we set outside the loop.
            if (j==0) // Here you pass the condition.
                throw new ArithmeticException("I don't have time to print zero dude"); // Here you throw the error with the help of throw keyword.
        } 
        catch (ArithmeticException e) { // Here's you Exceptioin catch the error. which error you throw with the help of throw keyword.
            j = 18 / 1;
            System.out.println("You are not in you limit..." + e );
        } 
        catch (Exception e) {
            System.out.println("something went wrong...");
        }
        System.out.println(j);
        System.out.println("Byee");
    }
}

*/




// The throw keyword is used to create a custom error.
// The throw statement is used together with an exception type. There are many exception types available in Java- ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException.

// This is the example of your own exception you can create your own exception.
// you can create your own exceptio with the help of class you need to define class of your name.


// This is class you need to define for your name of exception.
// You also build something to create your own Exception or you extends the value, here we extends the value. 
class SumitException extends RuntimeException { // Here's you extends the properties with the help of (Exception) and also with the help (RuntimeException)
    public SumitException(String string) { // Here's you also need to creat the constructor to print the message, and pass the parameter inside the constructor.
        super(string); // This super we called super class constructor. 
    }
}

public class ExceThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i; 
            if (j==0) // Here you pass the condition.
                // Here you write the exception of your own name.
                throw new SumitException("I don't have time to print zero dude"); // Here you throw the error with the help of throw keyword.
        } 
        catch (SumitException e) { // Here's you catching the exception you built, here you need to pass the name of your exception you creating.
            j = 18 / 1;
            System.out.println("You are not in you limit..." + e );
        } 
        catch (Exception e) {
            System.out.println("something went wrong...");
        }
        System.out.println(j);
        System.out.println("Byee");
    }
}





/*
// It is good to write with the class.
// The throws keyword indicates what exception type may be thrown by a method.
// The throws keyword indicates what exception type may be thrown by a method.
// There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException.
// The throws keyword indicates what exception type may be thrown by a method.
// There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException.

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}

public class ExceThrows {
    static {
        System.out.println("Class loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

*/