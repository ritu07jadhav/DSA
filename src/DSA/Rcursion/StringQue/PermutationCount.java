package Rcursion.StringQue;

public class PermutationCount {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(sub("",str));
    }
    static int sub(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int coutn=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
           String l=p.substring(i,p.length());
            coutn=coutn+sub(f+ch+l,up.substring(1));
        }
        return coutn;
    }
}
