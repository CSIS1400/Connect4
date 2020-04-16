public class Connect4Main {

   public static void main (String[] args) {
      Player player = new Player();  
      Board CB = new Board();
      
      player.intro();
      int num = 0;
      do{
         CB.printBoard();
         CB.columnSelector();
         
      
   }while(num == 0);
   
   }
}
