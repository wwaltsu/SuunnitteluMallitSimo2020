package com.company;

import java.util.Scanner;

public class RPS extends Game {
    static Scanner input = new Scanner(System.in);
    String rps[] = {"ROCK", "PAPER", "SCISSORS"};
    int score1;
    int score2;
    boolean stop = false;
    @Override
    void initializeGame() {
        System.out.println("Pelaajat valitsevat vuorotellen");
        System.out.println("VALITSE ROCK[0], PAPER[1], SCISSORS[2]");
    }
    @Override
    void makePlay(int player) {
        endOfGame();
        System.out.println("PLAYER 1: Enter choice");
        int player1 = input.nextInt();  // Reads player1 user input
        System.out.println("PLAYER 2: Enter choice");
        int player2 = input.nextInt();  // Reads player2 user input
        int algorithm = (3 + player1 - player2) % 3;
        if (algorithm == 1) {
            System.out.print("Player1 wins " + rps[player2] + " WITH " + rps[player1]);
            score1++;
        } else if (algorithm == 2) {
            System.out.println("Player1 wins " + rps[player1] + " WITH " + rps[player2]);
            score2++;
        } else if (algorithm == 0) {
            System.out.println("TIE WITH " + rps[player1]);
        }
        System.out.println("PLAYER2 SCORE:[" + score1 + "]");
        System.out.println("PLAYER2 SCORE:[" + score2 + "]");
    }

    @Override
    boolean endOfGame() {
        if (score1 == 3 || score2 == 3) {
            return true;
        }
        return false;
    }
    @Override
    void printWinner() {
        if(score2 > score1) System.out.print("PLAYER2 wins");
        else {
            System.out.print("PLAYER1 wins");
        }

    }
}
