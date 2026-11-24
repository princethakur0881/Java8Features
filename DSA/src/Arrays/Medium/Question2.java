package Arrays.Medium;

import java.util.Scanner;

public class Question2 {
    public boolean palindrome(String s) {
        if(s==null || s.length()<2)return false;
        int len = s.length();
      int l=0,r=len-1;
      while(l<r){
          if(s.charAt(l)!=s.charAt(r)){
              return false;

          }
          l++;
          r--;
        }
      return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.next();


            Question2 q = new Question2();
            if (q.palindrome(str)) {
                System.out.println(str + "  This  String is palindrome");
            } else {
                System.out.println(str + "  This is not palindrome");
            }
        }
    }
}
