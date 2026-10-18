package ExceptionHandling.tryCatch;

public class Question5 {
    //if try and catch block contains System.exit() then only finally will not executed;

    static void main() {
        try{
            System.out.println("Only try will execute and than  force exit in the code");
            System.exit(1);
        }
        finally{
            System.out.println("finally");
        }
    }
}
