package Searching.BinarySearching;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 7, 8, 33, 45, 78, 87, 99, 234};
//        int[] arr = {234, 99,95,80, 87, 78, 45, 33, 8, 7, 5, 4, 3, 1};

        int target = 33;
        if(arr[0]<arr[arr.length-1]){
            System.out.println(searchAsc(arr,target));
        }else {
            System.out.println(searchDesc(arr,target));
        }

    }
//    Search in ascending
      static int searchAsc(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]){
                return m;
            } else if (arr[m]<target) {
                s=m+1;
            }else {
                e=m-1;
            }
        }
        return -1;
      }

    //    Search in descending
    static int searchDesc(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==arr[m]){
                return m;
            } else if (arr[m]<target) {
                e=m-1;
            }else {
                s=m+1;
            }
        }
        return -1;
    }
}
