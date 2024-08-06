package com.aurionpro.model;

import com.aurionpro.exceptions.CellAlreadyMarkedException;

public class TicTacToe {
    private Board board;
    private MarkType currentPlayer;
    private boolean gameEnded;

    public TicTacToe() {
        board = new Board();
        currentPlayer = MarkType.X;
        gameEnded = false;
    }

    public void makeMove(int index) {
        if (gameEnded) {
            System.out.println("Game has ended. Please restart to play again.");
            return;
        }

        int row = index / 3;
        int col = index % 3;

        try {
            board.setCellMark(row, col, currentPlayer);
            board.display();

            if (board.checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
                return;
            }

            switchPlayer();
        } catch (CellAlreadyMarkedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == MarkType.X) ? MarkType.O : MarkType.X;
    }

    public boolean isGameEnded() {
        return gameEnded;
    }
}


