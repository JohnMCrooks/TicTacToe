/*
 * Copyright (c) 2016.
 */

package com.crooks;

import com.sun.tools.javah.Util;

import java.util.Scanner;

/**
 * Created by johncrooks on 4/14/16.
 */
public class Actions {

    public void startGame(){

    Scanner scanner = new Scanner(System.in);

    Player playerOne = new Player();
    Player playerTwo = new Player();

    int pCount = 0;                         // Declaring variable for tracking players turn
    int moves = 0;                          // Declaring variable for Total moves made

    System.out.println("Player one...");    //initializing players
    playerOne.initiatePlayer();

    System.out.println("Player two...");    //initializing players
    playerTwo.initiatePlayer();

    Board board = new Board();              // initializing the board array
    board.showBoard();                      // Showing initial unused board

    while (moves <= 8) {                     //tic tac toe can only have 9 moves in a game so this is the  obvious max move count
        if (pCount == 0) {                   //I'm using an alternating variable to keep track of which players turn it is and assign the proper symbol to the board
            board.editBoard(playerOne.getNumber(), scanner.nextInt());  //get number refers to player number (1 or 2), scanner in is the players "move"
            pCount = 1;                      // After the player moves, we flip the variable so on the next pass the other player will go.

            if (board.checkForWin()){        // Checking for the win requirements, occurs after every move
                System.out.println("Congratulations, " + playerOne.playerName + " Wins!!!\n");
                break;                       //If a win event occurs we break out of the while loop early
            }

            System.out.println(playerTwo.playerName + " Your Move.");  //Announce the next players turn
            moves++;                         // Increment the move count
            board.showBoard();               // Show the new board with the last players move added to it
        }

        else{                                // This is the same process as above but with player two
            board.editBoard(playerTwo.getNumber(), scanner.nextInt());
            pCount = 0;
            if (board.checkForWin()){
                System.out.println("Congratulations, " + playerTwo.playerName + " Wins!!!\n");
                break;}
            System.out.println(playerOne.playerName + " Your Move.");
            moves++;
            board.showBoard();
        }
    }
                                            // In the event of a tie after 9 moves Print message
    if (moves == 9 && board.checkForWin() == false){
        System.out.println("This game has ended in a tie, you both suck equally!");
    }

    System.out.println("Would you like to play again? (Y/N)");   // Offer to restart the game
    String response = scanner.next();       //awaiting user input
    if (response.equals("y")) {
        board.clear();                      //resets the board array
        startGame();                        //Restarts the game

    }else{
        System.out.println("well screw you too!");
    }
}
}
