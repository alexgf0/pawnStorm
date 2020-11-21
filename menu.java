import java.util.Scanner;

public class menu {
  static board myBoard = new board();
  static Scanner myScan = new Scanner(System.in);
  public static void main(String[] args) {
    board.displayBoard(board.mainBoard);
    System.out.println("To move enter the initial position xy, press Enter and enter the final position x'y'.");
    System.out.println("E.g. 30 (Enter) 31 (Enter)");
    System.out.println("To exit enter 404 in the input.");
    int F=0, G=0;
    while (F!=404 || G != 404){
      G = myScan.nextInt();
      F = myScan.nextInt();
      if(board.boardMovement(board.mainBoard, G, F)) {
        board.displayBoard(board.mainBoard);
      } else if (F == 404 || F == 404) {
        System.out.println("Goodbye sir.");
        return;
      }else {
        System.out.println("Error.");
      }
    }
  }
}
