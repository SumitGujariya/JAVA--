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
*/

    //  int myNum = 5;               // Integer (whole number)
    //  float myFloatNum = 5.99f;    // Floating point number
    //  Scientific Numbers
    //  A floating point number can also be a scientific number with an "e" to indicate the power of 10.
    //  Example
    //  float f1 = 35e3f;
    //  double d1 = 12E4d;
    //  System.out.println(f1);
    //  System.out.println(d1);
    //  char myLetter = 'D';         // Character, the char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'.
    //  boolean myBool = true;       // Boolean, For this, Java has a boolean data type, which can only take the values true or false.
    //  String myText = "Hello";     // String, The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes.

 
public class Datatypes {
    public static void main(String[] args) {
    // For all those datatypes are explain in starting the file.
        byte by = 1;
        System.out.println(by);
        short sh = 197;
        System.out.println(sh);
        int it = 2009;
        System.out.println(it);
        long ln = 200945678L;
        System.out.println(ln);
        float ft = 3.14F; // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles.
        System.out.println(ft);
        double db = 3.141597845; // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles.
        System.out.println(db);
        char ch1 = 'a'; // In char you only use single quote to store the value, it will not allow to a double inverted comaa.
        System.out.println(ch1);
        char ch2 = '1'; // As 1 is inside single inverted comma, hence it will be treated as character. It will treated as a literals.
        System.out.println(ch2);
        boolean tru = true; // Stores true or false values.
        System.out.println(tru);
        boolean fal = false; // Stores true or false values.
        System.out.println(fal);
    }
}


