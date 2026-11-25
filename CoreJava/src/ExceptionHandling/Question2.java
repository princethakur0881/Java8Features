package ExceptionHandling;

public class Question2 {
    void main(){
        //Using try block
        int a=10;
        int b=0;
        int c=0;
        try {
//            0
//            Exception in thread "main" java.lang.ArithmeticException: / by zero
//            at ExceptionHandling.Question2.main(Question2.java:10)
           c = a / b;
        }catch(ArithmeticException e){
            System.err.println("Arithmetic Exception");
        }
        System.err.println("Good Morning! ");
    }
}
