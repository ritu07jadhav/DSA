package Searching.BinarySearching;

public class CeilingForWrapAround {
    public static void main(String[] args){
        char[] letters = {'c', 'f', 'j', 'p'};
        char target= 'f';
        System.out.println(cealing(letters,target));
    }
    static char cealing(char[] arr,char target){
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
        return arr[s%arr.length];
//        For normal around just replace s
    }
}
