public class Question1 {
  public static int Maximum(int arr[]){
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
              max = arr[i];
          }
      }
      return max;
  }
  public static int Minimum(int arr[]){
      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] < min) {
              min = arr[i];

          }
      }
      return min;
  }
    static void main() {
        int arr[] = {1,2,3,4,45,5,6,7,-1,78};
       int Maximum =  Maximum(arr);
       int Minimum =  Minimum(arr);

        System.out.println(Maximum+" "+Minimum);
    }
}
