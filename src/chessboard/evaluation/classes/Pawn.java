package chessboard.evaluation.classes;

import java.util.ArrayList;
import java.util.List;

import chessboard.evaluation.interfaces.Piece;

public class Pawn implements Piece{

	@Override
	public List<String> getAllPossibleNextPositions(int row, int column) {
		List<String> newPositions = new ArrayList<String>();
		
		if(row!=7) {
			newPositions.add((row+1)+","+column);
		}
		
		return newPositions;
	}
}
