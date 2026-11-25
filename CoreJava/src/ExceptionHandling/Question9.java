package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Question9 {
    void main() throws IOException {
        String userHome = System.getProperty("user.home");
        String path = userHome+"/Desktop/newfile.txt";
        FileReader fr = null;
        fr = new FileReader(path);
        try{
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }finally {
            fr.close();
            System.out.println("File Read Successfully");
        }
    }
}
