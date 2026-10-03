package ConvertorTypes.PrimitiveDataToOthers;

public class PrimitiveToPrimitive {
    static void main() {
        //Widening conversion
        int a=12;
        long b=a;
        double c=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Norrow conversion
        double d=100.99;
        float m=12.87f;
        int i=(int)d;
        int l=(int)m;
        System.out.println(d);
        System.out.println(i);
        System.out.println(m);
        System.out.println(l);
    }
}
