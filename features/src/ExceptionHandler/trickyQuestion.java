package ExceptionHandler;
class test{
    static  int x=10;
}
public class trickyQuestion {
    static void main() {
test a = new test();
test b = new test();
a.x = 1000;
        System.out.println(b.x);
    }
}
