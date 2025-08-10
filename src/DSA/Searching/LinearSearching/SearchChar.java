package Searching.LinearSearching;

public class SearchChar {
    public static void main(String[] args){
        String name="abcdkefnjh";
        char target='x';
        System.out.println(Search(name,target));
    }
    static int Search(String name,char target){
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}
