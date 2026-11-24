package Arrays.Medium;

import java.util.Scanner;

public class Question1 {
    public static String reverseString(String str) {
        char c[] =  str.toCharArray();
        int n = str.length();
        int l=0;
        int r=n-1;
        while(l<r){
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l++;
            r--;
        }
        return  new String(c).toString();
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){


            String str = sc.next();
            System.out.println(reverseString(str));;
        }
    }
}
