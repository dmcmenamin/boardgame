package com.dmcme.boardgame.pieces;

//import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
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
 *  * It's co-ordinates on the board
 *  * It's Colour
 */

//@AllArgsConstructor
@Getter
@ToString
@AllArgsConstructor
public class Pieces {

    private String nameOfPiece;
    private int minimumNumberOfMoves;
    private int maximumNumberOfMoves;
    private String directionThatPieceCanMove;
    private Boolean pieceStillOnBoard;
    private String positionOnBoard;
    private String colour;


}
