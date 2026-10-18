package ExceptionHandling.tryCatch;

public class Question2 {
    //This code returns 0 because of how the return statement and the finally block interact in Java.
    //When Java executes return x; inside the try block, it evaluates the expression x
    //(which is 0) and saves that return value in a temporary location before moving to the finally block.
    //Here is exactly what happens step-by-step:
    //1. Evaluation: The code enters the try block and hits return x;. Java looks at the current value of x, which is 0.
    //2. Stashing: Java holds onto that 0 as the designated value to return from the method.
    //3. Finally Block Execution: The finally block runs, executing x = 5;. This successfully changes the local variable x to 5,
    // but it does not alter the value that was already stashed for the return statement.
    //4. Completion: The method finishes and returns the stashed value, which is 0.
public static int   valx() {
    int x=0;
      try {
          return x;
      } finally {
          x = 5;
      }
  }
    static void main(){
        System.out.println(valx());


        }
    }