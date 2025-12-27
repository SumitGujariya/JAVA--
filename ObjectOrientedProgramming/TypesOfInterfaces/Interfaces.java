package ObjectOrientedProgramming.TypesOfInterfaces;
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


// another example of interfaces.
/*
interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster");
    }
}

class Developer {
    public void devApps(Computer lap) {
        lap.code();
    } 
}

public class InterfacesJava {
    public static void main(String[] args) {
        
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApps(lap);
    }
}

*/