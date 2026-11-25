package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class Question8 {
    void main()throws IOException{
        String userHome = System.getProperty("user.home");
        String path = userHome+"/Desktop/newfile.txt";
        FileWriter fw = null;
        fw = new FileWriter(path);
        try{
            fw.write("I am big developer in java i want a job which help m,e to improove my technical skills in programming and coding.");
        }
           finally{
            fw.close();
           System.err.println("Successfully wrote to the file.");
        }
    }
}
