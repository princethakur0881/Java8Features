package ExceptionHandling.tryCatch;

public class Question1 {
    //A finally block overrides try and catch block because
    // it is designed as the absolute final step of execution before control leaves that section of code
    static void main() {
        int x = 2;
        try {
            x=5;
        }
        finally {
            x=10;
        }
        System.out.printf("x = "+ x);
    }

}
