package Recursion;

import java.util.Scanner;

public class Question6 {
    static int printSumOfNumbers(int n) {
        if (n == 1)
            return 1;
        int sum = printSumOfNumbers(n - 1) + n;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSumOfNumbers(n));

    }
}
