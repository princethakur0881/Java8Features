package streams;
@FunctionalInterface
interface fcnlinterface{
    public  void  newwin();

    default String newdin( String str) {

        return str;
    }
}
@FunctionalInterface
interface newfcln{
    public void sayhello();
    default  String mdn(String str){
        return str;
    }
}

public class fcnlmethods {
    static void main() {

        fcnlinterface greet = ()->{
            System.out.println("Oye, babu");
        };
        greet.newwin();

        fcnlinterface vb = ()-> System.out.println();

        System.out.println(vb.newdin("ousxcvbkhdsrtdfg"));
        newfcln wb = ()-> System.out.println("Hello babu");
        newfcln lb = ()-> System.out.println("hello mere  naye babu");
        wb.sayhello();
        lb.sayhello();
        System.out.println(wb.mdn("hello  mere babu"));;




    }
}
