package InputTypes;

import javax.swing.*;

public class viaGUIPopUpBox {
    void main(){
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        String gender = JOptionPane.showInputDialog("Enter your gender");
        JOptionPane.showMessageDialog(null, "Welcome\n"+"Name : "+name+"\n"+"Age :"+age+" \n"+"Gender : "+gender);
    }
}
