package Arrays.Easy;

public class Question6 {
    public int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        int pos = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[pos]) {
                pos++; // Move to the next slot
                nums[pos] = nums[i]; // Write the unique value
            }


        }
        return nums;
    }
        void main () {
            int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
            int n = arr.length;
            int pos = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[pos]) {
                    pos++; // Move to the next slot
                    arr[pos] = arr[i]; // Write the unique value
                }


            }
           for(int i=0;i<pos+1;i++ ){
               System.out.print(arr[i]+" ");
           }

        }
    }
