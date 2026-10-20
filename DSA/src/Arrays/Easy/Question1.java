package Arrays.Easy;

public class Question1 {
    public int maximum(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public int minimum(int arr[] ){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    void main(){
        int arr[] = {1,2,3,4,5,6,7,8,9,0,98,7,6,4,3,2,-21,0};
        System.out.println("Maximum  Element:"+maximum(arr));
        System.out.println("Minimum  Element:"+minimum(arr));
    }
}
