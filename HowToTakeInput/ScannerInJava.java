package HowToTakeInput;
import java.util.Scanner; // Import the Scanner class


// Scanner input method it's update by the 1.5 its easy and use more than bufferreader.
// The Scanner class is used to get user input, and it is found in the java.util package.
// To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. we will use the nextLine() method, which is used to read Strings.
/*
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

// That much method you can use in.
Method	        Description
nextBoolean()	  Reads a boolean value from the user.
nextByte()	    Reads a byte value from the user.
nextDouble()	  Reads a double value from the user.
nextFloat() 	  Reads a float value from the user.
nextInt()	      Reads a int value from the user.
nextLine()	    Reads a String value from the user.
nextLong()	    Reads a long value from the user.
nextShort()	    Reads a short value from the user.
*/




// Here's example using diffrent method in single user input.
public class ScannerInJava {
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
