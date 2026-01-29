package DecisionMakingStatementInJava;
/*
The switch case in Java works like an if-else ladder, i.e., multiple conditions can be checked at once.
Switch is provided with an expression that can be a constant or literal expression that can be evaluated.
The syntax of the switch statement is as follows:

switch(expression)
{
   // The switch block has case statements whose values must be of the same type of expression
   case value1 :
   // Code statement to be executed
   break; // break is optional, but good to use.
   case value2 :
   // Code statement to be executed
   break; // break is optional
   // There can be several case statements
   // When none of the cases is true, a default statement is used, and no break is needed in the default case.
   default : 
 // Code statement to be executed
}
*/

public class Switch {
  public static void main(String[] args) {
    int WeekDays = 5;

    switch (WeekDays) {
      case 1: 
        System.out.println("Monday");
        break; // The break statement is commonly used to exit a switch statement once a matching case has been executed
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
        default: // This default you use when any value not get match than you set default value to show a messaage.
        System.out.println("Enter a valid week day");
    }
  }
}
