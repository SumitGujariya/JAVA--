import java.lang.Exception;

// Try catch in exception handling.

// public class ExTryCatch {
//     public static void main(String[] args) {
//         int i = 9;
//         int j = 0;
//         try {
//             j = 18 / i;
//         } 
//         catch (ArithmeticException e) {
//             System.out.println("something went wrong");
//         }
//         System.out.println(j);
//         System.out.println("bye");
//     }
// }


// Example of try catch using multiple catch block.


public class ExTryCatch {
    public static void main(String[ ] args) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
    String str = null;
    
    // It is good to try for critical condition.
    try {
        j = 18/i;
        System.out.println(str.length());
        System.out.println(nums[1]);
        System.out.println(nums[5]);
    } 
    catch (ArithmeticException e) { // You can aslo specify the exception what type of execption is.
    System.out.println("can not divide by zero"); 
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("you try to access out of the array");
}
catch (Exception e) {
    System.out.println("something went wrong");
}
}
}

