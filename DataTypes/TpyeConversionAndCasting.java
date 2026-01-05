// Type Conversion and casting.
/*
Casting
We have (Explicit) is called (Casting) in this method we change the value according to the our task.
We have also (Implicit) is called (Conversion) in this method the compiler change the value according to the our task.
We have also (Type Promotion) In this method we will promote the value with the help of they will increase their range.
 
*/


public class TpyeConversionAndCasting {
    public static void main(String[] args) {

        // This is for int to byte & byte to int.
            
        byte bt = 127; // This method is conversion (say automatic conversion with the help of compiler called ({IMPLICIT})).
        int it = bt;
        // bt = it; This wrong method to conversion this. It will throw you error.
        // Output:- 127

        System.out.println(it);

        int a = 257;  // This method is casting (In method we convert the value our self to perform a task called ({EXPLICIT})).
        byte b = (byte) a; //  It will convert the value with the help of (MODULO %) than it will show the value with the final value to the byte value.
        // Output:- 1

        System.out.println(b);

    }
}



//            ***********     Float    ***********
/* 
 If you try to convert the value into it. you loose some value.
 you also conversion in the float but you loose some value in it.

 {

    float ft = 5.6f;
    int in = (int) f; // If you try to convert the value into it. you loose some value.
    output:- 5

    int in = 58;
    float ft = (float) in; // It will work on in both types.
    output:- 58.0

 }

*/





//         ***********     Type Promotion   **********

/*
Another method we will see here is called type promotion in this they will promote the value into another type.
To increase there size of the value.

 {

    byte a = 10;
    byte b = 30;

 }
     
    int result = a * b; // The reason of using int if we perform the task there size will be going out of range. 
                        // so here we use int type promotion with the help of we we convert the value into byte to int to increase the range.

*/