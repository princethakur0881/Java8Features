package InputTypes;

import java.io.Console;

public class viaConsole {
    void main() {
       Console console = System.console();
       if(console==null){
           System.out.println("No console available");
           return;
       }
       String userName = console.readLine("Enter UserName");
       char[] Password =console.readPassword("Enter Password: ");
       System.out.println("Logged in as :  "+userName);
    }
}
