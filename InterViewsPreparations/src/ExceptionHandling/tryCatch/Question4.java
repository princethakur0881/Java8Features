package ExceptionHandling.tryCatch;

public class Question4 {
    // here only Inner catch print because inner try noe execute his code therfore he goes inside of the catch block and
    // catch block executed and outer try  block handled exception easily so noe execute outer catch block;
    static void main(){
        try{
            try{
                int res = 10/0;
            }catch(ArithmeticException e){
                System.out.println("Inner catch:  "+e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Outer catch:  "+e);
        }
    }
}
