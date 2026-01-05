// package ObjectOrientedProgramming.4PillarsOfOops;

// Inheritance 
class shape {
    String colors;
}

class Triangle extends shape {

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colors = "Pink";
    }
}

// Types of Inheritance

/*
 * // This is singel level inheritance.
 * 
 * class Shape { // this is called Base class or parent class
 * public void area() {
 * System.out.println("Define the area");
 * }
 * }
 * 
 * // We inherit the properties of the base class with the help of (Extends keyword).
 * class Triangle extends Shape { // this is derived class or child class.
 * public void area(int l, int h) {
 * System.out.println(1/2*l*h);
 * }
 * }
 * 
 * 
 * public class shape {
 * public static void main(String[] args) {
 * 
 * }
 * }
 */

/*
 * // This is multi level inheritance.
 * 
 * class Shape { // this is called Base class or parent class.
 * public void area() {
 * System.out.println("Define the area");
 * }
 * }
 * 
 * // We inherit the properties of the base class with the help of (Extends keyword).
 * class Triangle extends Shape { // this is derived class or child class.
 * public void area(int l, int h) {
 * System.out.println(1/2*l*h);
 * }
 * }
 * 
 * // Now this is the derived class of the Triangle.
 * class EquilateralTriangle extends Triangle {
 * public void area(int l, int h) {
 * System.out.println(1/2*l*h);
 * }
 * }
 * 
 * 
 * public class shape {
 * public static void main(String[] args) {
 * 
 * }
 * }
 

// This is Hierarchial inheritance.

// You only inherit the properties of base class.
/*
 * class Shape {
 * public void area() {
 * System.out.println("Define the area");
 * }
 * }
 * 
 * // Ex: 1 Triangle inherit the properties of (Shape) class.
 * class Triangle extends Shape {
 * public void area(int l, int h) {
 * System.out.println(1/2*l*h);
 * }
 * }
 * 
 * // Ex: 2 Circle is also inherit the properties of (Sjape) class.
 * class Circle extends Shape {
 * public void area(int r) {
 * System.out.println((3.14)r*r);
 * }
 * }
 * 
 * public class shape {
 * public static void main(String[] args) {
 * 
 * }
 * }
 */

// This is Hybrid Inheritance
// In Hybrid inheritance we see diffrent types of inheritance at the same place.
// In some branch we see single inheritance and somewhere we see multi level
// inhertance.

// This is multiple inheritance
// We never see multiple inhertance in class form but we write with the help of
// (Interfaces).