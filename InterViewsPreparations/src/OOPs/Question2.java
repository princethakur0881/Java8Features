package OOPs;

interface  IA{
    void method();
}
interface IB{
    void method();
}

public abstract class Question2 implements IA ,IB {
abstract void greet();

}
class Question3 extends Question2{
    @Override
    public void method() {
        System.out.println("method");
    }
    public void greet() {
        System.out.println("greet");
    }

    static void main() {

        Question3 obj = new Question3();
        obj.method();
        obj.greet();
    }
}
