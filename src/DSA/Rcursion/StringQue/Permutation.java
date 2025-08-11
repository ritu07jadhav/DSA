package Rcursion.StringQue;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        sub("",str);
    }
    static void sub(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            sub(f+ch+l,up.substring(1));
        }
    }
}
