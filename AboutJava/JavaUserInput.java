package AboutJava;
// Java user input.

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");
        
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Salary is " + salary);
        

    }
}
