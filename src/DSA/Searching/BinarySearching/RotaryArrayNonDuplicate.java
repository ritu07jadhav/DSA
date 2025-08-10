package Searching.BinarySearching;

public class RotaryArrayNonDuplicate {
    public static void main(String[] args){
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int s=0,e= arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if(arr[m]>arr[e]){
                s=m+1;
            } else {
                e=m;
            }
        }
        return e;
//        s or e both on same element
    }

}
