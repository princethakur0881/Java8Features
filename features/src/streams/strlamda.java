package streams;
@FunctionalInterface
interface myInterface{
    String sayHello();
}
@FunctionalInterface
interface  newinterface{
    void display();
}
public class strlamda {
    static void main() {
       myInterface greet=()-> "Hello World";
        myInterface Bye=()-> "Good Bye";
        myInterface talks =()->"How r u, babe";

        newinterface disp = ()->
            System.out.println("This is simple apple and mangos for me ");
        disp.display();

        System.out.println("Greet with me : "+greet.sayHello());
        System.out.println("bye with me "+Bye.sayHello());
        System.out.println("Simple talks with :"+talks.sayHello());

    }
}
