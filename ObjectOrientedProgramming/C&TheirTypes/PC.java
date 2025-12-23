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

    Cars(String colors, String brand, int releas) {
        this.colors = colors;
        this.brand = brand;
        this.releas = releas;
    }
}

public class PC {
    public static void main(String[] args) {
        Cars c1 = new Cars("Black", "Supra", 1999);

        c1.printDetails();
    }
}
