package Patterns;

import java.util.Scanner;

public class Question9 {
    public static void prymid(int n){
        for(int i = 1; i <= n; i++){
            for(int spaces =n-i;spaces>0;spaces--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prymid(n);
    }
}
