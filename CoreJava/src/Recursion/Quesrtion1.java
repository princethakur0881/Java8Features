package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quesrtion1 {
    //print number in reverse order with the help of Recursion
    public static void printRecursiveNumber(int number) {
        if (number == 1) {
            System.out.println(number);
            return;
        }
        printRecursiveNumber(number - 1);
        System.out.println(number+" ");
    }
    //Recursion :-> when function calls itself is called recursion and terminated by its base case which write in inner body

    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Printing numbers from 1 to " + (n));
        printRecursiveNumber(n);
    }
}
