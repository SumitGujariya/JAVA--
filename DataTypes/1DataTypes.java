// This is the complete datatypes with there types Primitive & Non Primitive.

/*
Datatypes:
The type of value (data) which is used in a program. There is a two types of datatypes, i.e.
1. Primitive datatypes: Refers to pre-defined data, which represents a single value.
    1. byte: An 8-bit signed integer, ranging from -128 to 127.
    2. short: A 16-bit signed integer, ranging from -32,768 to 32,767.
    3. int: A 32-bit signed integer, ranging from -2,147,483,648 to 2,147,483,647.
    4. long: A 64-bit signed integer, ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
    5. float: A 32-bit single-precision floating-point number, used for decimal values with less precision.
    6. double: A 64-bit double-precision floating-point number, used for decimal values requiring higher precision.
    7. char: A 16-bit Unicode character, representing a single character.
    8. boolean: Represents a logical value, either true or false.

2. Non-primitive datatypes: Refers to data types where instead of storing actual values, they store the reference (memory address) of the data.
    1. Arrays: Arrays are used to store multiple values of same datatype in single variable. The datatype can be primitive or non-primitive.
    2. String: Strings are sequences of characters and are widely used for representing text. In Java, String is a class, making it a non-primitive data type.
    3. Enums: An enum (short for enumeration) in Java is a special data type used to define a fixed set of constant values.
    4. Class: The class is a user-defined datatype. These work as blueprints for the objects.
    5. Interface: Defines the methods a class must implement. These act as blueprints for class.

    For class and interface, go to Object Oriented Programming module.

    Data types are divided into two groups:
    Primitive data types - includes byte, short, int, long, float, double, boolean and char
    Non-primitive data types - such as String, Arrays and Classes.
*/

    //  int myNum = 5;               // Integer (whole number)
    //  float myFloatNum = 5.99f;    // Floating point number
    // Scientific Numbers
     //   A floating point number can also be a scientific number with an "e" to indicate the power of 10.
     //   Example
     //   float f1 = 35e3f;
     //   double d1 = 12E4d;
     //   System.out.println(f1);
     //   System.out.println(d1);
    //  char myLetter = 'D';         // Character, the char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'.
    //  boolean myBool = true;       // Boolean, For this, Java has a boolean data type, which can only take the values true or false.
    //  String myText = "Hello";     // String, The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes.




//         **************   Primitive DataTypes   *************

/* 
public class PrimitiveDatatypes {
    public static void main(String[] args) {
    // For all those datatypes are explain in starting the file.
        byte by = 1;
        short sh = 197;
        int it = 2009;
        long ln = 200945678L;

        float ft = 3.14F; // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles.
        double db = 3.141597845; // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles.

        char ch1 = 'a'; // In char you only use single quote to store the value it will not allow to a double inverted comaa.
        char ch2 = '1'; // As 1 is inside single inverted comma, hence it will be treated as character. It will treated as a literals

        boolean tru = true; // Stores true or false values
        boolean fal = false; // Stores true or false values
    }
}

*/

//       ************   Non Primitive DataTypes   *************

/*
Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main differences between primitive and non-primitive data types are:
Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
Primitive types always hold a value, whereas non-primitive types can be null.
Examples of non-primitive types are (Strings), (Arrays), (Classes) etc. You will learn more about these in a later chapter.

*/

/*

/*
                       *********     Arrays:     *********

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
These values in array are known as element and are stored at contiguous memory location.
Each element have a particular index, which starts from 0 to infinite.

Syntax:
<datatype>[] <array-name> = {<value1>, <value2>, ......, <value n>};
*/


// package NonPrimitiveDatatypes;

// public class Arrays {
//     public static void main(String[] args) {
//         int[] integer_array = {1, 2, 3, 4, 5, 6};

//         // We can access each element inside array using index.
//         System.out.println(integer_array[0]); // OUTPUT: 1 as first element in array is 1.
//         System.out.println(integer_array[1]);
//         System.out.println(integer_array[2]);

//         // Also we can iterate over the array to access all elements.
//         System.out.println("------------- Output using loop -----------------");
//         for (int index = 0; index < integer_array.length; index++) {
//             System.out.println(integer_array[index]);
//         }

//         // -------------------------------------------------------------------------------------------------------------

//         // This is a two-dimensional array. Basically an array inside another array. This is usually known as matrix.
//         int[][] two_d_array = {
//                 {0, 2, 4, 6},
//                 {3, 5, 7, 9}
//         };

//         System.out.println("------------- Output of two dimensional array -----------------");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print(two_d_array[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }

/*     
                         *******   Enum   *******

Enum is a special type that gives you the options for values. Apart from these values you cannot have any other values.
You can’t assign a value that’s not defined in the enum.

Example:
Directions (NORTH, SOUTH, EAST, WEST)
Order status (PENDING, SHIPPED, DELIVERED)
*/

// package NonPrimitiveDatatypes;

// // Basic enums
// enum Direction {
//     NORTH,
//     SOUTH,
//     EAST,
//     WEST
// }

// // Advance enums
// enum Color {
//     RED("#FF0000"),
//     GREEN("#00FF00"),
//     BLUE("#0000FF");
//     private final String hexCode;

//     // Constructor
//     Color(String hexCode) {
//         this.hexCode = hexCode;
//     }

//     public String getHexCode() {
//         return hexCode;
//     }

// }

// public class Enums {
//     public static void main(String[] args) {
//         Direction currentDirection = Direction.NORTH;

//         if (currentDirection == Direction.NORTH) {
//             System.out.println("We are heading towards north.");
//         }
//         else if (currentDirection == Direction.SOUTH) {
//             System.out.println("We are heading towards south.");
//         }
//         else if (currentDirection == Direction.EAST) {
//             System.out.println("We are heading towards south.");
//         }
//         else if (currentDirection == Direction.WEST) {
//             System.out.println("We are heading towards south.");
//         }

//         // -----------------------------------------------------
//         Color color = Color.RED;
//         System.out.println("HEX Code of " + color + ": " + color.getHexCode());
//     }
// }


/*
                      *******   Strings    *******

Strings are sequence of characters. Understand like them as any text.
They are written inside double inverted comma("").
Although the string seems to be primitive datatype, but it is actually a class in java.lang package.

We can create string using three keywords:
1. String:
    Immutable,
    Thread-safe,
    Slow for repeated modification,
    Suitable where the string is constant.

2. StringBuffer:
    Mutable,
    Thread-safe (Synchronized)
    Slow as compared to StringBuilder,
    Suitable where multiple threads are accessing and modifying the string.

3. StringBuilder
    Mutable,
    Not thread-safe,
    Fastest
    Suitable where single thread is accessing and modifying the string.
*/

// package NonPrimitiveDatatypes;

// public class Strings {
//     public static void main(String[] args) {
//         // String build using String class.
//         String text1 = "Hello1";
//         System.out.println(text1);

//         // String build using StringBuffer class.
//         StringBuffer text2 = new StringBuffer("Hello2");
//         System.out.println(text2);

//         // String build using StringBuilder class.
//         StringBuilder text3 = new StringBuilder("Hello3");
//         System.out.println(text3);

//         // We can check for text1 characters same as text2 by using .equals().
//         if (text1.equals("Hello1")) {
//             System.out.println("Text 1 and Text 2 are both equal");
//         }
//         else {
//             System.out.println("Text 1 and Text 2 are not equal");
//         }
//     }

// }