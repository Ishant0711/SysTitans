package dataStructure.StringQuestions;

public class CountVowel {
    public static int countVowel(String str){
        int countV =0;
        int countC = 0;
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)) {   // only alphabets
                if (isVowel(c)) {
                    countV++;
                } else {
                    countC++;
                }
            }
        }
        System.out.println("Consonant count: " + countC);
        return countV;
    }
    static boolean isVowel(char c){
        return 'a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c;
    }
    public static void main(String[] args){
        String str = "pankhudi123";
        System.out.println("Vowel count "+countVowel(str));
    }
}
