package Searching.BinarySearching;

public class FirstAndLastInDuplicateNum {
    public static void main(String[] args){
        int[] arr = {1, 3, 3, 3, 5, 7, 9, 9, 9, 9, 12, 15, 15, 18, 20};
        int target = 9;
        int ans=-1;
        int f=searchIndex(arr,target,true,ans);
        int l=searchIndex(arr,target,false,ans);

        System.out.println(f);
        System.out.println(l);
    }
    static int searchIndex(int[] arr,int target,boolean first,int ans){
        int s=0,e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                ans=m;
                if(first){
                    e=m-1;
                }else {
                    s=m+1;
                }
            } else if (arr[m]<target) {
                s=m+1;
            }else {
                e=m-1;
            }
        }
        return ans;
    }
}
