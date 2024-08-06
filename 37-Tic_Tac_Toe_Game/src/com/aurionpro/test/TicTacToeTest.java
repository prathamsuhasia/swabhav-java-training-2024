package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.TicTacToe;

import java.util.Scanner;

public class TicTacToeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        while (true) {
            System.out.println("Enter a number (0-8): ");
            int index = scanner.nextInt();
            game.makeMove(index);

            if (game.isGameEnded()) {
                break;
            }
        }
    }
}
