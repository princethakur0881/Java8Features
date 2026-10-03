package ConvertorTypes.PrimitiveDataToOthers;

class StringToPrimitive{
void main(){
    //that's work only when String is numeric and numbers Parse function;
    String str="123";
    int a = Integer.parseInt(str);
    long b = Long.parseLong(str);
    double c = Double.parseDouble(str);
    boolean d= Boolean.parseBoolean("123");
    char e = str.charAt(1);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println("char position at index 3:  "+e);
}}