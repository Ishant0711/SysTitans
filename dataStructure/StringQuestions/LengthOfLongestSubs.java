package dataStructure.StringQuestions;

import java.util.HashSet;
import java.util.Set;

//Given a string s, find the length of the longest substring without duplicate characters.
public class LengthOfLongestSubs {
    public static int lengthOfLongestSubs(String str){
        int n = str.length();
        Set<Character> set = new HashSet<>();
        int maxlen =0;
        int left = 0;
        for(int right =0; right<n; right++){
            char key = str.charAt(right);
            while(set.contains(key)){               //set.add(key)  -> return true, if already present then return false
                set.remove(str.charAt(left));
                left++;
            }
            set.add(key);
            maxlen = Math.max(maxlen, right-left+1);
        } return maxlen;
    }
    public static void main(String[] args){
        //String s = "abcabcbb";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubs(s));
    }
}
