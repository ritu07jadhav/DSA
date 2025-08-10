package Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr={54,3,55,12,800,5,44,54,76,23,55,16,26,4,9,6,64,35};
        int[] ans=merge(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int m= arr.length/2;
        int[] left=merge(Arrays.copyOfRange(arr,0,m));
        int[] right=merge(Arrays.copyOfRange(arr,m,arr.length));
        return Mix(left,right);
    }

    static int[] Mix(int[] first,int[] last){
        int[] mix=new int[first.length+ last.length];
        int k=0,j=0,i=0;
        while (i<first.length && j< last.length){
            if(first[i]<last[j]){
                mix[k]=first[i];
                k++;
                i++;
            }else {
                mix[k]=last[j];
                k++;
                j++;
            }
        }
        while (i<first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while (j< last.length){
            mix[k]=last[j];
            k++;
            j++;
        }
        return mix;
    }
}
