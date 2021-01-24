package chessboard.evaluation.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chessboard.evaluation.classes.King;
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
				String startingPosition = Utils.transformStartingPosition(strings[1]);
				
				Piece piece = null;
				List<String> nextPossiblePositions = new ArrayList<String>();
				if(PieceType.KING.getValue().equals(pieceInput)) {
					piece = new King();
				}
				/*
				 * else if("Queen".equals(pieceInput)) { piece = new King(); } else
				 * if("Bishop".equals(pieceInput)) { piece = new King(); } else
				 * if("Horse".equals(pieceInput)) { piece = new King(); } else
				 * if("Rook".equals(pieceInput)) { piece = new King(); } else
				 * if("Pawn".equals(pieceInput)) { piece = new King(); }
				 */
				nextPossiblePositions =  piece.getAllPossibleNextPositions(startingPosition);
				String transformedNextPossiblePositions = Utils.transformNextPositions(nextPossiblePositions);
				
				System.out.println(pieceInput + " placed initially at " + strings[1] + ", can move in these positions: " + transformedNextPossiblePositions);
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
