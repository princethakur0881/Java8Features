package ExceptionHandling;

import java.io.File;

public class Question7 {
    void main(){
        String userHome = System.getProperty("user.home");
        String filePath = userHome + "/Desktop/newfile.txt";
        File file = new File(filePath);
       try{
           if(file.createNewFile()){
               System.out.println("File created");
           }else{
               System.out.println("File already exists");
           }
       }
       catch (Exception e){
           System.err.println(e);
       }
    }
}
