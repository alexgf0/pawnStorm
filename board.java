
public class board {
	static pawn[][] mainBoard = new pawn[6][8];

	board() {
		for (int i=0; i<8; i++) {
			mainBoard[0][i] = new pawn(i, 0, 'b');
			mainBoard[5][i] = new pawn(i, 5, 'w');
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
		int initposx = (initpos/10)%10;	System.out.println("initposx: " + initposx);
		int initposy = initpos%10;	System.out.println("initposy: " + initposy);

		if (mainBoard[initposy][initposx] != null) {
			int finalx = (finpos/10)%10; System.out.println("finalx: " + finalx);
			int finaly = finpos%10; System.out.println("finaly: " + finaly);

			if (mainBoard[finaly][finalx] == null) {	//no enemy pawn in finalpos
					if (mainBoard[initposy][initposx].pawnMove(finalx, finaly, false)){
						System.out.println("line 48");
						pawn temp = mainBoard[initposy][initposx];
						mainBoard[initposy][initposx] = null;
						mainBoard[finaly][finalx] = temp;
						return true;
					} else {
						System.out.println("line 51");
						return false;
					}
			} else { //enemy pawn in finalpos
				if (mainBoard[initposy][initposx].pawnMove(initposx, initposy, true))
					return true;
				else
					return false;
			}
		}	else {
			System.out.println("The position choosen has no pawns.");
			return false;
		}
	}

}
