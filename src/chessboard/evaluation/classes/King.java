package chessboard.evaluation.classes;

import java.util.ArrayList;
import java.util.List;

import chessboard.evaluation.interfaces.Piece;

public class King implements Piece{

	@Override
	public List<String> getAllPossibleNextPositions(int row, int column) {
		List<String> newPositions = new ArrayList<String>();
		
		if(row==0) {
			if(column==0) {
				newPositions.add("0,1");
				newPositions.add("1,0");
				newPositions.add("1,1");
			}
			else if(column==7) {
				newPositions.add("0,6");
				newPositions.add("1,7");
				newPositions.add("1,6");
			}
			else {
				newPositions.add("0,"+(column-1));
				newPositions.add("0,"+(column+1));
				newPositions.add("1,"+(column-1));
				newPositions.add("1,"+(column+1));
				newPositions.add("1,"+column);
			}
		}
		else if(row==7) {
			if(column==0) {
				newPositions.add("7,1");
				newPositions.add("6,0");
				newPositions.add("6,1");
			}
			else if(column==7) {
				newPositions.add("7,6");
				newPositions.add("6,7");
				newPositions.add("6,6");
			}
			else {
				newPositions.add("7,"+(column-1));
				newPositions.add("7,"+(column+1));
				newPositions.add("6,"+(column-1));
				newPositions.add("6,"+(column+1));
				newPositions.add("6,"+column);
			}
		}
		else {
			if(column==0) {
				newPositions.add(row+","+(column+1));
				newPositions.add((row-1)+","+column);
				newPositions.add((row+1)+","+column);
				newPositions.add((row-1)+","+(column+1));
				newPositions.add((row+1)+","+(column+1));
			}
			else if(column==7) {
				newPositions.add(row+","+(column-1));
				newPositions.add((row-1)+","+column);
				newPositions.add((row+1)+","+column);
				newPositions.add((row-1)+","+(column-1));
				newPositions.add((row+1)+","+(column-1));
			}
			else {
				newPositions.add(row+","+(column+1));
				newPositions.add(row+","+(column-1));
				newPositions.add((row+1)+","+column);
				newPositions.add((row-1)+","+column);
				newPositions.add((row+1)+","+(column+1));
				newPositions.add((row+1)+","+(column-1));
				newPositions.add((row-1)+","+(column+1));
				newPositions.add((row-1)+","+(column-1));
			}
		}
		return newPositions;
	}
}
