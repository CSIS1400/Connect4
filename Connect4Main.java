public class Connect4Main {

   public static void main (String[] args) {
         
      Board CB = new Board();
      int num = 0;
      do{
         CB.printBoard();
         CB.columnSelector();
         
      
   }while(num == 0);
   
   }
}
