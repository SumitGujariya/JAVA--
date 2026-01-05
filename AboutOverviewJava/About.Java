/* 
Every line of code that runs in Java must be inside a class. The class name should always start with an uppercase first letter. In our example, we named the class Main.
Note: Java is case-sensitive. MyClass and myclass would be treated as two completely different names.
The name of the Java file must match the class name. So if your class is called Main, the file must be saved as Main.java.
This is because Java uses the class name to find and run your code. If the names don't match, Java will give an error and the program will not run.
When saving the file, save it using the class name and add .java to the end of the filename. To run the example above on your computer, make sure that Java is properly installed.

Hello World
The main Method
The main() method is required in every Java program. It is where the program starts running.

public static void main(String[] args)
Any code placed inside the main() method will be executed.
For now, you don't need to understand the keywords public, static, and void.ust remember: main() is the starting point of every Java program.
System.out.println()
Inside the main() method, we can use the println() method to print a line of text to the screen.

Example
public static void main(String[] args) {
  System.out.println("Hello World");
}

Note: The curly braces {} mark the beginning and the end of a block of code.
System.out.println() may look long, but you can think of it as a single command that means: "Send this text to the screen."
Here's what each part means (you will learn the details later):

System is a built-in Java class.
out is a member of System, short for "output".
println() is a method, short for "print line".
Example
System.out.println("Hello World!");

You can add as many println() methods as you want. Note that it will add a new line for each method.
Finally, remember that each Java statement must end with a semicolon (;).
System.out.println("Java is fun!");
It is important that you end the statement with a semicolon (;) .
If you forget the semicolon (;), an error will occur and the program will not run:
Example
System.out.println("Java is fun!")
Result:
error: ';' expected
*/

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}