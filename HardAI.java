package tictactoe;

import java.util.Random;

public class HardAI {

    String playerSymbol;
    String opponentSymbol;
    static int depth = 0;

    public void makeManeuver(String sideXO) {
        if ("O".equals(sideXO)) {
            this.playerSymbol = "O";
            this.opponentSymbol = "X";
        } else {
            this.playerSymbol = "X";
            this.opponentSymbol = "O";
        }

        if (depth == 0) {
            Random random = new Random();

            int row = random.nextInt(3);
            int column = random.nextInt(3);

            Main.FIELD[row][column] = sideXO;
            depth++;
        } else {
            Move nextMove = findBestMove();
            Main.FIELD[nextMove.row][nextMove.column] = sideXO;
            depth++;
        }
    }

    static class Move {
        int row;
        int column;

        Move() {
            row = -1;
            column = -1;
        }
    }

    int evaluateGrid() {
        if ((Main.FIELD[0][0].equals(playerSymbol) && Main.FIELD[0][1].equals(playerSymbol) && Main.FIELD[0][2].equals(playerSymbol)) ||
                (Main.FIELD[1][0].equals(playerSymbol) && Main.FIELD[1][1].equals(playerSymbol) && Main.FIELD[1][2].equals(playerSymbol)) ||
                (Main.FIELD[2][0].equals(playerSymbol) && Main.FIELD[2][1].equals(playerSymbol) && Main.FIELD[2][2].equals(playerSymbol)) ||
                (Main.FIELD[0][0].equals(playerSymbol) && Main.FIELD[1][0].equals(playerSymbol) && Main.FIELD[2][0].equals(playerSymbol)) ||
                (Main.FIELD[0][1].equals(playerSymbol) && Main.FIELD[1][1].equals(playerSymbol) && Main.FIELD[2][1].equals(playerSymbol)) ||
                (Main.FIELD[0][2].equals(playerSymbol) && Main.FIELD[1][2].equals(playerSymbol) && Main.FIELD[2][2].equals(playerSymbol)) ||
                (Main.FIELD[0][0].equals(playerSymbol) && Main.FIELD[1][1].equals(playerSymbol) && Main.FIELD[2][2].equals(playerSymbol)) ||
                (Main.FIELD[0][2].equals(playerSymbol) && Main.FIELD[1][1].equals(playerSymbol) && Main.FIELD[2][0].equals(playerSymbol))) {
            return 10;
        } else if ((Main.FIELD[0][0].equals(opponentSymbol) && Main.FIELD[0][1].equals(opponentSymbol) && Main.FIELD[0][2].equals(opponentSymbol)) ||
                (Main.FIELD[1][0].equals(opponentSymbol) && Main.FIELD[1][1].equals(opponentSymbol) && Main.FIELD[1][2].equals(opponentSymbol)) ||
                (Main.FIELD[2][0].equals(opponentSymbol) && Main.FIELD[2][1].equals(opponentSymbol) && Main.FIELD[2][2].equals(opponentSymbol)) ||
                (Main.FIELD[0][0].equals(opponentSymbol) && Main.FIELD[1][0].equals(opponentSymbol) && Main.FIELD[2][0].equals(opponentSymbol)) ||
                (Main.FIELD[0][1].equals(opponentSymbol) && Main.FIELD[1][1].equals(opponentSymbol) && Main.FIELD[2][1].equals(opponentSymbol)) ||
                (Main.FIELD[0][2].equals(opponentSymbol) && Main.FIELD[1][2].equals(opponentSymbol) && Main.FIELD[2][2].equals(opponentSymbol)) ||
                (Main.FIELD[0][0].equals(opponentSymbol) && Main.FIELD[1][1].equals(opponentSymbol) && Main.FIELD[2][2].equals(opponentSymbol)) ||
                (Main.FIELD[0][2].equals(opponentSymbol) && Main.FIELD[1][1].equals(opponentSymbol) && Main.FIELD[2][0].equals(opponentSymbol))) {
            return -10;
        }
        return 0;
    }

    Move findBestMove() {
        int bestValue = Integer.MIN_VALUE;
        Move bestMove = new Move();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(Main.FIELD[i][j]) || "_".equals(Main.FIELD[i][j])) {
                    String emptyCellSymbol = Main.FIELD[i][j];
                    Main.FIELD[i][j] = playerSymbol;
                    int moveValue = minimax(false);
                    Main.FIELD[i][j] = emptyCellSymbol;

                    if (moveValue > bestValue) {
                        bestMove.row = i;
                        bestMove.column = j;
                        bestValue = moveValue;
                    }
                }
            }
        }
        return bestMove;
    }

    int minimax(boolean isMax) {
        int score = evaluateGrid();

        if (score == 10 || score == -10) {
            return score;
        }

        if (!isMoveLeft()) {
            return 0;
        }

        int best = -1;

        if (isMax) {
            best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (" ".equals(Main.FIELD[i][j]) || "_".equals(Main.FIELD[i][j])) {
                        String emptyCellSymbol = Main.FIELD[i][j];
                        Main.FIELD[i][j] = playerSymbol;
                        best = Math.max(best, minimax(false));
                        Main.FIELD[i][j] = emptyCellSymbol;
                    }
                }
            }
        }

        if (!isMax) {
            best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (" ".equals(Main.FIELD[i][j]) || "_".equals(Main.FIELD[i][j])) {
                        String emptyCellSymbol = Main.FIELD[i][j];
                        Main.FIELD[i][j] = opponentSymbol;
                        best = Math.min(best, minimax(true));
                        Main.FIELD[i][j] = emptyCellSymbol;
                    }
                }
            }
        }
        return best;
    }

    boolean isMoveLeft() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(Main.FIELD[i][j]) || "_".equals(Main.FIELD[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
