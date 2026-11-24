package Patterns;

import java.util.Scanner;

public class Question1 {
    public static void verticalLineStar(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        verticalLineStar(n);
    }
}
