package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question6{
    public static void main(String[] args) {
        // Declare the reader outside the try block so 'finally' can access it
        BufferedReader reader = null;

        try {
            // Attempting to open a file that does not exist
            reader = new BufferedReader(new FileReader("sample_data.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // Triggered when the file does not exist at the specified path
            System.err.println("Error: The file was not found! (" + e.getMessage() + ")");

        } catch (IOException e) {
            // Triggered if an error occurs while reading the file
            System.err.println("Error reading the file: " + e.getMessage());

        } finally {
            // Always executes to clean up resources
            System.out.println("Executing finally block...");
            try {
                // Check if reader was actually opened before trying to close it
                if (reader != null) {
                    reader.close();
                    System.out.println("Reader closed successfully.");
                } else {
                    System.out.println("Reader was never opened, nothing to close.");
                }
            } catch (IOException e) {
                System.err.println("Error while closing the reader: " + e.getMessage());
            }
        }
    }
}

