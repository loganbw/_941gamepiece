package com.logan;

import java.util.Random;

public class gamePiece {
    private boolean frozen;
    private int postionX;
    private int postionY;
    private String pieceColor;
    private String pieceName;
    Random rng = new Random();

    public void getFrozenStatus(){
        System.out.println("is your piece frozen? " + frozen);
    }

    public gamePiece() {

        postionX = 0;
        postionY = 0;
        frozen = false;
    }
    public void move(){
        if(!frozen){
             postionX = rng.nextInt(100) + 1;
             postionY = rng.nextInt(500) + 1;
            System.out.println("moved to " + postionX + "," + postionY);
        }else {
            System.out.println("Cannot move game piece is frozen!");
        }
    }
    public void freeze(){
        frozen = true;
    }
    public void unfreeze(){
        frozen = false;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public int getPostionX() {
        return postionX;
    }

    public int getPostionY() {
        return postionY;
    }

    public String getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(String pieceColor) {
        this.pieceColor = pieceColor;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }
}
