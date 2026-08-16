package dataStructure.Array;

import java.util.Arrays;

public class RotateArray {

    public static void rotateArray(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        rotate(nums, 0, n-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, n-1);
    }
    public static void rotate(int[] nums, int left, int right){
        while(left<=right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
