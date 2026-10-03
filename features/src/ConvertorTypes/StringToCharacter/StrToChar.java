package ConvertorTypes.StringToCharacter;

public class StrToChar {
    static void main() {
        String str="asdf1234[];'./";
        char arr[] = str.toCharArray();
        System.out.println(arr);
        char ch =str.charAt(4);
        System.out.println(ch);
        char[]cr = str.toUpperCase().toCharArray();
        for(char x:cr){
            System.out.print(x+"  ");
        }
        System.out.println();
        char[]pr = str.substring(1).toLowerCase().toCharArray();
        for(char x:pr){
            System.out.print(x+"  ");
        }
        System.out.println();
        int n = str.length();
       char lp[] = cr.clone();
       for(char m:lp){
           System.out.print(m+"  ");
       }
    }
}
