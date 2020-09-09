
public class board {
	static pawn[][] mainBoard = new pawn[6][8];

	board() {
		for (int i=0; i<8; i++) {
			mainBoard[0][i] = new pawn(0, i, 'b');
			mainBoard[5][i] = new pawn(5, i, 'w');
		}
	}


	public static void displayBoard(pawn[][] mainBoard) {
		System.out.print("\033[H\033[2J");
		for (int i=0; i<6; i++) {
			for (int j=0; j<8; j++) {
				if (mainBoard[i][j] != null) {
					mainBoard[i][j].displayPawn(mainBoard[i][j].color);
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}


	public static boolean boardMovement(pawn[][] mainBoard, int initpos, int finpos) {
		int initposy = (initpos/10)%10;	System.out.println("initposx: " + initposy);
		int initposx = initpos%10;	System.out.println("initposy: " + initposx);

		if (mainBoard[initposx][initposy] != null) {
			int finaly = (finpos/10)%10; System.out.println("finalx: " + finaly);
			int finalx = finpos%10; System.out.println("finaly: " + finalx);

			if (mainBoard[finalx][finaly] == null) {	//no enemy pawn in finalpos
					if (mainBoard[initposx][initposy].pawnMove(finalx, finaly, false)){
						System.out.println("line 48");
						pawn temp = mainBoard[initposx][initposy];
						mainBoard[initposx][initposy] = null;
						mainBoard[finalx][finaly] = temp;
						//remove(pawn mainBoard[initposx][initposy]);	need to remove somehow the pawn that has moved.
						return true;
					} else {
						System.out.println("line 51");
						return false;
					}
			} else { //enemy pawn in finalpos
				if (mainBoard[initposx][initposy].pawnMove(initposx, initposy, true))
					return true;
				else
					return false;
			}
		}	else {
			return false;
		}
	}

}
