// package ObjectOrientedProgramming.4PillarsOfOops;
// Types of polymorphism function (method) overloading and function (method) overwriding.
// First type is Compile Time Polymorphism (Static).
// Second type is Runtime Polymorphism (Dynamic).

class Pens {
    String colors;
    int price;
    
    // In polymorphism you write a same name of function and return type.
    // In polymorphism you can not call your parameters again & again. but in case your want same parameters you write different function to call this.
    // You write your parameters like this (String) and your parameters name you want to call.
    // You can call different parameters in same function.
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

        cr.penInfo(cr.colors); // You call your function(method) like this.
        cr.penInfo(cr.price);
        cr.penInfo(cr.colors, cr.price);
        
    }
}


