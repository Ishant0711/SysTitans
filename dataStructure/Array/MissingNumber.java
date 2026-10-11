package dataStructure.Array;

// You are given an array containing n distinct numbers taken from the range 1 to n+1. The array is missing exactly one number.
// Find that missing number.
public class MissingNumber {
    public static int missingNumber(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int xor =0;

        for(int n : nums){
            max = Math.max(n, max);
            min = Math.min(n, min);
            xor ^= n;
        }
        for(int i =min ; i<=max; i++){
            xor ^= i;
        } return xor;
    }
    /*
     public static int findMissing(int[] nums) {
     int n = nums.length;
        int xorFull = 0, xorArray = 0;

        // XOR all numbers from 1 to n+1
        for (int i = 1; i <= n + 1; i++) {
            xorFull ^= i;
        }

        // XOR all elements of the array
        for (int num : nums) {
            xorArray ^= num;
        }

        // Missing number
        return xorFull ^ xorArray;
    }
     */
    public static void main(String[] args){
        int[]  arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println("missing element: " + (missingNumber(arr)));
    }
}
