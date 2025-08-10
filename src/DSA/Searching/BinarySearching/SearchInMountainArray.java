package Searching.BinarySearching;

public class SearchInMountainArray {
public static void main(String[] args){
    int[] arr = {1, 2, 4, 6, 9, 9, 9, 12, 15, 15, 15, 14, 14, 10, 7, 5, 5, 3, 1};
    int target=10;
    System.out.println(peak(arr,target));
   }
//   To find peak element
    static int peak(int[] arr,int target){
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
        if(target<arr[s]){
           return searchAsc(arr,0,s,target);
        }else {
            return searchDesc(arr,s+1,arr.length-1,target);
        }
    }

//   Binary search
static int searchAsc(int[] arr,int newS,int newE,int target){
    while(newS<=newE){
        int m=newS+(newE-newS)/2;
        if(target==arr[m]){
            return m;
        } else if (arr[m]<target) {
            newS=m+1;
        }else {
            newE=m-1;
        }
    }
    return -1;
  }
    static int searchDesc(int[] arr, int newS, int newE, int target) {
        while (newS <= newE) {
            int m = newS + (newE - newS) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                newS = m + 1;
            } else {
                newE = m - 1;
            }
        }
        return -1;
    }

}
