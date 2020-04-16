import java.util.Scanner;
public class Player {

   static Scanner input = new Scanner(System.in);
   static int decider = 0;
   char player = 'R';
   
   public int playerSelection() {
      if(player == 'R'){
         System.out.println("*** Player 1's Turn ***");
         System.out.print("Enter a column number 1-7: ");
      }else{
         System.out.println("*** Player 2's Turn ***");
         System.out.print("Enter a column number 1-7: ");
      }
      int selection = input.nextInt();
      System.out.println();
      while(selection <= 0 || selection >= 8){
         System.out.print("Please Enter A Valid Number 1-9: ");
         selection = input.nextInt();
      }
      return selection;    
   }
   
   public int decider() {
      decider = decider + 1;
      if(decider % 2 == 1){
         player = 'R';
      }else{
         player = 'Y';
      }
      return player;
   }
   
   public static void intro(){
      System.out.println("How To Play:");
      System.out.println("Player1 = X and Player2 = O\n"+
         "Players will take turns choosing a row by selecting a number 1-7\n"+
         "To win, connect four of your pieces either horizontally, vertically, or diagonally\n");
   }


}
