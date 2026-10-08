package HashFunction;


public class HashFcn {
    public static void main(String[] args) {
        String password = "mySecretPassword123";

        // Hash the password. BCrypt automatically generates and embeds a secure "salt".
       int  hassPass= password.hashCode();
        System.out.println(hassPass);

    }
}