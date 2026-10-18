package ExceptionHandling.tryCatch;

public class Question3 {
    public static int   valx() {
        int x=0;
        try {
            return x;
        } finally {
            x = 5;
            return x;
        }
    }
    static void main(){
        System.out.println(valx());


    }
}