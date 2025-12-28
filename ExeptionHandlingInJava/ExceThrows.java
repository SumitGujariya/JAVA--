// It is good to write with the class.
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