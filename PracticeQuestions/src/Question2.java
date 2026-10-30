public class Question2 {
    public static int largest(int arr[]){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    static void main() {
        int arr [] = {1,2,3,34,4,5,6,78,78,89,76,54,3,};
        System.out.println(largest(arr));
    }
}
