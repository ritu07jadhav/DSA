package Rcursion.Maze;

public class MazeWithObstacle {
    public static void main(String[] args){
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeRunWithObst("",board,0,0);

    }
    static void mazeRunWithObst(String P,boolean[][] maze, int r, int c){

        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(P);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            mazeRunWithObst(P+"V",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            mazeRunWithObst(P+"H",maze,r,c+1);
        }
    }
}
