package Searching.LinearSearching;

import java.sql.Array;
import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args){
        int[][] arr={{3,6,8,7},
                {77,44,22,98,5,12},
                {345,76,123,667,545}};
        int target=5;
        int[] ans={-1,-1};
        search(arr,target,ans);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target, int[] ans){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
