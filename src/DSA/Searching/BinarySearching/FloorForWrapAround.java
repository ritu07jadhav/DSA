package Searching.BinarySearching;

public class FloorForWrapAround {
    public static void main(String[] args){
        char[] letters = {'c', 'f', 'j', 'p'};
        char target= 'a';
        System.out.println(floor(letters,target));
    }
    static char floor(char[] arr,char target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return arr[m];
            } else if (arr[m]<target) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        if(e==-1){
            return arr[arr.length-1];
        }
        return arr[e];
    }
}
