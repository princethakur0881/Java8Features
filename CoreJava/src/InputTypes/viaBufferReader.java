package InputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class viaBufferReader {
    void main() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        String  str = br.readLine();
        int num = Integer.parseInt(String.valueOf(str.charAt(0)));
        System.out.println(num);
        int num1 = Integer.parseInt(String.valueOf(str.charAt(1)));
        System.out.println(num1);
        int num2 = Integer.parseInt(String.valueOf(str.charAt(2)));
        System.out.println(num2);
        String  str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(str1 + " " + str2);
    }
}
