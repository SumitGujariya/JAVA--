// package ObjectOrientedProgramming.OopsConcept;

// This is parameter constructor.
class Cars {
    String colors;
    String brand;
    int releas;

    public void printDetails() {
        System.out.println(this.colors);
        System.out.println(this.brand);
        System.out.println(this.releas);

    }
}

public class PC {
    public static void main(String[] args) {

        Cars c1 = new Cars();
        c1.colors = "Pink";
        c1.brand = "Swift";
        c1.releas = 1998;

        c1.printDetails();
    }
}
