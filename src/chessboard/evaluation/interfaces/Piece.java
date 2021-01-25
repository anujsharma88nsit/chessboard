package chessboard.evaluation.interfaces;

import java.util.List;

public interface Piece {
	List<String> getAllPossibleNextPositions(int row, int column);
}
