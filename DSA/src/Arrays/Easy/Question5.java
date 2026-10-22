package Arrays.Easy;
import java.util.TreeSet;
//Remove Duplicates from Unsorted Arrays
// Where order is not matter than u can use TreeSet and HashSet
public class Question5 {
    public int [] removeDuplicates1(int[] arr) {
        int n=arr.length;
       TreeSet<Integer> set=new TreeSet<>();
       for(int i:arr){
           set.add(i);
       }
       return set.stream().mapToInt(x->x).toArray();
    }

    void main()
    {
        int nums[] = {1,2,1,2,3,4,5,6,6,7,8,98,76,5,43};
        for(int n:removeDuplicates1(nums)){
            System.out.print(n+" ");
        }
    }
}
