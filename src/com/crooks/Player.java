/*
 * Copyright (c) 2016.
 */

package com.crooks;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;
/**
 * Created by johncrooks on 4/1/16.
 */
public class Player {
    public String playerName;
    public int number;
    public int test = 0;

    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumber() {return number;}

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTest(int x){
        this.test = x;
    }

    public void initiatePlayer(){
        Scanner scanner = new Scanner(System.in);

        // Get users name
        System.out.println("What is your name? \n");
        setPlayerName(scanner.next());

        // Assign Player number
//        System.out.println("Are you player 1 or 2? \n");
//        setNumber(scanner.nextInt());

//TODO Figure out how to not allow the second instance to use the same player number as the first...


    }

}
