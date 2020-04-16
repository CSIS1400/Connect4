import java.util.Arrays;

public class Board{
   // multidimensional array for board values
   char[][] boardArray = {{'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'},
                          {'-', '-', '-', '-', '-', '-', '-'}};
                       
   
   // print method
   public void printBoard(){
      System.out.printf("| 1 | 2 | 3 | 4 | 5 | 6 | 7 |%n");
      System.out.printf("| %c | %c | %c | %c | %c | %c | %c | ",boardArray[0][0],boardArray[0][1],boardArray[0][2],
         boardArray[0][3],boardArray[0][4],boardArray[0][5],boardArray[0][6]);
   }
   
   // places player's piece in column
   public int columnSelector(int userInput){
      
         
         
       
      
   return 0;
   }
}