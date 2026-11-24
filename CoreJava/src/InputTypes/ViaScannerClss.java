package InputTypes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ViaScannerClss {
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        System.out.print("Enter an String: ");
        String str=sc.next();
        System.out.print("Enter an Double: ");
        Double a=sc.nextDouble();
        System.out.print("Enter an Byte: ");
        byte t =sc.nextByte();
        System.out.print("Enter an Boolean: ");
        boolean b =sc.nextBoolean();
        System.out.print("Enter an Character: ");
        char ch =sc.next().charAt(0);

        IO.println("Enter an integer: "+ n);
        IO.println("Enter an String : "+ str);
        IO.println("Enter an Double : "+ a);
        IO.println("Enter an Byte: "+ t);
        IO.println("Enter an Boolean: "+ b);
        IO.println("Enter an Character: "+ ch);
    }
}
