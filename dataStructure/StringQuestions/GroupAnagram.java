package dataStructure.StringQuestions;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String [] arr){
        Map<String,List<String>> map = new HashMap<>();

        for(String st : arr){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(st);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
      String[]  strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
      System.out.println(groupAnagram(strs));
    }
}
