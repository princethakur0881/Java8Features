package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8 {
    //Check Arrays is sorted or not with the help of Recursion

    static boolean checkArraySortedOrNot(int[] arr,int N) {
        if (N == 0 ||N==1|| arr == null || arr.length == 0)
            return true;

        return arr[N-1] >= arr[N-2] && checkArraySortedOrNot(arr, N - 1);
    }
    void main() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(checkArraySortedOrNot(arr,N));
    }
}
