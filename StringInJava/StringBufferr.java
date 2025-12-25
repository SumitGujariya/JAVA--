package StringInJava;

// This is the example of string buffer
// string buffer is thread safe.
public class StringBufferr {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sumitt");
        sb.append(" Gujariya");
        // sb.insert(6, " kumawat");
        // sb.delete(0, 2);

        System.out.println(sb);
    }
}
