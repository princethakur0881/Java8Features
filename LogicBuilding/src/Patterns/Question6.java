package Patterns;

import java.util.Scanner;

public class Question6 {
    public static void ultaRightAnglePrymid(int n){
        for(int i = n; i >=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ultaRightAnglePrymid(n);

    }
}
