import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    private static Scanner sc = new Scanner(System.in);

    public static void initialiseBoard(){
        for(char[] row : board){
            Arrays.fill(row, '_');
        }
    }

    public static void printBoard(){
        for(char[] row : board){
            for(int i=0; i<row.length; i++){
                System.out.print(row[i]+" ");
            }
            System.out.println();
        }
    }

    public static boolean checkValidMove(int row, int col){
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '_') {
            return true;
        }
        return false;
    }

    public static void makeMove(int row, int col){
        board[row][col] = currentPlayer;
    }

    public static void switchPlayer(){
        currentPlayer = (currentPlayer=='X')? 'O' : 'X' ;
    }

    public static boolean checkBoardFull(){
        for(char[] row : board){
            for(char x : row){
                if(x=='_')return false;
            }
        }
        return true;
    }

    public static boolean checkWinner(){
        //check diagonals :
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        //check rows and column combination : 
        for(int i=0; i<3; i++){
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) || 
            (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        initialiseBoard();
        boolean isGameOver = false;

        while(!isGameOver){
            System.out.println("Player " + (currentPlayer=='X'? "1 (X)":"2 (O)") + ", enter your move (row and column): " ); //Example : Player 1 (X), enter your move (row and column): 0 1

            int row = sc.nextInt();
            int col = sc.nextInt();

            if(checkValidMove(row, col)){
                makeMove(row, col);
                printBoard();

                if(checkWinner()){
                    System.out.println("Congratulations, Player " + (currentPlayer=='X'? "1 (X)":"2 (O)") + " wins!"); // Congratulations, Player 1 (X) wins!
                    isGameOver = true;
                }
                else if (checkBoardFull()) {
                    System.out.println("Board is full. Draw!");
                    isGameOver = true;
                }
                else{
                    switchPlayer();
                }              

            }
            else{
                System.out.println("Invalid coordinates . Try again");
            }
        }

    }

}