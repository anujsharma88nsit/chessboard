package chessboard.evaluation.classes;

import java.util.ArrayList;
import java.util.List;

import chessboard.evaluation.interfaces.Piece;

public class Rook implements Piece {

	@Override
	public List<String> getAllPossibleNextPositions(int row, int column) {
		List<String> newPositions = new ArrayList<String>();
		
		for(int i=0;i<8;i++) {
			if(i!=row) {
				newPositions.add(i+","+column);
			}
			if(i!=column) {
				newPositions.add(row+","+i);
			}
		}
		return newPositions;
	}
}
