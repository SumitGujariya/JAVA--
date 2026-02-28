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

// Basic enums
// enum Direction {
//     NORTH,
//     SOUTH,
//     EAST,
//     WEST
// }

// Advance enums
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