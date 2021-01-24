package chessboard.evaluation.enums;

public enum PieceType {
	KING("King"),
	QUEEN("Queen"),
	BISHOP("Bishop"),
	HORSE("Horse"),
	ROOK("Rook"),
	PAWN("Pawn");
	
	private String value;
	
	PieceType(String value) {
		this.value=value;
	}	
	
	public String getValue() {
		return this.value;
	}
}
