/*
The syntax of the switch statement is as follows:

switch(expression)
{
   // The switch block has case statements whose values must be of the same type of expression
   case value1 :
   // Code statement to be executed
   break; // break is optional
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
      int WeekDays = 6;

      switch(WeekDays)
      {
        case 1:
        System.out.println("Monday");
        break;
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
      }
    }
}
