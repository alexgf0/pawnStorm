public class pawn {
  int posx, posy;
  char color;

  pawn(int posx,int posy,char color ) {
      this.posx = posx;
      this.posy = posy;
      this.color = color;
  }

  public boolean pawnMove(int posx, int posy, boolean isThereEnemyPawn) {//using rn isThereEnemyPawn to create an "eating" mechanisim

    if ((this.posy-posy) ==1 || (this.posy-posy) == -1){   //Check if the movement is of one square

      if ((this.posx-posx) == 0) {  //check for lateral movement (x axis)
        if (!isThereEnemyPawn) { //checking for vertical pawn obstruction
          this.posx = posx;
          this.posy = posy;
          return true;
        } else {
          System.out.println("You cannot advance, there is a pawn there.");
          return false;
        }
      } else { // lateral movement
        if (((this.posx-posx) == 1 || (this.posx-posx) == -1) && isThereEnemyPawn){
          //eating mechanisism
          this.posx = posx;
          this.posy = posy;
          return true;
        } else { //lateral movement but no pawn there
          System.out.println("There is no enemy pawn there to capture");
          return false;
        }

      }
    } else {
      System.out.println("You can only advance one space at a time.");
      return false;
    }
  }
  
  public static void displayPawn(char color) {
     if(color == 'b') {
        System.out.print("\u2659 ");
      } else if (color == 'w') {
        System.out.print("\u265F ");
      } else {
        System.out.print("0 ");
      }
  }

}
