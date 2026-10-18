package ExceptionHandling.tryCatch;



public class Question6 {
//
//Keyword	   What it is	     Core Purpose
//final	        Modifier	     Restricts a class, method, or variable from being changed or overridden.
//finally	    Block	         Guarantees execution of cleanup code, whether an exception happens or not.
//finalize()	Method	         A deprecated method called by the Garbage Collector before an object is destroyed.

    static void main() {
        final int x =10;

        try {

        } finally {
            System.out.println("This always runs!"); // Used for cleanup
        }

    }
//    @Override
//    protected void finalize() throws Throwable {
//        // Cleanup code before the object gets garbage collected (Deprecated!)
//    }
}
