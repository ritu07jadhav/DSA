package Searching.BinarySearching;

public class RotaryArrayDuplicate {
    public static void main(String[] args){
        int[] arr = {4, 4, 5, 6, 6, 7, 0, 1, 2, 2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int s=0,e= arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[e]){
                s=m+1;
            } else if (arr[m]>arr[e]) {
                e=m;
            }else{
                e--;
            }
        }
        return e;
//        s or e both on same element
    }
}
