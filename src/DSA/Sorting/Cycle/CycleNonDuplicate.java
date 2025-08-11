package Sorting.Cycle;

import java.util.Arrays;

public class CycleNonDuplicate {
    public static void main(String[] args) {
   int[] arr={4, 9, 1, 8, 10, 2, 3, 7, 6, 5};
    int i=0;
    while(i< arr.length){
        int index=arr[i]-1;
        if(arr[i]!=arr[index]){
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        i++;
      }
    System.out.println(Arrays.toString(arr));
    }
}
