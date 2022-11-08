package rocks.zipcodewilmington.tictactoe;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;


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
    public  Boolean findDiag(String xOrO){

        if((xOrO.equals(board[0][0]) && xOrO.equals(board[1][1]) && xOrO.equals(board[2][2])) || (xOrO.equals(board[2][0]) && xOrO.equals(board[1][1]) && xOrO.equals(board[0][2]))){
            return true;
        }
        return false;
    }
    public Boolean findColumn(String x){
        for(int i = 0; i <=3; i++){
            for(int j = 0; j <=3; j++){
                board[i][j] =
            }
        }
    }
}


/* Write some methods for checking a column and row
Check diag as well 0,0 1,1 2,2 OR 2,0 1,1 0,2
{0,0 | 0,1 | 0,2}
{1,0 | 1,1 | 1,2}
{2,0 | 2,1 | 2,2}
 */
