// This is called multiple inheritance 
// This concept we not use in (OOPS) 

interface Animal {
    int eyes = 2; // If you define the properties so define the fix number of properties you can
                  // not change it's follows by the animal classes.

    void walk(); // Here's if you not write the public its use default it okk, it's still working.

}
// This is the example of the multiple inheritance.
interface Herbivore {

}

class Horse implements Animal, Herbivore { // we extract the properties with the help of (Implements) keyword.
    public void walk() { // But if you not use here's public it's throw you error.
        System.out.println("Horse walk on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.walk();
    }
}