// Static method.
 
// first example.
/*
class Student {
    String name;
    static String school; // If you want same school name for everyone just define with the static keyword. ham static un chijo ko banate h jo sab ke liye same ho example;- school.

    // You write a function to change the name of any static you want to change.
    public static void changeSchool() {
        school = "newSchool";
    }
}

public class Static {
    public static void main(String[] args) {
        Student.school = "SUGMN"; // You can access static properties direct with the help of their (Class) name.
        Student std = new Student(); // this one for there name properties.
        std.name = "Sumit";
        System.out.println(std.name);
    }
}

*/
 
 
 

 // Another example.
 
 class Mobile {
    String brand;
    int price;
    static String name; // a static keyword you call with the help of their class name.
    
    // this is constructor of the class.
    // public Mobile() { 
    //     brand = "";
    //     price = 200;
    //     System.out.println("In constructor block");
    // }

    // this is we called static block.
    // whenever you put the static block it's execute the first.
    // static { 
    //     name = "phone";
    //     System.out.println("In static block");
    // }

    // this is instant varibles it's a non-static method you can not call with the help of class name.
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }


    // this is static method this method you can call with the help of their class name.
    // you never use the directly non static varibles inside the static method but indirectly.
    // but you can use the non static varibles in static method with the help of their object to set the parameters with class name and their object name.
    public static void show1(Mobile mb) {
        System.out.println(mb.brand + " : " + mb.price + " : " + Mobile.name);
    }
}

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile"); // this is another method with the help of you call class.

        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 12200;
        Mobile.name = "Smartphone"; // You call the static variables with the help of their class name not a object.
        
        Mobile mb2 = new Mobile();
        mb2.brand = "Google";
        mb2.price = 19990;
        Mobile.name = "Smartphone";
        
        // Mobile.name = "DeadPhone"; // you can change the value of the statid variables then it will change for everyone.
        
        mb1.show(); // but this non static method you only call with the help of their object whatenver you define the object name.
        mb2.show(); 

        Mobile.show1(mb1); // here's you can call the static method with the help of their class name directly.
    }
}