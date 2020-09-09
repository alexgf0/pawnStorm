public class pawn {
  int posx, posy;
  char color;

  pawn(int posx,int posy,char color ) {
      this.posx = posx;
      this.posy = posy;
      this.color = color;
  }

  public boolean pawnMove(int positx, int posity, boolean isThereEnemyPawn) {//using rn isThereEnemyPawn to create an "eating" mechanisim
    //Check for movements of just one square
      /*if (this.posy - posity !=1 || this.posy - posity != -1){
        System.out.println("line 14");
        return false;
      }*/
      if (this.posx - positx != 0) {  //check for lateral movement (x axis)
        /*if (posx - positx != 1 || posx - positx != -1){
          System.out.println("line 19");
          return false;
        }
        if (!isThereEnemyPawn){
          System.out.println("line 23");
          return false;
        } else {*/
          //not sure how to manage the deletion of the other pawn.
          System.out.println("line 27");
          this.posx = positx;
          this.posy = posity;
          return true;
        //}
      }
       else { //non lateral movement
        if (isThereEnemyPawn) { //checking for pawn obstruction
          System.out.println("line 35");
          return false;
        } else {
          System.out.println("line 38");
          this.posx = positx;
          this.posy = posity;
          return true;
        }
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
