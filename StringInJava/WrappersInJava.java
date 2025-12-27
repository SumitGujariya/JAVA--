package StringInJava;
public class WrappersInJava {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; // This is (autoboxing) is when you stored premetive type into object automatically.
        System.out.println(num1);

        int num2 = num1;  // This is (auto-unboxing) is when you take out the value premetive value for the oject.
        System.out.println(num2);

        // Here's you convert the string value into int with the help of (parse int).
        String str = "20";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*5);
    }
}
