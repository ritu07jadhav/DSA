package Searching.BinarySearching;

public class SearchInfiniteArray {
    public static void main(String[] args){
        int[] arr = {
                3, 6, 9, 12, 15, 18, 21, 24, 27, 30,
                33, 36, 39, 42, 45, 48, 51, 54, 57, 60,
                63, 66, 69, 72, 75, 78, 81, 84, 87, 90,
                93, 96, 99, 102, 105, 108, 111, 114, 117, 120,
                123, 126, 129, 132, 135, 138, 141, 144, 147, 150
        };
        int target = 150;
        System.out.println(searchRange(arr,target));
    }
    static int searchRange(int[] arr,int target){
        int s=0,e=1;
         int sb;
       while (e<arr.length-1 && arr[e]<target){
           sb=e-s+1;
           s=e+1;
           e=e+sb*2;

           if (e >= arr.length) {
               e = arr.length - 1;
           }

       }
         return search(arr,s,e,target);
    }
//BS
    static int search(int[] arr,int newS,int newE,int target){
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
}
