// package ObjectOrientedProgramming.OopsConcept;

// This is parameter constructor. where we pass the parameter inside the function.
class Cars {
    String colors;
    String brand;
    int releas;

    public void printDetails() {
        System.out.println(this.colors);
        System.out.println(this.brand);
        System.out.println(this.releas);

    }

    // this constructor takes a parameters to print the value.
    Cars(String colors, String brand, int releas) { // this is the PC we talked about.
        this.colors = colors;
        this.brand = brand;
        this.releas = releas;
    }

}

public class PC {
    public static void main(String[] args) {
        Cars c1 = new Cars("Black", "Supra", 1999); // Here's we pass the value of our properties.

        c1.printDetails();
    }
}

// Learn about super methodd in java constructor.

/*
class A {
    
    public A() {
        super();
        System.out.println("In a");
    }

    public A (int A) {
        super();
        System.out.println("In A int");
    }
}
class B extends A {
    
    public B() {
        super();
        System.out.println("In B");
    }
    public B (int n) {
        super();
        System.out.println("In B int");
    }
}

public class Test {

    public static void main(String[] args) {
        B obj = new B(5);
    }
}
*/