package Rcursion.Maze;
import java.util.*;

public class MazeWithDiagonal {
    public static void main(String[] args){
        mazeRun(" ",3,3);
        System.out.println(mazeRun(" ",3,3));
    }
    static ArrayList mazeRun(String P,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(mazeRun(P+"V",r-1,c));
        }

        if(c>1){
            list.addAll(mazeRun(P+"H",r,c-1));
        }

        if(r>1 && c>1){
            list.addAll(mazeRun(P+"D",r-1,c-1));
        }
        return list;
    }
}