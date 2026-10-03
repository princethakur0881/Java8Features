package streams.Inheritance;

interface  A{
    default  void sayHello(){
        System.out.println("A says Hello");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B says Hello");
    }
}
public class MyClass  implements A,B{
    static void main() {
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }
        @Override
        public void sayHello() {
            A.super.sayHello();
        }
}
