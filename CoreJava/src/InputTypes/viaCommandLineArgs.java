package InputTypes;

public class viaCommandLineArgs {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Usage: viaCommandLineArgs <userName> <password>");
            return;
        }
        String userName = args[0];
        int password = Integer.parseInt(args[1]);
        System.out.println("Logged in as :  "+userName);
    }
}
