// package ObjectOrientedProgramming.4PillarsOfOops;

class Pens {
    String colors;
    int price;
    
    
    public void penInfo(String colors) {
        System.out.println(colors);
    }
    public void penInfo(int price) {
        System.out.println(price);
    }
    public void penInfo(String colors, int price) {
        System.out.println(colors + " " + price);
    }
    
}


public class Polymorphism {
    public static void main(String[] args) {
        Pens cr = new Pens();
        cr.colors = "Blue";
        cr.price = 5;

        cr.penInfo(cr.colors);
        cr.penInfo(cr.price);
        cr.penInfo(cr.colors, cr.price);
        
    }
}


