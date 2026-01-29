/* 
Java Variables

Variables are containers for storing data values.
In Java, there are different types of variables, for example:
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes*/

/*
Variables.
The variable are the containers in which the values are stored just like water inside water bottle.

Syntax to declare the variable:
<datatype> <variable-name>;

Giving the value to variable:
<variable-name> = <value>;

We can combine the above two steps like:
<datatype> <variable-name> = <value>;
*/

// public class Variables {
//     public static void main(String[] args) {

//         int variableOne = 4;
//         double variableTwo = 3.14159;
//         System.out.println(variableOne);
//         System.out.println(variableTwo);

//     }
// }

public class Variables {
    public static void main(String[] args) {
        int a = 45;
        int b = 55;
        int result = a + b;
        System.out.println(result);
    }
}