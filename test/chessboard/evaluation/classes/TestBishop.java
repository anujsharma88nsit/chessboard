package chessboard.evaluation.classes;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestBishop {
	
	Bishop bishop = new Bishop();
	
	@Test
	public void testGetAllPossibleNextPositions() {
		List<String> allNextPossiblePositions = bishop.getAllPossibleNextPositions(5,2);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==11);
		assertTrue(allNextPossiblePositions.contains("6,3"));
		assertTrue(allNextPossiblePositions.contains("7,4"));
		assertTrue(allNextPossiblePositions.contains("4,3"));
		assertTrue(allNextPossiblePositions.contains("3,4"));
		assertTrue(allNextPossiblePositions.contains("2,5"));
		assertTrue(allNextPossiblePositions.contains("1,6"));
		assertTrue(allNextPossiblePositions.contains("0,7"));
		assertTrue(allNextPossiblePositions.contains("4,1"));
		assertTrue(allNextPossiblePositions.contains("3,0"));
		assertTrue(allNextPossiblePositions.contains("6,1"));
		assertTrue(allNextPossiblePositions.contains("7,0"));
		
		allNextPossiblePositions = bishop.getAllPossibleNextPositions(0,0);
		assertTrue(allNextPossiblePositions.size()==7);
		assertTrue(allNextPossiblePositions.contains("1,1"));
		assertTrue(allNextPossiblePositions.contains("2,2"));
		assertTrue(allNextPossiblePositions.contains("3,3"));
		assertTrue(allNextPossiblePositions.contains("4,4"));
		assertTrue(allNextPossiblePositions.contains("5,5"));
		assertTrue(allNextPossiblePositions.contains("6,6"));
		assertTrue(allNextPossiblePositions.contains("7,7"));
		
		allNextPossiblePositions = bishop.getAllPossibleNextPositions(3,7);
		assertTrue(allNextPossiblePositions.size()==7);
		assertTrue(allNextPossiblePositions.contains("2,6"));
		assertTrue(allNextPossiblePositions.contains("1,5"));
		assertTrue(allNextPossiblePositions.contains("0,4"));
		assertTrue(allNextPossiblePositions.contains("4,6"));
		assertTrue(allNextPossiblePositions.contains("5,5"));
		assertTrue(allNextPossiblePositions.contains("6,4"));
		assertTrue(allNextPossiblePositions.contains("7,3"));
	}
}
