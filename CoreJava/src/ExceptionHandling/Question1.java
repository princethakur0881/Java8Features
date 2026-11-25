package ExceptionHandling;

public class Question1 {
    //what is error :->Error is the problem. which cannot handle not stop and not resume and not others work on it. Respresents critical uncoverable situation origianting outside your code [OutOfMemoryError, StackOverflowError]
    //what is exception :->  An Exception is unexcepted/unwanted abnormal situation that occured at runtime called Exception.
    void main(){
        int a=10;
        int b=0;
        int c = a/b;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at ExceptionHandling.Question1.main(Question1.java:9)
        System.err.println(c);
        int arr[] = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at ExceptionHandling.Question1.main(Question1.java:17)
       System.err.println(arr[3]);
    }

}
