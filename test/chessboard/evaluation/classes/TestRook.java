package chessboard.evaluation.classes;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestRook {
	
	Rook rook = new Rook();
	
	@Test
	public void testGetAllPossibleNextPositions() {
		List<String> allNextPossiblePositions = rook.getAllPossibleNextPositions(5,2);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==14);
		assertTrue(allNextPossiblePositions.contains("6,2"));
		assertTrue(allNextPossiblePositions.contains("7,2"));
		assertTrue(allNextPossiblePositions.contains("5,3"));
		assertTrue(allNextPossiblePositions.contains("5,4"));
		assertTrue(allNextPossiblePositions.contains("5,5"));
		assertTrue(allNextPossiblePositions.contains("5,6"));
		assertTrue(allNextPossiblePositions.contains("5,7"));
		assertTrue(allNextPossiblePositions.contains("4,2"));
		assertTrue(allNextPossiblePositions.contains("3,2"));
		assertTrue(allNextPossiblePositions.contains("2,2"));
		assertTrue(allNextPossiblePositions.contains("1,2"));
		assertTrue(allNextPossiblePositions.contains("0,2"));
		assertTrue(allNextPossiblePositions.contains("5,1"));
		assertTrue(allNextPossiblePositions.contains("5,0"));
		
		allNextPossiblePositions = rook.getAllPossibleNextPositions(7,7);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==14);
		assertTrue(allNextPossiblePositions.contains("7,6"));
		assertTrue(allNextPossiblePositions.contains("7,5"));
		assertTrue(allNextPossiblePositions.contains("7,4"));
		assertTrue(allNextPossiblePositions.contains("7,3"));
		assertTrue(allNextPossiblePositions.contains("7,2"));
		assertTrue(allNextPossiblePositions.contains("7,1"));
		assertTrue(allNextPossiblePositions.contains("7,0"));
		assertTrue(allNextPossiblePositions.contains("6,7"));
		assertTrue(allNextPossiblePositions.contains("5,7"));
		assertTrue(allNextPossiblePositions.contains("4,7"));
		assertTrue(allNextPossiblePositions.contains("3,7"));
		assertTrue(allNextPossiblePositions.contains("2,7"));
		assertTrue(allNextPossiblePositions.contains("1,7"));
		assertTrue(allNextPossiblePositions.contains("0,7"));
		
		allNextPossiblePositions = rook.getAllPossibleNextPositions(3,0);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==14);
		assertTrue(allNextPossiblePositions.contains("0,0"));
		assertTrue(allNextPossiblePositions.contains("1,0"));
		assertTrue(allNextPossiblePositions.contains("2,0"));
		assertTrue(allNextPossiblePositions.contains("4,0"));
		assertTrue(allNextPossiblePositions.contains("5,0"));
		assertTrue(allNextPossiblePositions.contains("6,0"));
		assertTrue(allNextPossiblePositions.contains("7,0"));
		assertTrue(allNextPossiblePositions.contains("3,1"));
		assertTrue(allNextPossiblePositions.contains("3,2"));
		assertTrue(allNextPossiblePositions.contains("3,3"));
		assertTrue(allNextPossiblePositions.contains("3,4"));
		assertTrue(allNextPossiblePositions.contains("3,5"));
		assertTrue(allNextPossiblePositions.contains("3,6"));
		assertTrue(allNextPossiblePositions.contains("3,7"));
	}
}
