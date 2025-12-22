// package ObjectOrientedProgramming.OopsConcept;

// NON parameter constructor.
// If we not wirte any constuctor then java make by default contructor.
// In this (NPC) make their own constructor.
class Cars { 
    String colors; 
    String brand; 
    int releas;
    
    public void running() {
        System.out.println("this car is running as fast as you think " + colors + brand + releas);
    }

    
    
    Cars() {
        System.out.println("this is non paremeter constructor");
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