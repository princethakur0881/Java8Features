package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9 {
    //Check String is pailnedrome or Not
    static boolean checkPalindromeOrNot(String str ,int left,int right ) {
        if (left>=right) return true;
        if(str.charAt(left)!=str.charAt(right)) return false;
        return checkPalindromeOrNot(str,left+1,right-1);
    }
    void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
       IO.println(checkPalindromeOrNot(str,0, str.length()-1));
    }
}
