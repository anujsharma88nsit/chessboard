package chessboard.evaluation.classes;

import java.util.ArrayList;
import java.util.List;

import chessboard.evaluation.interfaces.Piece;

public class Queen implements Piece{

	@Override
	public List<String> getAllPossibleNextPositions(int row, int column) {
		List<String> newPositions = new ArrayList<String>();
		
		if(row==0) {
			if(column==0) {
				for(int i=1; i<8; i++) {
					newPositions.add("0,"+i);
					newPositions.add(i+",0");
					newPositions.add(i+","+i);
				}
			}
			else if(column==7) {
				for(int i=6; i>=0; i--) {
					newPositions.add("0,"+i);
					newPositions.add((i+1)+",7");
					newPositions.add((i+1)+","+(6-i));
				}
			}
			else {
				for(int i=0; i<8; i++) {
					if(i!=column) {
						newPositions.add("0,"+i);
					}
					if(i!=0) {
						newPositions.add(i+","+column);
					}
				}
				for(int i=0; i<column; i++) {
					newPositions.add((column-i)+","+i);
				}
				for(int i=1; i<8-column; i++) {
					newPositions.add(i+","+(column+i));
				}
			}
		}
		else if(row==7) {
			if(column==0) {
				for(int i=1; i<8; i++) {
					newPositions.add("7,"+i);
					newPositions.add((i-1)+","+0);
					newPositions.add((i-1)+","+(8-i));
				}
			}
			else if(column==7) {
				for(int i=0; i<7; i++) {
					newPositions.add(i+","+7);
					newPositions.add(7+","+i);
					newPositions.add(i+","+i);
				}
			}
			else {
				for(int i=0; i<8; i++) {
					if(i!=column) {
						newPositions.add(7+","+i);
					}
					if(i!=7) {
						newPositions.add(i+","+column);
					}
				}
				for(int i=0; i<column; i++) {
					newPositions.add((6-i)+","+(column-i-1));
				}
				for(int i=1;i<8-column; i++) {
					newPositions.add((7-i)+","+(column+1));
				}
			}
		}
		else {
			if(column==0) {
				for(int i=0; i<8; i++) {
					if(i!=row) {
						newPositions.add(i+","+0);
					}
					if(i!=0) {
						newPositions.add(row+","+i);
					}
				}
				for(int i=1; i<(8-row); i++) {
					newPositions.add((row+i)+","+i);
				}
				for(int i=1; i<=row; i++) {
					newPositions.add((row-i)+","+i);
				}
			}
			else if(column==7) {
				for(int i=0; i<8; i++) {
					if(i!=row) {
						newPositions.add(i+","+7);
					}
					if(i!=column) {
						newPositions.add(row+","+i);
					}
				}
				for(int i=1; i<(8-row); i++) {
					newPositions.add((row+i)+","+(7-i));
				}
				for(int i=1; i<=row; i++) {
					newPositions.add((row-i)+","+(7-i));
				}
			}
			else {
				for(int i=0; i<8; i++) {
					if(i!=column) {
						newPositions.add(row+","+i);
					}
					if(i!=row) {
						newPositions.add(i+","+column);
					}
				}
				int a = row;
				int b = column;
				while(true) {
					a = a+1;
					b = b+1;
					if(a>7 || b>7) {
						break;
					}
					else {
						newPositions.add(a+","+b);
					}
				}
				
				a=row;
				b=column;
				while(true) {
					a = a-1;
					b = b-1;
					if(a<0 || b<0) {
						break;
					}
					else {
						newPositions.add(a+","+b);
					}
				}
				
				a=row;
				b=column;
				while(true) {
					a = a+1;
					b = b-1;
					if(a>7 || b<0) {
						break;
					}
					else {
						newPositions.add(a+","+b);
					}
				}
				
				a=row;
				b=column;
				while(true) {
					a = a-1;
					b = b+1;
					if(a<0 || b>7) {
						break;
					}
					else {
						newPositions.add(a+","+b);
					}
				}
			}
		}
		return newPositions;
	}
}
