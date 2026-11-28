package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
    static void printNumberRecursion(int number) {
        if (number == 1) {
            System.out.println(number);
            return;
        }
        System.out.println(number+" ");
        printNumberRecursion(number-1);

    }
    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Printing numbers from "+n+" to 1");
        printNumberRecursion(n);

    }
}
