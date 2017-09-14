package com.logan;

import java.util.Scanner;

public class Main {

    public static void GamePiece() {
        Scanner scanner = new Scanner(System.in);
        gamePiece firstPiece = new gamePiece();
        System.out.println("Use Move command to move freeze and unfreeze to freeze or unfreeze your piece and finish when you're done");
        System.out.println("your piece is at 0,0");
        while(true) {

            String userInput = scanner.nextLine();
            if(userInput.equals("move")){
                firstPiece.move();
            }
            if(userInput.equals("freeze")){
                firstPiece.freeze();
                firstPiece.getFrozenStatus();

            }
            if(userInput.equals("unfreeze")){
                firstPiece.unfreeze();
                firstPiece.getFrozenStatus();

            }
            if(userInput.equals("finish")){
                System.out.println("goodbye!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        GamePiece();
    }
}