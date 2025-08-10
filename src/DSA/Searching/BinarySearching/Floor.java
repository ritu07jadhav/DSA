package Searching.BinarySearching;

public class Floor {
    public static void main(String[] args){
        int[] arr={12,16,20,26,34,38,44,50,55,56,64,68,76,77,89,90};
        int target=10;
        System.out.println(floor(arr,target));

    }
    static int floor(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            } else if (arr[m]<target) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return e;
    }
}
