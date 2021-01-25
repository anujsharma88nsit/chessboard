package chessboard.evaluation.factories;

import chessboard.evaluation.classes.Bishop;
import chessboard.evaluation.classes.Horse;
import chessboard.evaluation.classes.King;
import chessboard.evaluation.classes.Pawn;
import chessboard.evaluation.classes.Queen;
import chessboard.evaluation.classes.Rook;
import chessboard.evaluation.enums.PieceType;
import chessboard.evaluation.interfaces.Piece;

public class PieceFactory {
	
	public Piece getPiece(String pieceInput) {
		Piece piece = null;
		
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
		else if(PieceType.HORSE.getValue().equals(pieceInput)) 
		{
			piece = new Horse(); 
		}
		return piece;
	}
}
