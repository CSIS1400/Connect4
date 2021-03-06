/*****************************************
* Names: Scott Stebbings, Caleb McFalls, *
* Aaron Hansen                           *
* CSIS 1400                              *
* Group assignment Connect 4             *
*                                        *
*****************************************/
public class Connect4Main {

   public static void main(String[] args) {
      
      Player player = new Player();
      Board board = new Board();
      player.intro();
      int choice;
      do{
      board.printBoard();
      player.playerInstructions();
      choice = player.playerSelection();
      board.columnSelector(choice);
      }while(board.win == false && board.checkTie() != true);
      if(board.win == true){
         board.printBoard();
         player.winMessage();
      }else{
         board.printBoard();
         board.checkTie();
         System.out.println("It's a tie!");
      }
      
   }
} 