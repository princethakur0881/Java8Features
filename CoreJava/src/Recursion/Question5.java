package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Question5 {
    static int printsimpleFactorial(int n)
    {
        if(n==0) return 1;

       return n*printsimpleFactorial(n-1);
    }

    void main() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    System.out.println(printsimpleFactorial(N));


    }
}
