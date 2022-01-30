package com.dmcme.boardgame.board;

import java.util.HashMap;
import java.util.Map;

public class BoardSquare {

    private String xCoordinate;
    private String yCoordinate;
    private boolean occupied;
    private String pieceName;

    private Map<String, String> boardSquare = new HashMap<>();

    BoardSquare(String xCoordinate, String yCoordinate, String pieceName) {
        this.boardSquare.put("X-Coordinate", xCoordinate);
        this.boardSquare.put("Y-Coordinate", yCoordinate);
        if(pieceName.equals(null) || pieceName.equals("")) {
            this.occupied = false;
            this.pieceName = pieceName;
        }
        else {
            this.pieceName = pieceName;
            this.occupied = true;
        }
    }


    public boolean returnPieceOnSquare(String xCoordinate, String yCoordinate) {
        if ((xCoordinate.equals(this.boardSquare.get("X-Coordinate"))) &&
                ((yCoordinate.equals(this.boardSquare.get("Y-Coordinate"))))) {
            return this.boardSquare.get()
        }
    }



}
