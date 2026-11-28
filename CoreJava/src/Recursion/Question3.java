package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3 {
    /*Types of Recursion
    * 1- Head Recursion :-> write a head recursive call always remember that function call always above from the work ;
    * 2- Tail Recursion :-> when u write a tail recursion always work above from the function calls;
    *  */


    static void printHeadRecursion(int n){
        //Head Recursion
        if(n==1){
                System.out.print(n+" ");
                return;
        }
        printHeadRecursion(n-1);
        System.out.print(n+" ");

    }
    static void printTailRecursion(int n){
        //Tail Recursion
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printTailRecursion(n-1);

    }
    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Printing numbers from 1 to " + (n));
        printHeadRecursion(n);
        System.out.println(
        );
        System.out.println("Printing numbers from "+n+" to 1");
        printTailRecursion(n);



    }
}
