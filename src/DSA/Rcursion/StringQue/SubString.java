package Rcursion.StringQue;

public class SubString {
    public static void main(String[] args) {
        String str="abc";
        sub("",str);
    }
    static void sub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        sub(p+up.charAt(0),up.substring(1));
        sub(p,up.substring(1));
    }
}
