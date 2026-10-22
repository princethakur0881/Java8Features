package Arrays.Easy;

public class Question4 {
    public int [] moveZeroes(int[] arr) {
        int l=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=0){
             int temp=arr[i];
             arr[i]=arr[l];
             arr[l++]=temp;
          }

        }
        return arr;
    }
    void main(){
        int arr[] = {1,0,2,0,3,0,4,0,5,0,6,0,7,0};
for (int i:moveZeroes(arr)){
    System.out.print(i+" ");
}
    }
}
