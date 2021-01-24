package chessboard.evaluation.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestUtils {
	
	@Test
	public void testIsEmpty() {
		assertTrue(Utils.isEmpty(null));
		assertTrue(Utils.isEmpty(""));
		assertTrue(Utils.isEmpty(" "));
		assertFalse(Utils.isEmpty("hi"));
	}
	
	@Test
	public void testTransformStartingPosition() {
		assertTrue("4,0".equals(Utils.transformStartingPosition("A5")));
		assertTrue("7,2".equals(Utils.transformStartingPosition("C8")));
		assertFalse("6,4".equals(Utils.transformStartingPosition("D6")));
		assertFalse("1,6".equals(Utils.transformStartingPosition("F1")));
	}
	
	@Test
	public void testTransformNextPositions() {
		List<String> nextPositions = new ArrayList<String>();
		nextPositions.add("4,0");
		nextPositions.add("6,7");
		nextPositions.add("3,1");
		assertTrue("A5, H7, B4".equals(Utils.transformNextPositions(nextPositions)));
		nextPositions.add("2,2");
		assertFalse("A5, H7, B4, C2".equals(Utils.transformNextPositions(nextPositions)));
	}
	
	@Test
	public void testIsValidPiece() {
		assertTrue(Utils.isValidPiece("King"));
		assertTrue(Utils.isValidPiece("Queen"));
		assertFalse(Utils.isValidPiece("Tiger"));
		assertTrue(Utils.isValidPiece("Bishop"));
		assertTrue(Utils.isValidPiece("Pawn"));
		assertTrue(Utils.isValidPiece("Rook"));
		assertTrue(Utils.isValidPiece("Horse"));
		assertFalse(Utils.isValidPiece("HorsE"));
	}
	
	@Test
	public void testIsValidPosition() {
		assertTrue(Utils.isValidPosition("A7"));
		assertTrue(Utils.isValidPosition("C3"));
		assertFalse(Utils.isValidPosition("3C"));
		assertFalse(Utils.isValidPosition("A9"));
	}
	
	@Test
	public void testIsValidInput() {
		assertTrue(Utils.isValidInput("King B5"));
		assertTrue(Utils.isValidInput("Queen C7"));
		assertFalse(Utils.isValidInput("B5 Queen"));
	}

}
