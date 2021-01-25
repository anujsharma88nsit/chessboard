package chessboard.evaluation.classes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestKing {
	
	King king = new King();
	
	@Test
	public void testGetAllPossibleNextPositions() {
		List<String> allNextPossiblePositions = king.getAllPossibleNextPositions(4,3);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==8);
		assertTrue(allNextPossiblePositions.contains("4,4"));
		assertTrue(allNextPossiblePositions.contains("4,2"));
		assertTrue(allNextPossiblePositions.contains("3,3"));
		assertTrue(allNextPossiblePositions.contains("5,3"));
		assertTrue(allNextPossiblePositions.contains("5,4"));
		assertTrue(allNextPossiblePositions.contains("3,2"));
		assertTrue(allNextPossiblePositions.contains("5,2"));
		assertTrue(allNextPossiblePositions.contains("3,4"));
		assertFalse(allNextPossiblePositions.contains("4,3"));
		assertFalse(allNextPossiblePositions.contains("5,5"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(0,0);
		assertTrue(allNextPossiblePositions.size()==3);
		assertTrue(allNextPossiblePositions.contains("1,0"));
		assertTrue(allNextPossiblePositions.contains("0,1"));
		assertTrue(allNextPossiblePositions.contains("1,1"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(0,7);
		assertTrue(allNextPossiblePositions.size()==3);
		assertTrue(allNextPossiblePositions.contains("0,6"));
		assertTrue(allNextPossiblePositions.contains("1,7"));
		assertTrue(allNextPossiblePositions.contains("1,6"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(7,7);
		assertTrue(allNextPossiblePositions.size()==3);
		assertTrue(allNextPossiblePositions.contains("6,7"));
		assertTrue(allNextPossiblePositions.contains("7,6"));
		assertTrue(allNextPossiblePositions.contains("6,6"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(7,0);
		assertTrue(allNextPossiblePositions.size()==3);
		assertTrue(allNextPossiblePositions.contains("6,0"));
		assertTrue(allNextPossiblePositions.contains("7,1"));
		assertTrue(allNextPossiblePositions.contains("6,1"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(0,3);
		assertTrue(allNextPossiblePositions.size()==5);
		assertTrue(allNextPossiblePositions.contains("0,2"));
		assertTrue(allNextPossiblePositions.contains("0,4"));
		assertTrue(allNextPossiblePositions.contains("1,3"));
		assertTrue(allNextPossiblePositions.contains("1,2"));
		assertTrue(allNextPossiblePositions.contains("1,4"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(4,7);
		assertTrue(allNextPossiblePositions.size()==5);
		assertTrue(allNextPossiblePositions.contains("3,7"));
		assertTrue(allNextPossiblePositions.contains("5,7"));
		assertTrue(allNextPossiblePositions.contains("4,6"));
		assertTrue(allNextPossiblePositions.contains("5,6"));
		assertTrue(allNextPossiblePositions.contains("3,6"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(7,6);
		assertTrue(allNextPossiblePositions.size()==5);
		assertTrue(allNextPossiblePositions.contains("7,7"));
		assertTrue(allNextPossiblePositions.contains("7,5"));
		assertTrue(allNextPossiblePositions.contains("6,6"));
		assertTrue(allNextPossiblePositions.contains("6,5"));
		assertTrue(allNextPossiblePositions.contains("6,7"));
		
		allNextPossiblePositions = king.getAllPossibleNextPositions(5,0);
		assertTrue(allNextPossiblePositions.size()==5);
		assertTrue(allNextPossiblePositions.contains("6,0"));
		assertTrue(allNextPossiblePositions.contains("4,0"));
		assertTrue(allNextPossiblePositions.contains("5,1"));
		assertTrue(allNextPossiblePositions.contains("6,1"));
		assertTrue(allNextPossiblePositions.contains("4,1"));
	}
	
}
