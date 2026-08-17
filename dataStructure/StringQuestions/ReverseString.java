package dataStructure.StringQuestions;

public class ReverseString {
    public static String reveseString(String str){
        int left =0;
        int right = str.length()-1;
        char[] arr = str.toCharArray();

        while(left < right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--]= temp;
        } //return Arrays.toString(arr);  // you’re returning Arrays.toString(arr), which prints the array like [h, e, l, l, o].
        return new String(arr);  // return new String(arr) to get the proper reversed string
    }
    public static void main(String[] args){
        String str = "Ishakhu";
        String str1 = reveseString(str);
        System.out.println(str1);
        System.out.println( str +" is valid Palindrome: " + str.equals(str1));
    }
}
