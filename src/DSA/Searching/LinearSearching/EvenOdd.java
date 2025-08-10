package Searching.LinearSearching;

public class EvenOdd {
    public static void main(String[] args){
        int[] arr={23,55,332,2,5,7,4};
        even(arr);
        odd(arr);
    }
    //    For even numbers finding
    static void even(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" "+"is in even number");
            }
        }
    }
    //    for odd numbers finding
    static void odd(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.println(arr[i]+" "+"is in odd number");
            }
        }
    }

}
