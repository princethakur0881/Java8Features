package ExceptionHandling;
import java.io.IOException;
public class Question5 {
    //Exception handles via JVM using throws keyword in java
// 1. This method declares it might throw an IOException instead of catching it
        static void readFile() throws IOException {
            // Simulating a file error using 'throw'
            throw new IOException("File not found on the system.");
        }

        // 2. The caller (main) is now forced to handle the exception
        public static void main(String[] args)throws IOException {
            try {
                readFile(); // Calling the method that uses 'throws'
            } catch (IOException e) {
                System.out.println("Handled in main: " + e.getMessage());
            }
        }
    }

