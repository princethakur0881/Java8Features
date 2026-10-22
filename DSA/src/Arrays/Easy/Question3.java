package Arrays.Easy;

public class Question3 {
    public int [] reverseArray(int[] arr){
        int [] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[i] = arr[arr.length-1-i];

        }
        return res;
    }
    void main(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int n: arr){
            System.out.print(" "+n+"  ");
        }
        System.out.println();
       int revarr[] = reverseArray(arr);
       for(int n: revarr){
           System.out.print(" "+n+"  ");
       }
    }
}
