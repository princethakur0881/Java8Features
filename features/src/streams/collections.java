package streams;
import java.util.ArrayList;
public class collections {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
       for(int i=1;i<100;i++){
           list.add(i);
       }

        System.out.println("All elements:");
        list.forEach(n -> System.out.print(n+"   "));

        System.out.println("Even elements:");
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.print(n+"    ");
        });
    }
}
