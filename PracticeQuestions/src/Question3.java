public class Question3 {
    public static int SecondLargest(int arr[]){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];

            }
        }
        return secondLargest;
    }
    static void main() {
        int arr [] = {1,2,3,34,4,5,6,78,78,89,76,54,3,};
        System.out.println(SecondLargest(arr));
    }
}
