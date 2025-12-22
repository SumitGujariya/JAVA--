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
class Cars {  // This is we calles class
    String colors; // this is the properties of this class
    String brand; 
    int releas;
    
    // This is first method to call the method.
    // You called a properties with the help of function.
    public void running() {
        System.out.println("this car is running as fast as you think " + brand + colors + releas); // You called a multiple properties in single line.
    }

    // This is second method.
    public void pappujii(){
        System.out.println(this.brand + colors + releas) ; // You also called a your properties with the help of (this.method) whatever your method name is depend on you how you descibe them.
    }

    public void pappijii(){
        System.out.println("this car is also running as fast as you think are " + colors + brand + releas);
    }

}

// Note You always write a main function inside the public class.
// This class name is define your .java file name.
public class OOPS { 
    public static void main(String args[]) {
        // Remember the name of the datatype is same as your class name (Ex:- Cars).
        // You always write your object of class is inside the function.
        Cars cr1 = new Cars();
        // You always use there properties and access with the help of (.dot)
        cr1.colors = "Black ";
        cr1.brand = "Toyota ";
        cr1.releas = 1995 ;
        
        // You always use there properties and access with the help of (.dot)
        Cars cr2 = new Cars();
        cr2.colors = "White ";
        cr2.brand = "Mustang ";
        cr2.releas = 1996 ;
        
        // With the help of (.dot) you can call your function.
        // cr1.running();
        cr1.pappujii();
        cr2.pappijii();


    }
}




//  Second Example *************************************************
/*
// Main class: From where the execution of code starts.
class Student {
    String name;
    int age;

    public void details() {
        System.out.println("This details of this student name is " + this.name);
        System.out.println("This details of this student is age is " + this.age);

    }

}

public class OOPS {
    public static void main(String args[]) {
        Student sd = new Student();
        sd.name = "sumit";
        sd.age = 21;

        sd.details();
    }
}

*/