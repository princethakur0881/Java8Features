package Patterns;

import java.util.Scanner;

public class Question2 {
    public static void horizontalLineStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        horizontalLineStar(n);
    }

}
