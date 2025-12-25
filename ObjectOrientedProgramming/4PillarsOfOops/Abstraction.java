/*
We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details. 
With definition of properties of problems, including the data which are affected and the operations which are identified, 
the model abstracted from problems can be a standard solution to this type of problems. 
It is an efficient way since there are nebulous real-life problems that have similar properties.  
In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user. 

Data binding : Data binding is a process of binding the application UI and business logic. Any change made in the business logic will reflect directly to the application UI.
*/

// An abstract class must be declared with an abstract keyword.
abstract class Animal {
    /*
     * This is the example of contructor.
     * Animal() {
     * System.out.println("Constructor of the Animal");
     * }
     */
    public abstract void walk(); // This is a abstract method.

    public void eats() { // This one is non-abstract method.
        System.out.println("Animal can eats"); // Now all the (Sub) class inherit the method of (Base) class.
    }
}

class Horse extends Animal { // you can also abstaract this class then you want to another class after this.
    /*
     * This is the example of contructor.
     * Horse() {
     * System.out.println("Constructor of the Horse");
     * }
     */
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Murgi extends Animal { // This class will you say concrete class.
    /*
     * Murgi() {
     * System.out.println("Constructor of the Murgi");
     * }
     */
    public void walk() {

        System.out.println("Murgi walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.walk();
        hr.eats();

        Murgi mr = new Murgi();
        mr.walk();
        mr.eats();

        // This will not work its just a blueprint like you say it just a imagination
        // Animal an = new Animal();
        // an.walk();
    }
}
