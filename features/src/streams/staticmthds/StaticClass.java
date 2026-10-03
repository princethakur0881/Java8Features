package streams.staticmthds;
interface A{
    static  void sayhello(){
        System.out.println("A says Hello int interface with the help of static method");
    }
}
public class StaticClass implements A {
    static void main() {
//        StaticClass staticClass  = new StaticClass();
//        StaticClass.sayHello();
//        staticClass..sayHello();
        //in an interface where any static method inside the interface than that only call from interface name only and only

      A.sayhello();
    }
}
