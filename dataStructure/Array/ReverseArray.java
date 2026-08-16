package dataStructure.Array;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
    public static void main(String[] args){
        int []arr = {10, -2, 0, 15, -7};
        reverseArray(arr);
        System.out.println("reverse element: " + Arrays.toString(arr));
    }
}
