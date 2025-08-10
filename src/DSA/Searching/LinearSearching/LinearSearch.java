package Searching.LinearSearching;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr={23,55,32,2,5,7,4};
        int target=32;
        System.out.println(search(arr,target));
    }
      static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
      }
}
