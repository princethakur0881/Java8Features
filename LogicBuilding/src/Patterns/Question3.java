package Patterns;

import java.util.Scanner;

public class Question3 {
    public static void squarePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squarePattern(n);

    }
}
