package ObjectOrientedProgramming;

class Computers {
    String brand;
    String processor;
    String gpu;
    int ram;
    int storage;

    Computers(String brand, String processor, String gpu, int ram, int storage) {
        this.brand = brand;
        this.processor = processor;
        this.gpu = gpu;
        this.ram = ram;
        this.storage = storage;
    }
}


public class OOP {
    public static void main(String[] args) {

        // this -> acer
        Computers acer = new Computers (
            "Acer", 
            "AMD Ryzen 5 5900X", 
            "Nvidia GeForce  3050",
            32,
            1
        );
        System.out.println("------------------- Computer -----------------");
        System.out.println("Brand: " + acer.brand);
        System.out.println("Processor: " + acer.processor);
        System.out.println("GPU: " + acer.gpu);
        System.out.println("RAM: " + acer.ram);
        System.out.println("Storage: " + acer.storage);
        System.out.println();

        
        // this -> asus
        Computers asus = new Computers (
            "Asus", 
            "AMD Ryzen 5 5900X", 
            "Nvidia GeForce  3050",
            32,
            1
        );

        System.out.println("------------------- Computer -----------------");
        System.out.println("Brand: " + asus.brand);
        System.out.println("Processor: " + asus.processor);
        System.out.println("GPU: " + asus.gpu);
        System.out.println("RAM: " + asus.ram);
        System.out.println("Storage: " + asus.storage);
        System.out.println();

        // this -> hp
        Computers hp = new Computers (
            "HP", 
            "AMD Ryzen 5 5900X", 
            "Nvidia GeForce  3050",
            32,
            1
        );

        System.out.println("------------------- Computer -----------------");
        System.out.println("Brand: " + hp.brand);
        System.out.println("Processor: " + hp.processor);
        System.out.println("GPU: " + hp.gpu);
        System.out.println("RAM: " + hp.ram);
        System.out.println("Storage: " + hp.storage);
        System.out.println();
    }
}
