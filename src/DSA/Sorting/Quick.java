package Sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr={54,3,55,12,800,5,44,54,76,23,55,16,26,4,9,6,64,35};
      sort(arr,0, arr.length-1);
      System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int hi){
        if(low>=hi){
            return;
        }

        int s=low,e=hi;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr,s,hi);
    }
}
