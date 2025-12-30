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

        int num = Integer.parseInt(br.readLine()); // Here we convert the value string to int input.
        System.out.println(num);

        br.close(); // How you close the file after read and write inside the file, If you not maybe use you loose you data. so it is good to use close.

    }
    
}



/*
// BufferReader usin try finally block.

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int num = 0;
        BufferedReader br = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally {
            br.close(); // it is good to use close whenever you want to close the connectionand resources.
        }
    }
    
}
*/

// Enhanced bufferreader.
// Here you dont need to close the its close (Autoclosble).
// br will be automatically closed after the block ends.
// No need to write br.close().

/*
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class BufferReader {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
*/