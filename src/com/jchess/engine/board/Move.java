package com.jchess.engine.board;

import com.jchess.engine.pieces.Piece;

public class Move {
	
	final Board board;
	final Piece movedPiece;
	final int destinationCoordinate;
	
	Move (final Board board, final Piece movedPiece, final int destinationCoordinate) {
		this.board = board;
		this.movedPiece = movedPiece;
		this.destinationCoordinate = destinationCoordinate;
	}
	
	public static final class MajorMove extends Move {

		public MajorMove(final Board board, final Piece movedPiece, final int destinationCoordinate) {
			super(board, movedPiece, destinationCoordinate);
		}	
	}
	
	public static final class AttackMove extends Move {
		
		final Piece attackedPiece;

		public AttackMove(final Board board, final Piece movedPiece, final int destinationCoordinate, final Piece attackedPiece) {
			super(board, movedPiece, destinationCoordinate);
			this.attackedPiece = attackedPiece;
		}
		
	}
}
