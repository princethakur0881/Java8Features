package ConvertorTypes.PrimitiveDataToOthers;

public class PrimitiveToString {
    static void main() {
        int x = 100;
        float b = 100.98f;
        double c= 98.100;
        long d = 130912788;
        String str = String.valueOf(x);
        String str1 = String.valueOf(b);
        String str2 = String.valueOf(c);
        String str3 = String.valueOf(d);

        System.out.println(str+"  "+str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


    }
}
