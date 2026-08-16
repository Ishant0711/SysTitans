package dataStructure.Array;
public class MissingNumber {
    public static int missingNumber(int[] nums){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int xor =0;
        int misNum = 0;

        for(int n : nums){
            max = Math.max(n, max);
            min = Math.min(n, min);
            xor ^= n;
        }
        for(int i =min ; i<=max; i++){
            xor ^= i;
        } return xor;
    }
    public static void main(String[] args){
        int[]  arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println("missing element: " + (missingNumber(arr)));
    }
}
