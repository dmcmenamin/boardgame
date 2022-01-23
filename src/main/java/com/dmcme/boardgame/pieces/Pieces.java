package com.dmcme.boardgame.pieces;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author: Darren McMenamin
 * @Date: January 23rd 2022
 * Parent Class for Pieces
 * Captures the following:
 *  * Name of Piece
 *  * MinimumNumberOfMoves
 *  * MaximumNumberOfMoves
 *  * Direction That Piece Can Move
 *  * Is the Piece Still on the Board
 */

//@AllArgsConstructor
@Getter
@ToString
public abstract class Pieces {

    private String nameOfPiece;
    private int minimumNumberOfMoves;
    private int maximumNumberOfMoves;
    private String directionThatPieceCanMove;
    private Boolean pieceStillOnBoard;


}
