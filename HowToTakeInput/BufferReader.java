// This is Bufferedreader method which we using to take a input to the user.


package HowToTakeInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class BufferReader {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        br.close();;

    }
    
}
