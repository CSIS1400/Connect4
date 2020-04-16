public class Connect4Main {

   public static void main(String[] args) {
      
      Player player = new Player();
      Board board = new Board();
      do{
      player.intro();
      board.printBoard();
      board.columnSelector(player.playerSelection());
      }while(player.playerSelection() != -1);
   }
} 