package dataStructure.Array;

import java.util.*;

import static java.util.Arrays.stream;

public class FindDuplicate {

    public static int[] findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            if(!set.add(n)){
                list.add(n);
            }
        } return list.stream().mapToInt(Integer :: intValue).toArray();

    }

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 1, 4, 5,4, 2};
        System.out.println("Duplicate element: "+ Arrays.toString(findDuplicate(nums)));

    }
}
