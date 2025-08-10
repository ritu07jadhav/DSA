package Searching.BinarySearching;

public class PeakForDuplicate {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 9, 9, 9, 12, 15, 15, 15, 14, 14, 10, 7, 5, 5, 3, 1};
        System.out.println(arr[peak(arr)]);
    }
    static int peak(int[] arr){
        int s=0,e= arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }else if (arr[mid]<arr[mid+1]){
                s=mid+1;
            }else{
                if(s<e && arr[s]==arr[e]){
                    s++;
                    e--;
                }else{
                    if(mid>0 && arr[mid-1]>arr[mid]){
                       e=mid-1;
                    }else{
                       s=mid+1;
                    }
                }
            }
        }
        return s;
    }
}
