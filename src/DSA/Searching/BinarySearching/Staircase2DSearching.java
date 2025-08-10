package Searching.BinarySearching;
import java.util.Arrays;


public class Staircase2DSearching {
    public static void main(String[] args){
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target=50;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int r=0,c= arr[0].length-1;
        int[] ans= {-1,-1};
        while (r<arr.length && c>=0){
            if(arr[r][c]==target){
                ans[0]=r;
                ans[1]=c;
                return ans;
            } else if (arr[r][c]<target) {
                r++;
            }else {
                c--;
            }
        }
        return ans;
    }
}
