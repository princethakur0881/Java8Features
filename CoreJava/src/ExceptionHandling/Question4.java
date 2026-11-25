package ExceptionHandling;

public class Question4 {
    //custom throw in fcn using throw keyword

        static void checkAge(int age) {
            if (age < 18) {
                // Explicitly throwing an unchecked exception
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access granted - You are old enough to vote!");
            }
        }

        public static void main(String[] args) {
            try {
                checkAge(15); // This will trigger the 'throw' statement
            } catch (ArithmeticException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }

