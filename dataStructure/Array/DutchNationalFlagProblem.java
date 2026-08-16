package dataStructure.Array;

import java.util.Arrays;
public class DutchNationalFlagProblem {
    public static void dutchNationalFlagProblem(int[] arr){
        int left =0;
        int mid =0;
        int right = arr.length-1;
        while(mid <=right){
            if(arr[mid] ==0){
                arr[mid++] = arr[left];
                arr[left++] = 0;
            }
            else if (arr[mid] ==2){
                arr[mid] =arr[right];
                arr[right--] = 2;
            }
            else {
               mid++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,0,1,2,0,1};

        dutchNationalFlagProblem(arr);
        System.out.println(Arrays.toString(arr));
    }
}




/* Algorithm Concept
The algorithm uses three pointers:

low → boundary for 0s (or smallest group).

mid → current element under consideration.

high → boundary for 2s (or largest group).

Steps:

Initialize: low = 0, mid = 0, high = n-1.

Traverse while mid <= high:

1. If arr[mid] == 0: swap with arr[low], increment both low and mid.

2. If arr[mid] == 1: just increment mid.

3. If arr[mid] == 2: swap with arr[high], decrement high.

Continue until mid > high */