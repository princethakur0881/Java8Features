package ConvertorTypes.StringToWrapperObject;

public class WrapperTOPrimitive {
    static void main() {
        Integer x=100;
        int y=x;




        int xc=x.intValue();


        Long l=100L;
        long vc= l.longValue();
        Double d=10.5;
        double m=d.doubleValue();
        System.out.println(x+"  " +x.SIZE+"   "+x.BYTES);
        System.out.println(y);
        System.out.println(xc);
        System.out.println(l);
        System.out.println(vc);
        System.out.println(d);
        System.out.println(m);
    }
}
