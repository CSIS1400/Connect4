/*****************************************
* Names: Scott Stebbings, Caleb McFalls, *
* Aaron Hansen                           *
* CSIS 1400                              *
* Group assignment Connect 4             *
*                                        *
*****************************************/



import java.util.Arrays;
import java.util.Scanner;

public class Board{
   
   Player player = new Player();
   Scanner input = new Scanner(System.in);

   // multidimensional array for board values
   char[][] boardArray = {{'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'}};
                       
   
   // print method
   public void printBoard(){
      System.out.printf("  1   2   3   4   5   6   7  %n");
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c |%n",boardArray[0][0],boardArray[0][1],boardArray[0][2],
         boardArray[0][3],boardArray[0][4],boardArray[0][5],boardArray[0][6]);
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c |%n",boardArray[1][0],boardArray[1][1],boardArray[1][2],
         boardArray[1][3],boardArray[1][4],boardArray[1][5],boardArray[1][6]);
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c |%n",boardArray[2][0],boardArray[2][1],boardArray[2][2],
         boardArray[2][3],boardArray[2][4],boardArray[2][5],boardArray[2][6]);
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c |%n",boardArray[3][0],boardArray[3][1],boardArray[3][2],
         boardArray[3][3],boardArray[3][4],boardArray[3][5],boardArray[3][6]);
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c |%n",boardArray[4][0],boardArray[4][1],boardArray[4][2],
         boardArray[4][3],boardArray[4][4],boardArray[4][5],boardArray[4][6]);
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c |%n",boardArray[5][0],boardArray[5][1],boardArray[5][2],
         boardArray[5][3],boardArray[5][4],boardArray[5][5],boardArray[5][6]);
      
   }
   
   // places player's piece in column
   public void columnSelector(int column){

      while(boardArray[0][column - 1] != '-'){
         System.out.print("Column is full! Pick another column: ");
         column = input.nextInt();
  
      }
         for (int row = boardArray.length-1; row >= 0; row--){
            if(boardArray[row][column - 1] == '-'){
               boardArray[row][column - 1] = player.decider();
               break;
            }
         
         }
      
   }
   
   public static boolean checkForWin(char[][]board){
      // horizontally
      for (int row = 0; row < board.length; row++){
         for (int col = 0; col < board[row].length - 3; col++){
         if (board[row][col] != '-' && board[row][col] == board[row][col+1] &&
            board[row][col] == board[row][col+2] && board[row][col] == board[row][col+3]){
               return true;
            }      
         }
      }
        // vertical
      for (int col = 0; col < board[0].length; col++){
         for (int row = 0; row < board.length - 3; row++){
            if (board[row][col] != '-' && board[row][col] == board[row+1][col] &&
               board[row][col] == board[row+2][col] && board[row][col] == board[row+3][col]){
                  return true;
         }
      }
   }
         // diagonally from top left
      for (int row = 0; row < board.length - 3; row++){
         for (int col = 0; col < board[row].length - 3; col++){
            if (board[row][col] != '-' && board[row][col] == board[row+1][col
               +1] && board[row][col] == board[row+2][col+2] && board[row][col] ==
                  board[row+3][col+3]){
                     return true;
         }
       }
   }  
         // diagonally from top right
      for (int row = 0; row < board.length - 3; row++){
        for (int col = 3; col < board[row].length; col++){
            if (board[row][col] != '-' && board[row][col] == board[row+1]
               [col-1] && board[row][col] == board[row+2][col-2] && board[row]
                  [col] == board[row+3][col-3]){
                     return true;
            }
         }
     }
      return false;
   }
}

