package InputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class viaBufferReaderOptimized {
    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        Double d = Double.parseDouble(br.readLine());
        Character c = br.readLine().charAt(0);
        System.out.println(n);
        System.out.println(str1);
        System.out.println(d);
        System.out.println(c);
    }
}
