public class ExTryCatch {
    public static void main(String[] args) {
        int i = 9;
        int j = 0;
        try {
            j = 18 / i;
        } 
        catch (ArithmeticException e) {
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
