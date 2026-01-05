public class LogicalOperators {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        // You apply this with more than 2 condition also.
        System.out.println((num1 > num2) && (num1 < num2));
        // In (&&) logical operators they work like this.
        // T > T = T
        // T > F = F
        // F > T = F
        // F > F = F
        System.out.println((num1 > num2) || (num1 < num2));
        // In (||) logical operators they work like this.
        // F > F = F
        // F > T = T
        // T > F = T
        // T > T = T
        System.out.println(!(num1 > num2));
        // In java it works on convert the value you say. with the help of thsi opertors you 
        // Like it convert (False to True and True to False).
        // Like if you have True and you want print False, than you apply a (Not operation).
        // Like if you have False and you want print True, than you apply a (Not operation).
    }
}