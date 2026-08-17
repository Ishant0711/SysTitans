package dataStructure.Array;

public class MajorityElement {
    public static int majorityElement(int[] arr){
        int count =0;
        int curr = arr[0];
        for(int n : arr){
            if(count ==0){
                curr = n;
            }
            if(curr ==n){
                count++;
            } else{
                count--;
            }
        } return curr ;
    }
    public static void main(String[] args){
        //int[] arr = {3,3,4,2,3,3,5,3};
        int[] arr = {2,2,1,1,1,2,2};
        // 4,4,3,3,5,3,3,3
        System.out.println(majorityElement(arr));
    }
}


/*  Boyer-Moore Voting Algorithm:

Keep a candidate and a counter.

If counter is 0, set candidate to current element.

If current element equals candidate, increment counter. Otherwise, decrement counter.

At the end, candidate is the majority element. */
