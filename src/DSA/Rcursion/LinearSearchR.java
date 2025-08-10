package Rcursion;

public class LinearSearchR {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 5, 7, 8, 33, 45, 78, 87, 95, 99, 234};
        int target = 444;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search(arr, target, index+1);
    }
}
