package com.dmcme.boardgame.pieces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiecesTest {

    Pieces piece;

    @BeforeEach
    void setUp() {
        piece = new Pieces("King", 1, 1,"Any",
                true, "A1","Black");
    }

    @Test
    @DisplayName("Verify Name of Piece")
    void getNameOfPiece() {
        assertEquals("King", piece.getNameOfPiece());
        assertNotEquals("Checker", piece.getNameOfPiece());
    }

    @Test
    @DisplayName("Verify Minimum Number of Moves")
    void getMinimumNumberOfMoves() {
        assertEquals(1, piece.getMinimumNumberOfMoves());
        assertNotEquals(15, piece.getMinimumNumberOfMoves());
    }

    @Test
    @DisplayName("Verify Maximum Number of Moves")
    void getMaximumNumberOfMoves() {
        assertEquals(1, piece.getMaximumNumberOfMoves());
        assertNotEquals(12, piece.getMaximumNumberOfMoves());
    }

    @Test
    @DisplayName("Verify Direction that Pieces Can Move")
    void getDirectionThatPieceCanMove() {
        assertEquals("Any", piece.getDirectionThatPieceCanMove());
        assertNotEquals("Diagonal", piece.getDirectionThatPieceCanMove());
    }

    @Test
    @DisplayName("Verify If Piece is Still onBoard")
    void getPieceStillOnBoard() {
        assertEquals(true, piece.getPieceStillOnBoard());
        assertNotEquals(false, piece.getPieceStillOnBoard());
    }

    @Test
    @DisplayName("Verify Position on Board")
    void getPositionOnBoard() {
        assertEquals("A1", piece.getPositionOnBoard());
        assertNotEquals("B1", piece.getPositionOnBoard());
    }

    @Test
    @DisplayName("Verify Colour")
    void getColour() {
        assertEquals("Black", piece.getColour());
        assertNotEquals("White", piece.getColour());
    }

    @Test
    void testToString() {
        String outputString = "Pieces(nameOfPiece=King, minimumNumberOfMoves=1, maximumNumberOfMoves=1, " +
                "directionThatPieceCanMove=Any, pieceStillOnBoard=true, positionOnBoard=A1, colour=Black)";
        assertEquals(outputString, piece.toString());
        assertNotEquals("InvalidValue", piece.toString());
    }
}