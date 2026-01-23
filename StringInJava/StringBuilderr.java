package StringInJava;

// This is string builder.
// String builder is not thread safe.

public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sumitt");
        sb.append(" Gujariya");
        sb.insert(6, " kumawat");
        sb.delete(0, 2);

        System.out.println(sb);
    }
}
