package ObjectOrientedProgramming.OopsConcept;

// /*
// OBJECT ORIENTED PROGRAMMING SYSTEMS 
// JAVA 

// Object-Oriented Programming is  a  methodology  or paradigm to design a 
// program using classes and objects. It simplifies the software development 
// and maintenance by providing some concepts defined below :  
// Class is a user-defined data type which defines its properties and its 
// functions. Class is the only logical representation of the data. For 
// example, Human being is a class. The body parts of a human being are its 
// properties, and the actions performed by the body parts are known as 
// functions. The class does not occupy any memory space till the time an 
// object is instantiated.
// Object is a run-time entity. It is an instance of the class. An object can 
// represent a person, place or any other item. An object can operate on 
// both data members and member functions. 
// */

// First Example *****************************************
// First you write a class and define his properties inside the class
class Cars { // This is we called class
    String colors; // this is the properties of this class
    String brand;
    int releas;

    // This is first method to call the functions.
    // You called a properties with the help of function.
    public void running() {
        System.out.println("this car is running as fast as you think " + brand + colors + releas); // You called a
                                                                                                   // multiple
                                                                                                   // properties in
                                                                                                   // single line.
    }

    // This is second method.
    public void pappujii() {
        System.out.println(this.colors); // You also called a your properties with the help of (this.method) whatever
                                         // your method name is depend on you how you descibe them.
        System.out.println(this.brand);
        System.out.println(this.releas);
    }

    public void pappijii() {
        System.out.println("this car is also running as fast as you think are " + colors + brand + releas);
    }

}

// Note You always write a main function inside the public class.
// This class name is define your .java file name.
public class Oops {
    public static void main(String args[]) {
        // Remember the name of the datatype is same as your class name (Ex:- Cars).
        // You always write your object of class is inside the function.
        Cars cr1 = new Cars();
        // You always use there properties and access with the help of (.dot)
        cr1.colors = "Black ";
        cr1.brand = "Toyota ";
        cr1.releas = 1995;

        // You always use there properties and access with the help of (.dot)
        Cars cr2 = new Cars();
        cr2.colors = "White ";
        cr2.brand = "Mustang ";
        cr2.releas = 1996;

        // With the help of (.dot) you can call your function.
        // cr1.running();
        cr1.pappujii();
        cr2.pappijii();

    }
}

// Second Example *************************************************
/*
 * // Main class: From where the execution of code starts.
 * class Student {
 * String name;
 * int age;
 * 
 * public void details() {
 * System.out.println("This details of this student name is " + this.name);
 * System.out.println("This details of this student is age is " + this.age);
 * 
 * }
 * 
 * }
 * 
 * public class OOPS {
 * public static void main(String args[]) {
 * Student sd = new Student();
 * sd.name = "sumit";
 * sd.age = 21;
 * 
 * sd.details();
 * }
 * }
 * 
 * Note:- In java we have garbage collections.
 * 
 */


/*
// Another example for better understanding.
class Computer {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
}

public class Test {
    public static void main(String[] args) {
        Computer com = new Computer();
        int in1 = com.add(3, 97);
        int in2 = com.add(3, 4, 5);
        System.out.println(in1);
        System.out.println(in2);
    }
}
*/


/*
// This is the example of object.

class Hii{

    String name;
    int price;

    // This is toString method in object to check the hexacode.
    public String toString() {

        return name + " : " + price;
       }


       // with the help of this method, you can check the value of two object are same,
       public boolean equals(Hii that) {

        if (this.name.equals(that.name) && this.price == that.price) {
            return true;
        }else {
            return false;
        }
       }

    // public void add() {
    //     System.out.println("heyy there");
    // }

    // public void show() {
    //     System.out.println("heyy again");
    // }
}



public class Object {
    public static void main(String[] args) {
        Hii h1 = new Hii();
        h1.name = "sumit";
        h1.price = 34444;
        
        Hii h2 = new Hii();
        h2.name = "sumit";
        h2.price = 34444;

        boolean result = h1.equals(h2);

        System.out.println(result);
    }
}

*/