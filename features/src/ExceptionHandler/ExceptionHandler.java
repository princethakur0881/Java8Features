package ExceptionHandler;

public class ExceptionHandler {
static String test(){
    try{
        return "try";
    }catch (Exception e){
        return "Catch";
    }
    finally {
        return "finally";
    }
}
    static void main() {
    //finally always override the answers of all code sections and try and catch block;
        System.out.println(test());
    }
}
