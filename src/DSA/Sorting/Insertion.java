package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr={54,3,55,12,800,5,44,54,76,23,55,16,26,4,9,6,64,35};
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
