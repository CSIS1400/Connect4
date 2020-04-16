public class Connect4Main {

   public static void main(String[] args) {
      
      Player player = new Player();
      Board board = new Board();
      player.intro();
      do{
      board.printBoard();
      int choice = player.playerSelection();
      board.columnSelector(choice);
      }while(player.playerSelection() != -1);
   }
} 