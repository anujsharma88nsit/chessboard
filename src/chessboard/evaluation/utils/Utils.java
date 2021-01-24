package chessboard.evaluation.utils;

import static chessboard.evaluation.constants.Constants.*;

import java.util.List;

import chessboard.evaluation.enums.PieceType;

public class Utils {
	
	public static String transformStartingPosition(String position) {
		char rowNumber = position.charAt(1);
		int transformedRowNumber = rowNumber - 49;
		
		char columnNumber = position.charAt(0);
		int transformedColumnNumber = columnNumber - 65;
		
		return transformedRowNumber + COMMA + transformedColumnNumber;
	}

	public static boolean isValidInput(String input) {
		if(isEmpty(input)) {
			return false;
		}
		
		String[] strings = input.split(SEPARATOR_SPACE);
		if(strings.length!=2) {
			return false;
		}
		else {
			return isValidPiece(strings[0]) && isValidPosition(strings[1]);
		}
	}

	public static boolean isEmpty(String input) {
		if(input==null || input.trim().isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isValidPosition(String position) {
		if(isEmpty(position)) {
			return false;
		}
		if(position.length()!=2) {
			return false;
		}
		char col = position.charAt(0);
		char row = position.charAt(1);
		
		if(!(col >= 65 && col <= 72)) {
			return false;
		}
		if(!(row >= 48 && row <= 55)) {
			return false;
		}
		
		return true;
	}

	public static boolean isValidPiece(String pieceString) {
		if(isEmpty(pieceString)) {
			return false;
		}
		boolean isValidPiece = false;
		for(PieceType piece: PieceType.values()) {
			if(piece.getValue().equals(pieceString)) {
				isValidPiece = true;
				break;
			}
		}
		return isValidPiece;
	}
	
	public static String transformNextPositions(List<String> nextPositions) {
		StringBuilder nextPositionsString = new StringBuilder("");
		for(String nextPosition: nextPositions) {
			String[] strings = nextPosition.split(SEPARATOR_COMMA);
			int row = Integer.parseInt(strings[0]);
			int column = Integer.parseInt(strings[1]);
			
			char transformedRow = (char)(row + 49);
			char transformedColumn = (char)(column + 65);
			
			nextPositionsString.append(transformedColumn).append(transformedRow)
				.append(COMMA).append(SPACE);
		}
		
		return nextPositionsString.toString().substring(0, nextPositionsString.length()-2);
	}
}
