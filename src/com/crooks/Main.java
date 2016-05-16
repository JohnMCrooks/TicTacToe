package com.crooks;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start Game? (y/n)");
        if (scanner.next().equals("y")) {
            Actions newGame = new Actions();
            newGame.startGame();
        } else {
            System.out.println("Alright, Bye Bye.");
        }
    }
}


