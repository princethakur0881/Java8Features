package ConvertorTypes.StringToWrapperObject;

public class StringToWrapperObject {
    static void main() {
        String a = "100";
        Integer b = Integer.valueOf(a);
        Integer c= Integer.parseInt(a);
        System.out.println("Valueof return Integer value not int:  "+ b+"   "+b.SIZE);
        System.out.println("ParseInt return Integer value not int:  "+ c+"  " +c.BYTES);


    }
}
