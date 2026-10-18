package SwitchCase;

public class Question1 {
    // run with values of null
    static void main() {
        String str = null;
        switch (str) {
            case null:
                System.out.println("case null");
                break;
            default: System.out.println("default case");

        }
    }
}
