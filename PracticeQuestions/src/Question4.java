import java.util.Arrays;
import java.util.stream.IntStream;

public class Question4 {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int [] reversed = IntStream.range(0, n).map(i -> arr[n -1- i]).toArray();
        return reversed;
    }
    static void main() {
        int arr[] = {1,2,3,4,5,6,67,7,78,56,99};
        for(int i:reverseArray(arr)){
            System.out.print(i+" ");
        }
    }
}
