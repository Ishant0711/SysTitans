package dataStructure.Array;

import java.util.*;

public class IntersectionOfArray {

    public static int[] intersectionOfArray(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int n : arr1){
            set.add(n);
        }
        for(int m : arr2){
            if(!set.add(m)){
               list.add(m);
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public static void main(String[] args){
        int[] arr1 = {3,1,2,3,4,5};
        int[] arr2 = {3,4,5,7};

        System.out.println(Arrays.toString(intersectionOfArray(arr1, arr2)));
    }
}

/*
You’ve correctly used a HashSet to store elements from the first array and then checked membership while iterating the second.
 That’s efficient with O(n+m) time and O(n) space.
 One small note: your current implementation may add duplicates if the second array contains repeated values.
 If the requirement is to return unique intersection elements (like LeetCode’s “Intersection of Two Arrays”), you can store results in another Set instead of a List.
 */
