// package ObjectOrientedProgramming.OopsConcept;

// NON parameter constructor.
// If we not wirte any constuctor then java make it default contructor.
// In this (NPC) make their own constructor.
class Cars {
    String colors;
    String brand;
    int releas;

    public void running() {
        System.out.println("this car is running as fast as you think " + colors + brand + releas);
    }

    Cars() { // this is NPC we talked about. first compiler print this than print the other value.
        System.out.println("this is non parameter constructor");
    }

}

public class NPC {
    public static void main(String args[]) {
        Cars c1 = new Cars();
        c1.colors = "Yellow ";
        c1.brand = "Nano ";
        c1.releas = 1999;

        c1.running();
    }
}