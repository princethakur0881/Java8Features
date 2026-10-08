package InterViewPrep;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CompareOperator {
    static void main() {
        int a=127;
        int b = 127;
        int c = 128;
        int d=128;

        String str = "Hello";
        String str1 = "Hello";

        Integer e = 127;
        Integer f = 127;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(str1==str);
        String s1= new String("Hello");
        String s2=new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String str2="Hell";
        String str3=str2+"o";
        String str4="Hello";
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
    }
}
