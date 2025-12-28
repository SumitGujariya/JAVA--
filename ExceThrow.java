
class SumitException extends RuntimeException {
    public SumitException(String string) { 
        super(string);  
    }
}

public class ExceThrow  {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i; 
            if (j==0)
                throw new SumitException("I don't have time to print zero dude");
        } 
        catch (SumitException e) { // Here's you catching the exception you built, here you need to pass the name of your exception you creating.
            j = 18 / 1;
            System.out.println("You are not in you limit..." + e );
        } 
        catch (Exception e) {
            System.out.println("something went wrong...");
        }
        System.out.println(j);
        System.out.println("Byee");
    }
}
