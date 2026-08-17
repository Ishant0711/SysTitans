package dataStructure.Array;
public class SecondLargestElement {
    public static int secondLargestElement(int[] arr){
        int first = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        for(int n : arr){
            if(n > first){
                second = first;
                first = n;
            }else if( n > second && n < first){
                second = n;
            }
        } return second ==Integer.MIN_VALUE ? -1 :second;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 4, 45, 99,100};

        System.out.println(secondLargestElement(arr));
    }
}
