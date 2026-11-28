package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question7 {
    //fibbonacci series 0 1 1 2 3 5 8 13 21 34 . . . .  . . . .
    static int printFibbon(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        return printFibbon(n - 1) + printFibbon(n - 2);

    }
    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(printFibbon(n));

    }
}
