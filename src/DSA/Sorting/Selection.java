package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={54,3,55,12,800,5,44,54,76,23,55,16,26,4,9,6,64,35};

        for(int i=0;i< arr.length;i++){
            int maxIndex=0,lastIndex=arr.length-1-i;

            for(int j=1;j<arr.length-i;j++){
               if(arr[j]>arr[maxIndex]){
                   maxIndex=j;
               }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[lastIndex];
            arr[lastIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
