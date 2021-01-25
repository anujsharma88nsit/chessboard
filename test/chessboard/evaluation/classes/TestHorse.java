package chessboard.evaluation.classes;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestHorse {
	Horse horse = new Horse();
	
	@Test
	public void testGetAllPossibleNextPositions() {
		List<String> allNextPossiblePositions = horse.getAllPossibleNextPositions(5,2);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==8);
		assertTrue(allNextPossiblePositions.contains("7,3"));
		assertTrue(allNextPossiblePositions.contains("7,1"));
		assertTrue(allNextPossiblePositions.contains("3,3"));
		assertTrue(allNextPossiblePositions.contains("3,1"));
		assertTrue(allNextPossiblePositions.contains("6,4"));
		assertTrue(allNextPossiblePositions.contains("4,4"));
		assertTrue(allNextPossiblePositions.contains("6,0"));
		assertTrue(allNextPossiblePositions.contains("4,0"));
		
		allNextPossiblePositions = horse.getAllPossibleNextPositions(0,0);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==2);
		assertTrue(allNextPossiblePositions.contains("2,1"));
		assertTrue(allNextPossiblePositions.contains("1,2"));
		
		allNextPossiblePositions = horse.getAllPossibleNextPositions(7,4);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==4);
		assertTrue(allNextPossiblePositions.contains("6,2"));
		assertTrue(allNextPossiblePositions.contains("6,6"));
		assertTrue(allNextPossiblePositions.contains("5,3"));
		assertTrue(allNextPossiblePositions.contains("5,5"));
		
		allNextPossiblePositions = horse.getAllPossibleNextPositions(6,5);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==6);
		assertTrue(allNextPossiblePositions.contains("4,6"));
		assertTrue(allNextPossiblePositions.contains("4,4"));
		assertTrue(allNextPossiblePositions.contains("5,3"));
		assertTrue(allNextPossiblePositions.contains("7,3"));
		assertTrue(allNextPossiblePositions.contains("7,7"));
		assertTrue(allNextPossiblePositions.contains("5,7"));
	}
}
