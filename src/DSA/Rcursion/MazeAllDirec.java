package Rcursion;

public class MazeAllDirec {
    public static void main(String[] args){
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        MazeAllDirec("",board,0,0);
    }
    static void MazeAllDirec(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c== maze[r].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;

        if(r<maze.length-1){
            MazeAllDirec(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            MazeAllDirec(p+"R",maze,r,c+1);
        }
        if(r>0){
            MazeAllDirec(p+"U",maze,r-1,c);
        }
        if(c>0){
            MazeAllDirec(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }
}
