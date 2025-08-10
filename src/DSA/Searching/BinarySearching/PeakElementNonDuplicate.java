package Searching.BinarySearching;

public class PeakElementNonDuplicate {
    public static void main(String[] args){
        int[] arr = {1, 3, 7, 12, 13,15, 13, 9, 5, 2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr){
        int s=0,e= arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else if (arr[mid]<arr[mid+1]){
                s=mid+1;
            }
        }
        return s;
    }
}
