/*****************************************
* Names: Scott Stebbings, Caleb McFalls, *
* Aaron Hansen                           *
* CSIS 1400                              *
* Group assignment Connect 4             *
*                                        *
*****************************************/
import java.util.Scanner;
public class Player {

   static Scanner input = new Scanner(System.in);
   static int turn = 0;
   char player = decider();
   
   
   public void playerInstructions() {
      Player playerTurn = new Player();
      if(playerTurn.decider() != 'X'){
         System.out.println("   *X* Player 1's Turn *X*");
         System.out.print("Enter a column number 1-7: ");
      }else{
         System.out.println("   *O* Player 2's Turn *O*");
         System.out.print("Enter a column number 1-7: ");
      }
         
   }
   
   public int playerSelection(){
 int selection = 0;
 boolean isValid = false;
 while(!isValid){
     try {
      selection = input.nextInt();
    } catch (Exception e) {
      input.next();
      selection = 0;
    }
    if( selection <= 7 && selection >= 1 ){
    isValid = true;
  } else {
    System.out.print("Please Enter A Valid Number 1-7: ");
  }
  }
  System.out.println();
  return selection;
}
   public char decider() {
      turn = turn + 1;
      if(turn % 2 == 1){
         player = 'X';
      }else{
         player = 'O';
      }
      return player;
   }
   //fix discription
   public static void intro(){
      System.out.println("How To Play:");
      System.out.println("Player1 = X and Player2 = O\n"+
         "Players will take turns choosing a column by selecting a number 1-7\n"+
         "To win, connect four of your pieces either horizontally, vertically, or diagonally\n");
   }
   
   public void winMessage(){
      if(decider() != 'X'){
         System.out.println("Player 1 is the winner!!!");
      } 
      else{
         System.out.println("Player 2 is the winner!!!");
      }  
      
   }

}
