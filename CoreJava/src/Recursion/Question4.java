package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {
    static void printTable(int n, int i){
        if(i>10){
            return;
        }
        System.out.println(n+" * "+i+" = "+n*i);
        printTable(n,i+1);

    }
    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       for(int i=1;i<=n;i++){
           System.out.println("Printing table of "+i);
           printTable(i,1);
       }
    }
}
