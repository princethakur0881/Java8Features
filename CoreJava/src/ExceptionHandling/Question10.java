package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Question10 {



        void main() throws IOException {
            String userHome = System.getProperty("user.home");
            String path = userHome + "/Desktop/newfile.txt";

            // 1. Declare BufferedReader outside try so finally can access it
            BufferedReader br = null;

            try {
                // 2. Wrap FileReader inside BufferedReader
                br = new BufferedReader(new FileReader(path));

                String line;
                // 3. Read line by line until readLine() returns null
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } finally {
                // 4. Close BufferedReader (this automatically closes the underlying FileReader too)
                if (br != null) {
                    br.close();
                }
                System.out.println("File Read Successfully");
            }
        }
    }

