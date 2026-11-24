package Patterns;

import java.util.Scanner;

public class Question5 {
    public void rightAnglePrymid(int n, int m){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
                System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n, m;
    n = sc.nextInt();
        m = sc.nextInt();
        Question5 q = new Question5();
        q.rightAnglePrymid(n, m);
    }
}
