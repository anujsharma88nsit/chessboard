package chessboard.evaluation.classes;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class TestPawn {
	
	Pawn pawn = new Pawn();
	
	@Test
	public void testGetAllPossibleNextPositions() {
		List<String> allNextPossiblePositions = pawn.getAllPossibleNextPositions(5,5);
		assertTrue(allNextPossiblePositions!=null);
		assertTrue(allNextPossiblePositions.size()==1);
		assertTrue(allNextPossiblePositions.contains("6,5"));
		
		allNextPossiblePositions = pawn.getAllPossibleNextPositions(0,0);
		assertTrue(allNextPossiblePositions.size()==1);
		assertTrue(allNextPossiblePositions.contains("1,0"));
		
		allNextPossiblePositions = pawn.getAllPossibleNextPositions(7,5);
		assertTrue(allNextPossiblePositions.size()==0);
	}

}
