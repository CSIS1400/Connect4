import java.util.Arrays;
public class Board{
   
   char[] rowOne   = {'O', 'O', 'O', 'O', 'O', 'O', 'O'};
   char[] rowTwo   = {'O', 'O', 'O', 'O', 'O', 'O', 'O'};
   char[] rowThree = {'O', 'O', 'O', 'O', 'O', 'O', 'O'};
   char[] rowFour  = {'O', 'O', 'O', 'O', 'O', 'O', 'O'};
   char[] rowFive  = {'O', 'O', 'O', 'O', 'O', 'O', 'O'};
   char[] rowSix   = {'O', 'O', 'O', 'O', 'O', 'O', 'O'};
   
   Player cp = new Player();
   
   public void printBoard() {
      System.out.println(Arrays.toString(rowOne));
      System.out.println(Arrays.toString(rowTwo));
      System.out.println(Arrays.toString(rowThree));
      System.out.println(Arrays.toString(rowFour));
      System.out.println(Arrays.toString(rowFive));
      System.out.println(Arrays.toString(rowSix));
  }
   
   public void columnSelector() {
      cp.decider(); 
      
      switch(cp.playerSelection()) {
         case 1:
            if(rowSix[0] == 'O'){
               rowSix[0] = cp.player;
               break;
            }
            if(rowFive[0] == 'O'){
               rowFive[0] = cp.player;
               break;
            }
            if(rowFour[0] == 'O'){
               rowFour[0] = cp.player;
               break;
            }
            if(rowThree[0] == 'O'){
               rowThree[0] = cp.player;
               break;
            }
            if(rowTwo[0] == 'O'){
               rowTwo[0] = cp.player;
               break;
            }
            if(rowOne[0] == 'O'){
               rowOne[0] = cp.player;
               break;
            } 
            break;
         case 2:
            if(rowSix[1] == 'O'){
               rowSix[1] = cp.player;
               break;
            }
            if(rowFive[1] == 'O'){
               rowFive[1] = cp.player;
               break;
            }
            if(rowFour[1] == 'O'){
               rowFour[1] = cp.player;
               break;
            }
            if(rowThree[1] == 'O'){
               rowThree[1] = cp.player;
               break;
            }
            if(rowTwo[1] == 'O'){
               rowTwo[1] = cp.player;
               break;
            }
            if(rowOne[1] == 'O'){
               rowOne[1] = cp.player;
               break;
            }
            break;
         case 3:
            if(rowSix[2] == 'O'){
               rowSix[2] = cp.player;
               break;
            }
            if(rowFive[2] == 'O'){
               rowFive[2] = cp.player;
               break;
            }
            if(rowFour[2] == 'O'){
               rowFour[2] = cp.player;
               break;
            }
            if(rowThree[2] == 'O'){
               rowThree[2] = cp.player;
               break;
            }
            if(rowTwo[2] == 'O'){
               rowTwo[2] = cp.player;
               break;
            }
            if(rowOne[2] == 'O'){
               rowOne[2] = cp.player;
               break;
            }
            break;
         case 4:
            if(rowSix[3] == 'O'){
               rowSix[3] = cp.player;
               break;
            }
            if(rowFive[3] == 'O'){
               rowFive[3] = cp.player;
               break;
            }
            if(rowFour[3] == 'O'){
               rowFour[3] = cp.player;
               break;
            }
            if(rowThree[3] == 'O'){
               rowThree[3] = cp.player;
               break;
            }
            if(rowTwo[3] == 'O'){
               rowTwo[3] = cp.player;
               break;
            }
            if(rowOne[3] == 'O'){
               rowOne[3] = cp.player;
               break;
            }
            break;
         case 5:
            if(rowSix[4] == 'O'){
               rowSix[4] = cp.player;
               break;
            }
            if(rowFive[4] == 'O'){
               rowFive[4] = cp.player;
               break;
            }
            if(rowFour[4] == 'O'){
               rowFour[4] = cp.player;
               break;
            }
            if(rowThree[4] == 'O'){
               rowThree[4] = cp.player;
               break;
            }
            if(rowTwo[4] == 'O'){
               rowTwo[4] = cp.player;
               break;
            }
            if(rowOne[4] == 'O'){
               rowOne[4] = cp.player;
               break;
            }
            break;
         case 6:
            if(rowSix[5] == 'O'){
               rowSix[5] = cp.player;
               break;
            }
            if(rowFive[5] == 'O'){
               rowFive[5] = cp.player;
               break;
            }
            if(rowFour[5] == 'O'){
               rowFour[5] = cp.player;
               break;
            }
            if(rowThree[5] == 'O'){
               rowThree[5] = cp.player;
               break;
            }
            if(rowTwo[5] == 'O'){
               rowTwo[5] = cp.player;
               break;
            }
            if(rowOne[5] == 'O'){
               rowOne[5] = cp.player;
               break;
            }
            break;
         case 7:
            if(rowSix[6] == 'O'){
               rowSix[6] = cp.player;
               break;
            }
            if(rowFive[6] == 'O'){
               rowFive[6] = cp.player;
               break;
            }
            if(rowFour[6] == 'O'){
               rowFour[6] = cp.player;
               break;
            }
            if(rowThree[6] == 'O'){
               rowThree[6] = cp.player;
               break;
            }
            if(rowTwo[6] == 'O'){
               rowTwo[6] = cp.player;
               break;
            }
            if(rowOne[6] == 'O'){
               rowOne[6] = cp.player;
               break;
            }
            break;
         default:
         
      }
   }
   
   public boolean checkWin(){
      
      
   return true;
   }
      

}
