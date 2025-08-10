package Searching.LinearSearching;

public class MinMax {
    public static void main(String[] args){
        int[] arr={23,55,332,2,5,7,4};
        int max=arr[0];
        int min=arr[0];
        System.out.println(max(arr,max));
        System.out.println(min(arr,min));
    }
//    For max
    static int max(int[] arr,int max){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
//    for min
static int min(int[] arr,int min){
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
  }
}
