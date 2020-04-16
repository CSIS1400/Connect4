public class Connect4Main {

   public static void main(String[] args) {
      
      Player player = new Player();
      Board board = new Board();
      int choice;
      do{
      board.printBoard();
      player.playerInstructions();
      choice = player.playerSelection();
      board.columnSelector(choice);
      }while(choice != -1);
   }
} 