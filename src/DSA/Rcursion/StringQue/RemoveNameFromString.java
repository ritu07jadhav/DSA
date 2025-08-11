package Rcursion.StringQue;

public class RemoveNameFromString {
    public static void main(String[] args) {
        String str="This is a app which we are going to launch";
        remove("",str);
    }
    static void remove(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.startsWith("app")){
            remove(p,up.substring(3));
        }else {
            remove(p+up.charAt(0),up.substring(1));
        }
    }
}
