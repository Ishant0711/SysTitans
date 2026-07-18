import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedChar {

    public static char nonRepeatedChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character ch : str.toCharArray()){
            map.put(ch , map.getOrDefault(ch,0) +1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '_';
    }
    public static void main(String[] args){
        String str = "ishaanvspankhudi";
        System.out.println(nonRepeatedChar(str));
    }
}
