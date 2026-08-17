package dataStructure.StringQuestions;

public class CompressedString {
    public static String compressedString(String str){
        if(str ==null || str.isEmpty()){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] ch =str.toCharArray();
        int i =0;
        while(i< ch.length){
            int count = 0;
            char curr = ch[i];
            while(i < ch.length && ch[i] ==curr){
                count++;
                i++;
            }
            sb.append(count).append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        //Input:
        String word = "aaaaaaaaaaaaaabb";
        // String word = "abcde";
       //Output: "9a5a2b"
        System.out.println(compressedString(word));
    }
}
