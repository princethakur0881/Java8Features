package ConvertorTypes.StringToWrapperObject;

public class Stringtricky {
    static void main() {
        String s = "Hello";
        //String is immutable Once u created a String never be change in his lifecycle
        s.concat(" Java");
        //Always created a new String  for return form
         String b = s.concat(" Java");
//         concat() naya String return karta hai. Original String modify nahi hota; returned value assign nahi ki gayi
        System.out.println(s);
        System.out.println(b);
    }
}
