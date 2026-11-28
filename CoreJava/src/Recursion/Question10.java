package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10 {
    //check Number is Palindrome or Not with the help of recursion;
    static int  checkNumberpalindrome(int num, int rev){

      if(num==0)return rev ;
      return checkNumberpalindrome(num/10,rev*10+(num%10));
    }
    void main()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
       if(n>=0 && n==checkNumberpalindrome(n,0))
           System.out.println("Yes ,It is a Palindrome number");
       else IO.println("No");
    }
}
