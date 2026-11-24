package Patterns;

import java.util.Scanner;

public class Question8 {
    public static void ultaInvertRightAnglePrymid(int n)
    {
        for(int i=1;i<=n;i++){
            for(int spaces=0;spaces<=i;spaces++){
System.out.print(" ");
            }
            for(int star=n;star>i;star--){
                System.out.print("*");
            }
System.out.println();
        }
    }
    void main(){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ultaInvertRightAnglePrymid(n);
    }
}
