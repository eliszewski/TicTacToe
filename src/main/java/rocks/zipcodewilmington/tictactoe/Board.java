package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] board;
    public String winner;
    public boolean xWin;
    public boolean oWin;
    public boolean Tie;

    public Board(Character[][] matrix) {
        this.board = matrix;

    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }
    public  Boolean findDiag(Character xOrO){

        if((xOrO.equals(board[0][0]) && xOrO.equals(board[1][1]) && xOrO.equals(board[2][2])) || (xOrO.equals(board[2][0]) && xOrO.equals(board[1][1]) && xOrO.equals(board[0][2]))){
            return true;
        }
        return false;
    }
    public Boolean findColumn(Character xo){
        int matchDet = 0;
        int c = 0;
        for(int i = 0; i <= board[0].length; i++){
            for(int j = i;j <=board[0].length; j++){
                if(board[j][i].equals(xo){

                }
            }
        }
        return null;
    }
}


/* Write some methods for checking a column and row
Check diag as well 0,0 1,1 2,2 OR 2,0 1,1 0,2
{0,0 | 0,1 | 0,2}
{1,0 | 1,1 | 1,2}
{2,0 | 2,1 | 2,2}
 */
