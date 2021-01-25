package chessboard.evaluation.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chessboard.evaluation.classes.Bishop;
import chessboard.evaluation.classes.King;
import chessboard.evaluation.classes.Pawn;
import chessboard.evaluation.classes.Queen;
import chessboard.evaluation.classes.Rook;
import chessboard.evaluation.enums.PieceType;
import chessboard.evaluation.interfaces.Piece;

import static chessboard.evaluation.constants.Constants.*;
import chessboard.evaluation.utils.Utils;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please provide your input");
		System.out.println("Sample input - King D5 (where D is column and 5 is row number)");
		takeInput();
	}

	private static void takeInput() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Input please -> ");
			String input = scanner.nextLine();
			System.out.println("Your Input: " + input);
			if(Utils.isValidInput(input)) {
				String strings[] = input.split(SEPARATOR_SPACE);
				String pieceInput = strings[0];
				int startingRow = Utils.extractStartingRowFromPosition(strings[1]);
				int startingColumn = Utils.extractStartingColumnFromPosition(strings[1]);
				
				Piece piece = null;
				List<String> nextPossiblePositions = new ArrayList<String>();
				if(PieceType.KING.getValue().equals(pieceInput)) {
					piece = new King();
				}
				else if(PieceType.QUEEN.getValue().equals(pieceInput)) 
				{ 
					piece = new Queen(); 
				} 
				else if(PieceType.PAWN.getValue().equals(pieceInput)) 
				{ 
					piece = new Pawn(); 
				}
				else if(PieceType.BISHOP.getValue().equals(pieceInput)) 
				{ 
					piece = new Bishop(); 
				} 
				else if(PieceType.ROOK.getValue().equals(pieceInput)) 
				{ 
					piece = new Rook(); 
				}
				/*else
				 * if("Horse".equals(pieceInput)) { piece = new King(); } else
				 *  else
				 * 
				 */
				nextPossiblePositions =  piece.getAllPossibleNextPositions(startingRow, startingColumn);
				String transformedNextPossiblePositions = Utils.transformNextPositions(nextPossiblePositions);
				
				if(!Utils.isEmpty(transformedNextPossiblePositions)) {
					System.out.println(pieceInput + " placed initially at " + strings[1] + ", can move in these positions: " + transformedNextPossiblePositions);
				}
				else {
					System.out.println(pieceInput + " placed initially at " + strings[1] + ", does not have any next position to move to");
				}
				System.out.println("Do you want to continue? (n and then Enter to exit OR any other key and then Enter to continue)");
				String confirmation = scanner.nextLine();
				if(NO.equals(confirmation)) {
					break;
				}
			}
			else {
				System.out.println("Not a valid input, please try again with valid input");
				System.out.println("Sample input - King D5 (where D is column and 5 is row number)");
				continue;
			}
		}
		scanner.close();
	}
	
}
