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
