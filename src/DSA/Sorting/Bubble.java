package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
       int[] arr={54,3,55,12,800,5,44,54,76,23,55,16,26,4,9,6,64,35};

       for(int i=0;i< arr.length;i++){
           for(int j=1;j< arr.length-i;j++){
               if(arr[j-1]>arr[j]){
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
