/*
 * Copyright (c) 2016.
 */

package com.crooks;
/**
 * Created by johncrooks on 4/1/16.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    public String[] array;
    String[] playingBoard = new String[]{"1","2","3","4","5","6","7","8","9"};

    // Shows the current state of the playing board in ASCII format
   public void showBoard() {
        System.out.println(" "+  playingBoard[0] +" "+ playingBoard[1] +" "+ playingBoard[2]);
        System.out.println(" "+  playingBoard[3] +" "+   playingBoard[4] +" "+   playingBoard[5]);
        System.out.println(" "+  playingBoard[6] +" "+   playingBoard[7] + " "+  playingBoard[8]);
    }

    // takes players input, checks that the selected position hasn't been picked already and alters the position or tells them to choose again
    public void editBoard(int playerNumber, int value) {
        Scanner scanner = new Scanner(System.in);

        if (playingBoard[value-1] == "X" || playingBoard[value-1] == "O") {
            System.out.println("Sorry that position has already been taken, Please make another choice:\n");
            editBoard(playerNumber, scanner.nextInt());
        } else {
                if (playerNumber == 1) {
                    playingBoard[value - 1] = "X";
                } else {
                    playingBoard[value - 1] = "O";
                }
        }
    }

    //Checks the array for all possible win combinations and responds as necessary
    public boolean checkForWin() {
        boolean winStatus = false;
        if( playingBoard[0].matches(playingBoard[1]) && playingBoard[0].matches(playingBoard[2]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[3].matches(playingBoard[4]) && playingBoard[3].matches(playingBoard[5]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[6].matches(playingBoard[7]) && playingBoard[6].matches(playingBoard[8]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[0].matches(playingBoard[3]) && playingBoard[0].matches(playingBoard[6]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[1].matches(playingBoard[4]) && playingBoard[1].matches(playingBoard[7]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[2].matches(playingBoard[5]) && playingBoard[2].matches(playingBoard[8]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[0].matches(playingBoard[4]) && playingBoard[0].matches(playingBoard[8]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }
        else if( playingBoard[2].matches(playingBoard[4]) && playingBoard[2].matches(playingBoard[6]) ) {
            System.out.println("We have a winner!!");
            winStatus = true;
        }

        else {
           return winStatus;
        }
        return winStatus;
    }

    // resets the board after a game
    public void clear(){;
        playingBoard = new String[]{"1","2","3","4","5","6","7","8","9"};

        System.out.println("resetting the playing board....\n");
        showBoard();

    }
}
