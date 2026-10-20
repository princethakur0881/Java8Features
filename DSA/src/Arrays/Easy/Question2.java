package Arrays.Easy;

public class Question2 {
    public int Largest(int arr[]){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public int SecondLargest(int arr[]){
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > seclargest && arr[i] != largest){
                seclargest = arr[i];


            }
        }
return seclargest;
    }
    void main() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 98, 7, 6, 4, 3, 2, 21, 0};
        System.out.println("Largest Element : "+Largest(arr));
        System.out.println("Second Largest Element : "+SecondLargest(arr));
    }
}
