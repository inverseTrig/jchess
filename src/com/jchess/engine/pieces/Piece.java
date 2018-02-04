package com.jchess.engine.pieces;

import java.util.Collection;

import com.jchess.engine.Alliance;
import com.jchess.engine.board.Board;
import com.jchess.engine.board.Move;

public abstract class Piece {

	 protected final int piecePosition;
	 protected final Alliance pieceAlliance;
	 
	 
	 Piece(final int piecePosition, final Alliance pieceAlliance) {
		 this.piecePosition = piecePosition;
		 this.pieceAlliance = pieceAlliance;
	 }
	 
	 public abstract Collection<Move> calculateLegalMoves(final Board board);
	 
	 public Alliance getPieceAlliance() {
		 return this.pieceAlliance;
	 }
}
