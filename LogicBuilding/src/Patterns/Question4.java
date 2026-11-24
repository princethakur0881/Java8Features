package Patterns;

import java.util.Scanner;

public class Question4 {
    public static void rectanglePattern(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        rectanglePattern(n ,m);
    }
}
