/*
// First example usin normal try catch.
public class ExceptionDemo {                     // Try to write the diffrent type of name to avoid the error not write directlu the name of (Exception).
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // Error!

    // It is good to try for critical condition.
    
    try {
      int nums[] = {1, 2, 3};
      System.out.println(nums[20]);
    } catch (Exception e) {                     // You can aslo specify the exception what type of execption is.
      System.out.println("Something went wrong"); 
    }
  }
}

*/

public class ExceptionDemo {
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
