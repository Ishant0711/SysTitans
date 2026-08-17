package dataStructure.StringQuestions;

public class ValidPalindrome {
    public static boolean validPalindrome(String str){
        int left =0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left++)!= str.charAt(right--)){
                return false;
            }
        } return  true;
    }
    public static void main(String[] args){
        String str = "madam";
        System.out.println( str +" is valid Palindrome: " + validPalindrome(str));
    }
}
