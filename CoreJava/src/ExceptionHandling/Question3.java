package ExceptionHandling;
public class Question3 {
    public static void main(String[] args) {
        try { // Outer try
            int arr[] = new int[2];
            int a = 0;
            int b = 0;
            arr[0] = 10;
            arr[1] = 20;

            try { // Inner try
                int c = a / b; // Throws ArithmeticException
                System.err.println(c);
            } catch (ArithmeticException e) {
                System.err.println("Inner Catch: " + e);
            }

            // Moving this after the inner try so both blocks get tested
            System.err.println(arr[2]); // Throws ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) { // Outer catch
            System.err.println("Outer Catch: " + e);
        } finally {
            System.out.println("Run Successfully");
        }
    }
}