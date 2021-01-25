package chessboard.evaluation.classes;

import java.util.ArrayList;
import java.util.List;

import chessboard.evaluation.interfaces.Piece;

public class Bishop implements Piece{

	@Override
	public List<String> getAllPossibleNextPositions(int row, int column) {
		List<String> newPositions = new ArrayList<String>();
		
		int a = row;
		int b = column;
		while(true) {
			a++;
			b--;
			if(a>7 || b<0) {
				break;
			}
			else {
				newPositions.add(a+","+b);
			}
		}
		
		a = row;
		b = column;
		while(true) {
			a++;
			b++;
			if(a>7 || b>7) {
				break;
			}
			else {
				newPositions.add(a+","+b);
			}
		}
		
		a = row;
		b = column;
		while(true) {
			a--;
			b++;
			if(a<0 || b>7) {
				break;
			}
			else {
				newPositions.add(a+","+b);
			}
		}
		
		a = row;
		b = column;
		while(true) {
			a--;
			b--;
			if(a<0 || b<0) {
				break;
			}
			else {
				newPositions.add(a+","+b);
			}
		}
		return newPositions;
	}
}
