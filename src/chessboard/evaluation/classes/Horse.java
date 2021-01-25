package chessboard.evaluation.classes;

import java.util.ArrayList;
import java.util.List;

import chessboard.evaluation.interfaces.Piece;

public class Horse implements Piece {

	@Override
	public List<String> getAllPossibleNextPositions(int row, int column) {
		List<String> newPositions = new ArrayList<String>();
		
		if(row+2 < 8) {
			if(column+1 < 8) {
				newPositions.add((row+2)+","+(column+1));
			}
			if(column-1 > -1) {
				newPositions.add((row+2)+","+(column-1));
			}
		}
		
		if(row-2 > -1) {
			if(column+1 < 8) {
				newPositions.add((row-2)+","+(column+1));
			}
			if(column-1 > -1) {
				newPositions.add((row-2)+","+(column-1));
			}
		}
		
		if(column+2 < 8) {
			if(row+1 < 8) {
				newPositions.add((row+1)+","+(column+2));
			}
			if(row-1 > -1) {
				newPositions.add((row-1)+","+(column+2));
			}
		}
		
		if(column-2 > -1) {
			if(row+1 < 8) {
				newPositions.add((row+1)+","+(column-2));
			}
			if(row-1 > -1) {
				newPositions.add((row-1)+","+(column-2));
			}
		}
		return newPositions;
	}
}
