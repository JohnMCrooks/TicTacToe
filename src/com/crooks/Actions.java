/*
 * Copyright (c) 2016.
 */

package com.crooks;

import java.util.Scanner;

/**
 * Created by johncrooks on 4/14/16.
 */
public class Actions {

    public void startGame(){

    Scanner scanner = new Scanner(System.in);
    Player playerOne = new Player();
    Player playerTwo = new Player();
    int pCount = 0;
    int moves = 0;

    System.out.println("Player one...");
    playerOne.initiatePlayer();

    System.out.println("Player two...");
    playerTwo.initiatePlayer();

    Board board = new Board();
    board.showBoard();

    while (moves <= 8) {
        if (pCount == 0) {
            board.editBoard(playerOne.getNumber(), scanner.nextInt());
            pCount = 1;
            if (board.checkForWin() == true){
                System.out.println("Congratulations, " + playerOne.playerName + " Wins!!!\n");
                break;
            }
            System.out.println(playerTwo.playerName + " Your Move.");
            moves++;
            board.showBoard();
        } else{
            board.editBoard(playerTwo.getNumber(), scanner.nextInt());
            pCount = 0;
            if (board.checkForWin() == true){
                System.out.println("Congratulations, " + playerTwo.playerName + " Wins!!!\n");
                break;}
            System.out.println(playerOne.playerName + " Your Move.");
            moves++;
            board.showBoard();
        }
    }

    if (moves == 9 && board.checkForWin() == false){
        System.out.println("This game has ended in a tie, you both suck equally!");
    }

    System.out.println("Would you like to play again? (Y/N)");
    String response = scanner.next();
    if (response.equals("y")) {
        board.clear();
        startGame();

    }else{
        System.out.println("well screw you too!");
    }
}
}
