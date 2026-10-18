package OOPs;

interface  A{
    void method();
}
interface B{
    void method();
}

public class Question1 implements A ,B{


    @Override
    public void method() {
        System.out.println("method");
    }

    static void main() {
        Question1 obj = new Question1();
        obj.method();


    }
}
