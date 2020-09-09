import java.util.Scanner;

public class menu {
  static board myBoard = new board();
  static Scanner myScan = new Scanner(System.in);
  public static void main(String[] args) {
  /*  board.displayBoard(board.mainBoard);
    if (board.boardMovement(board.mainBoard, 00, 10)){
      board.displayBoard(board.mainBoard);
    } else {
      System.out.println("Error.");
    }
    if(board.boardMovement(board.mainBoard, 10, 20)){
      board.displayBoard(board.mainBoard);
    }
    */
    int F, G;
    for (int i=0; i<3; i++){
      G = myScan.nextInt();
      F = myScan.nextInt();
      if(board.boardMovement(board.mainBoard, G, F)) {
        board.displayBoard(board.mainBoard);
      } else {
        System.out.println("Error.");
      }

    }
  }
}
