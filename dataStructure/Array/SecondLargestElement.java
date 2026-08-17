package dataStructure.Array;
public class SecondLargestElement {
    public static int secondLargestElement(int[] arr){
        int first = 0;
        int second =0;
        for(int n : arr){
            if(n > first){
                second = first;
                first = n;
            }else if( n > second && n < first){
                second = n;
            }
        } return second;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 4, 45, 99,100};

        System.out.println(secondLargestElement(arr));
    }
}
