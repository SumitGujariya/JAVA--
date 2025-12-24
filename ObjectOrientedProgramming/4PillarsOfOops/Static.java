// Static method.

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
        System.out.println(std.school);
    }
}