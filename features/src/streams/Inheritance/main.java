package streams.Inheritance;

public class main {
    static void main() {
        parent c1 = new chalid() {
            @Override
            public void sayHello() {
                System.out.println("hello babu");
            }
        };
        c1.sayHello();
    }
}
