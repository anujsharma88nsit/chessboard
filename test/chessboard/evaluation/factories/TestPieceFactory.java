package chessboard.evaluation.factories;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chessboard.evaluation.classes.Bishop;
import chessboard.evaluation.classes.Horse;
import chessboard.evaluation.classes.King;
import chessboard.evaluation.classes.Pawn;
import chessboard.evaluation.classes.Queen;
import chessboard.evaluation.classes.Rook;
import chessboard.evaluation.interfaces.Piece;

public class TestPieceFactory {
	
	PieceFactory factory = new PieceFactory();
	
	@Test
	public void testGetPiece() {
		Piece piece = factory.getPiece("Horse");
		assertTrue(piece instanceof Horse);
		
		piece = factory.getPiece("Queen");
		assertTrue(piece instanceof Queen);
		
		piece = factory.getPiece("King");
		assertTrue(piece instanceof King);
		
		piece = factory.getPiece("Bishop");
		assertTrue(piece instanceof Bishop);
		
		piece = factory.getPiece("Rook");
		assertTrue(piece instanceof Rook);
		
		piece = factory.getPiece("Pawn");
		assertTrue(piece instanceof Pawn);
		
		piece = factory.getPiece("HorsE");
		assertFalse(piece instanceof Horse);
		
		piece = factory.getPiece("Tiger");
		assertTrue(null==piece);
		
		piece = factory.getPiece("");
		assertTrue(null==piece);
		
		piece = factory.getPiece(null);
		assertTrue(null==piece);
	}

}
