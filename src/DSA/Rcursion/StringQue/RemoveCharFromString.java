package Rcursion.StringQue;

public class RemoveCharFromString {
    public static void main(String[] args) {
      String str="This is a app which we are going to launch";
      remove("",str);
    }
    static void remove(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
          remove(p,up.substring(1));
        }else {
            remove(p+ch,up.substring(1));
        }
    }
}
