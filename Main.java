//Stage 1/5: stage1
//        Description
//        In this project, you'll write a game called Tic-Tac-Toe that you can play against your computer.
//        The computer will have three levels of difficulty — easy, medium, and hard.
//
//        To begin with, let's write a program that knows how to work with coordinates and determine the
//        state of the game.
//
//        The top-left cell will have the coordinates (1, 1) and the bottom-right cell will have the
//        coordinates (3, 3), as shown in this table:
//
//        (1, 1) (1, 2) (1, 3)
//        (2, 1) (2, 2) (2, 3)
//        (3, 1) (3, 2) (3, 3)
//
//        The program should ask the user to enter the coordinates of the cell where they want to make a move.
//
//        Keep in mind that the first coordinate goes from top to bottom, and the second coordinate goes
//        from left to right. Also, notice that coordinates start with 1 and can be 1, 2, or 3.
//
//        But what if the user attempts to enter invalid coordinates? This could happen if they try to enter
//        letters or symbols instead of numbers, or the coordinates of an already occupied cell. Your program needs to prevent these things from happening by checking the user's input and catching possible exceptions.
//
//        Objectives
//        The program should work in the following way:
//
//        Ask the user to provide the initial state of the 3x3 table with the first input line. This must
//        include nine symbols that can be X, O or _ (the latter represents an empty cell).
//        Output the specified 3x3 table before the user makes a move.
//        Request that the user enters the coordinates of the move they wish to make.
//        The user then inputs two numbers representing the cell in which they wish to place their X or O.
//        The game always starts with X, so the user's move should be made with this symbol if there are
//        an equal number of X's and O's in the table. If the table contains an extra X, the move should be
//        made with O.
//        Analyze the user input and show messages in the following situations:
//        • This cell is occupied! Choose another one! — if the cell is not empty;
//        • You should enter numbers! — if the user tries to enter letters or symbols instead of numbers;
//        • Coordinates should be from 1 to 3! — if the user attempts to enter coordinates outside of the table's range.
//        Display the table again with the user's most recent move included.
//        Output the state of the game.
//        The possible states are:
//
//        Game not finished — when no side has three in a row, but the table still has empty cells;
//        Draw — when no side has three in a row, and the table is complete;
//        X wins — when there are three X's in a row (up, down, across, or diagonally);
//        O wins — when there are three O's in a row (up, down, across, or diagonally).
//        If the user provides invalid coordinates, the program should repeat the request until numbers that
//        represent an empty cell on the table are supplied. You should ensure that the program only outputs the table twice — before the move and after the user makes a legal move.
//
//        Examples
//        The examples below show how your program should work.
//        The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part
//        of the input.
//
//        Example 1:
//
//        Enter the cells: > _XXOO_OX_
//        ---------
//        |   X X |
//        | O O   |
//        | O X   |
//        ---------
//        Enter the coordinates: > 3 1
//        This cell is occupied! Choose another one!
//        Enter the coordinates: > one
//        You should enter numbers!
//        Enter the coordinates: > one three
//        You should enter numbers!
//        Enter the coordinates: > 4 1
//        Coordinates should be from 1 to 3!
//        Enter the coordinates: > 1 1
//        ---------
//        | X X X |
//        | O O   |
//        | O X   |
//        ---------
//        X wins
//        Example 2:
//
//        Enter the cells: > XX_XOXOO_
//        ---------
//        | X X   |
//        | X O X |
//        | O O   |
//        ---------
//        Enter the coordinates: > 3 3
//        ---------
//        | X X   |
//        | X O X |
//        | O O O |
//        ---------
//        O wins
//        Example 3:
//
//        Enter the cells: > XX_XOXOO_
//        ---------
//        | X X   |
//        | X O X |
//        | O O   |
//        ---------
//        Enter the coordinates: > 1 3
//        ---------
//        | X X O |
//        | X O X |
//        | O O   |
//        ---------
//        O wins
//        Example 4:
//
//        Enter the cells: > OX_XOOOXX
//        ---------
//        | O X   |
//        | X O O |
//        | O X X |
//        ---------
//        Enter the coordinates: > 1 3
//        ---------
//        | O X X |
//        | X O O |
//        | O X X |
//        ---------
//        Draw
//        Example 5:
//
//        Enter the cells: >  _XO_OX___
//        ---------
//        |   X O |
//        |   O X |
//        |       |
//        ---------
//        Enter the coordinates: > 3 1
//        ---------
//        |   X O |
//        |   O X |
//        | X     |
////        ---------
////        Game not finished
//
//Stage 3/5: stage3
//        Description
//        It's time to make things more interesting by adding some game variations. What if you want to play
//        against a friend instead of the AI? How about if you get tired of playing the game and want to see
//        a match between two AIs? You also need to give the user the option of going first or second when
//        playing against the AI.
//
//        It should be possible for the user to quit the game after the result is displayed as well.
//
//        Objectives
//        Your tasks for this stage are:
//
//        Write a menu loop, which can interpret two commands: start and exit.
//        Implement the command start. It should take two parameters: who will play X and who will play O.
//        Two options are possible for now: user to play as a human, and easy to play as an AI.
//        The exit command should simply end the program.
//        In later steps, you will add the medium and hard levels.
//
//        Don't forget to handle incorrect input! The message Bad parameters! should be displayed if what
//        the user enters is invalid.
//
//        Example
//        The example below shows how your program should work.
//        The greater-than symbol followed by a space (> ) represents the user input. Note that it's not
//        part of the input.
//
//        Input command: > start
//        Bad parameters!
//        Input command: > start easy
//        Bad parameters!
//        Input command: > start easy easy
//        ---------
//        |       |
//        |       |
//        |       |
//        ---------
//        Making move level "easy"
//        ---------
//        |       |
//        |     X |
//        |       |
//        ---------
//        Making move level "easy"
//        ---------
//        |       |
//        | O   X |
//        |       |
//        ---------
//        Making move level "easy"
//        ---------
//        |       |
//        | O   X |
//        |     X |
//        ---------
//        Making move level "easy"
//        ---------
//        |       |
//        | O   X |
//        |   O X |
//        ---------
//        Making move level "easy"
//        ---------
//        |       |
//        | O X X |
//        |   O X |
//        ---------
//        Making move level "easy"
//        ---------
//        |     O |
//        | O X X |
//        |   O X |
//        ---------
//        Making move level "easy"
//        ---------
//        | X   O |
//        | O X X |
//        |   O X |
//        ---------
//        X wins
//
//        Input command: > start easy user
//        ---------
//        |       |
//        |       |
//        |       |
//        ---------
//        Making move level "easy"
//        ---------
//        |       |
//        |       |
//        |     X |
//        ---------
//        Enter the coordinates: > 2 2
//        ---------
//        |       |
//        |   O   |
//        |     X |
//        ---------
//        Making move level "easy"
//        ---------
//        |   X   |
//        |   O   |
//        |     X |
//        ---------
//        Enter the coordinates: > 3 1
//        ---------
//        |   X   |
//        |   O   |
//        | O   X |
//        ---------
//        Making move level "easy"
//        ---------
//        |   X X |
//        |   O   |
//        | O   X |
//        ---------
//        Enter the coordinates: > 2 3
//        ---------
//        |   X X |
//        |   O O |
//        | O   X |
//        ---------
//        Making move level "easy"
//        ---------
//        | X X X |
//        |   O O |
//        | O   X |
//        ---------
//        X wins
//
//        Input command: > start user user
//        ---------
//        |       |
//        |       |
//        |       |
//        ---------
//        Enter the coordinates: > 3 1
//        ---------
//        |       |
//        |       |
//        | X     |
//        ---------
//        Enter the coordinates: > 2 2
//        ---------
//        |       |
//        |   O   |
//        | X     |
//        ---------
//        Enter the coordinates: > 2 1
//        ---------
//        |       |
//        | X O   |
//        | X     |
//        ---------
//        Enter the coordinates: > 3 2
//        ---------
//        |       |
//        | X O   |
//        | X O   |
//        ---------
//        Enter the coordinates: > 1 1
//        ---------
//        | X     |
//        | X O   |
//        | X O   |
//        ---------
//        X wins
//
//        Input command: > exit
//
//
//Stage 5/5: stage5
//        Description
//        Congratulations, you've almost reached the finish line! To complete the task, it's now time to turn the AI into a strong opponent by adding a hard difficulty level.
//
//        Unlike medium, when the AI is playing at hard level, it doesn't just look one move ahead to see an immediate win or prevent an immediate loss. At this level, it can look two moves ahead, three moves ahead, and even further. It can calculate all possible moves that might be played during the game, and choose the best one based on the assumption that its opponent will also play perfectly. So, it doesn't rely on the mistakes of its opponent and plays the game without fault from start to finish regardless of the opponent's skill!
//
//        The algorithm that implements this is called minimax. It's a brute force algorithm that maximizes the value of the AI's position and minimizes the worth of its opponent's. Minimax is not just for Tic-Tac-Toe. You can use it with any other game where two players make alternate moves, such as chess.
//
//        Objectives
//        In this last stage, you need to implement the hard difficulty level using the minimax algorithm.
//
//        You should also add a hard parameter so that it's possible to play against this level.
//
//        Example
//        The example below shows how your program should work.
//        The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
//
//        Input command: > start hard user
//        Making move level "hard"
//        ---------
//        |       |
//        | X     |
//        |       |
//        ---------
//        Enter the coordinates: > 2 2
//        ---------
//        |       |
//        | X O   |
//        |       |
//        ---------
//        Making move level "hard"
//        ---------
//        |   X   |
//        | X O   |
//        |       |
//        ---------
//        Enter the coordinates: > 3 2
//        ---------
//        |   X   |
//        | X O   |
//        |   O   |
//        ---------
//        Making move level "hard"
//        ---------
//        | X X   |
//        | X O   |
//        |   O   |
//        ---------
//        Enter the coordinates: > 3 1
//        ---------
//        | X X   |
//        | X O   |
//        | O O   |
//        ---------
//        Making move level "hard"
//        ---------
//        | X X X |
//        | X O   |
//        | O O   |
//        ---------
//        X wins
//
//        Input command: > exit

package tictactoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final String[][] FIELD = new String[3][3];
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String START = "start";
    private static final String EXIT = "exit";
    private static final String X = "X";
    private static final String O = "O";
    private static final String[][] EMPTY_FIELD = new String[][]{
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };
    private static final String X_WINS = "X wins";
    private static final String O_WINS = "O wins";
    private static final String DRAW = "Draw";
    private static final String IN_PROGRESS = "Game not finished";
    private static final String IMPOSSIBLE = "Impossible";
    private static final String BAD_PARAMETERS = "Bad parameters!";

    enum PlayerType {USER, EASY, MEDIUM, HARD, UNDEFINED}

    public static void main(String[] args) {
        startGameplay();
    }

    // it would be more efficient and clear if a field was represented as a 1D array

    private static void startGameplay() {
        boolean isStopped = false;
        while (!isStopped) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input command: ");
            String[] inputCommands = scan.nextLine().split(" ");
            PlayerType player1Type = PlayerType.UNDEFINED;
            PlayerType player2Type = PlayerType.UNDEFINED;
            if (inputCommands.length == 1 && !EXIT.equalsIgnoreCase(inputCommands[0])) {
                System.out.println(BAD_PARAMETERS);
                continue;
            } else if (EXIT.equalsIgnoreCase(inputCommands[0])) {
                isStopped = true;
                continue;
            } else if (inputCommands.length < 3 || !START.equalsIgnoreCase(inputCommands[0])) {
                System.out.println(BAD_PARAMETERS);
                continue;
            }
            player1Type = getPlayerType(inputCommands[1]);
            player2Type = getPlayerType(inputCommands[2]);
            if (!PlayerType.UNDEFINED.equals(player1Type) && !PlayerType.UNDEFINED.equals(player2Type)) {
                start(player1Type, player2Type);
            } else {
                System.out.println(BAD_PARAMETERS);
            }
        }
    }

    private static void start(PlayerType x, PlayerType o) {
        setField(EMPTY_FIELD);
        printField(FIELD);
        boolean isFinished = false;
        String sideXO = "";
        while (!isFinished) {
            sideXO = getSideXO(FIELD);
            if (PlayerType.EASY.equals(x)) {
                System.out.println("Making move level \"easy\"");
                makeMoveEasyAI(sideXO, FIELD);
                printField(FIELD);
            } else if (PlayerType.MEDIUM.equals(x)) {
                System.out.println("Making move level \"medium\"");
                makeMoveMediumAI(sideXO, FIELD);
                printField(FIELD);
            } else if (PlayerType.HARD.equals(x)) {
                System.out.println("Making move level \"hard\"");
                makeMoveHardAI(sideXO, FIELD);
                printField(FIELD);
            } else if (PlayerType.USER.equals(x)) {
                makeMove(sideXO, FIELD);
                printField(FIELD);
            }
            isFinished = analyzeGameState(FIELD);
            // switch sides for the next move
            PlayerType temp = x;
            x = o;
            o = temp;
        }
    }

    // choose between user, easy, medium or hard
    private static PlayerType getPlayerType(String input) {
        PlayerType playerType;
        switch (input.toLowerCase()) {
            case "user" -> playerType = PlayerType.USER;
            case "easy" -> playerType = PlayerType.EASY;
            case "medium" -> playerType = PlayerType.MEDIUM;
            case "hard" -> playerType = PlayerType.HARD;
            default -> playerType = PlayerType.UNDEFINED;
        }
        return playerType;
    }

    // true means there are no more turns available
    // because someone's won, or it's a draw, or there is an impossible combination on the field
    private static boolean analyzeGameState(String[][] field) {
        if (isImbalanced(field) || (isWinner(X, field) && isWinner(O, field))) {
            System.out.println(IMPOSSIBLE);
            return true;
        } else if (isWinner(X, field) && !isWinner(O, field)) {
            System.out.println(X_WINS);
            return true;
        } else if (isWinner(O, field) && !isWinner(X, field)) {
            System.out.println(O_WINS);
            return true;
        /*} else if (isInProgress(field)) {
            System.out.println(IN_PROGRESS);
            return false;*/
        } else if (isDraw(field)) {
            System.out.println(DRAW);
            return true;
        }
        return false;
    }

    private static String getGameStatus(String[][] field) {
        if (isImbalanced(field) || (isWinner(X, field) && isWinner(O, field))) {
            return IMPOSSIBLE;
        } else if (isWinner(X, field) && !isWinner(O, field)) {
            return X;
        } else if (isWinner(O, field) && !isWinner(X, field)) {
            return O;
        } else if (isDraw(field)) {
            return DRAW;
        }
        return IN_PROGRESS;
    }

    // populates game field with user input
    // (9 symbols of X, O and _ (underscore) via standard input)
    private static void setField() {
        System.out.print("Enter the cells: ");
        String input = SCANNER.nextLine();
        if (input != null && !input.isEmpty()) {
            input = input.toUpperCase();
            int posSymbol = 0;
            for (int i = 0; i < FIELD.length && posSymbol < input.length(); i++) {
                for (int j = 0; j < FIELD[i].length; j++, posSymbol++) {
                    String symbol = input.substring(posSymbol, posSymbol + 1);
                    FIELD[i][j] = "_".equals(symbol) ? " " : symbol;
                }
            }
        } else {
            for (String[] row : FIELD) {
                Arrays.fill(row, " ");
            }
        }
    }

    // populate game field with values from the field parameter
    private static void setField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                Main.FIELD[i][j] = "_".equals(field[i][j]) ? " " : field[i][j];
            }
        }
    }

    private static void printField(String[][] field) {
        System.out.println("---------");
        for (String[] row : field) {
            System.out.print("| ");
            for (int i = 0; i < row.length; i++) {
                System.out.print(
                        i != row.length - 1 ?
                                row[i] + " " :
                                row[i] + " |"
                );
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    // user's move (manual mode)
    private static void makeMove(String sideXO, String[][] field) {
        boolean isInputValid = false;
        System.out.print("Enter the coordinates: ");
        String token1 = SCANNER.next();
        String token2;
        while (!isInputValid) {
            if (!token1.matches("-*\\d+")) {
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                SCANNER.nextLine();
                token1 = SCANNER.next();
                continue;
            } else {
                token2 = SCANNER.next();
                if (!token2.matches("-*\\d+")) {
                    System.out.println("You should enter numbers!");
                    token1 = SCANNER.next();
                    continue;
                }
            }

            // the top left cell has coordinates (1, 1)
            // the bottom right cell has coordinates (3, 3)
            // hence field[row - 1][col - 1]
            int row = Integer.parseInt(token1);
            int col = Integer.parseInt(token2);
            if (row > 3 || col > 3 || row < 1 || col < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
                System.out.print("Enter the coordinates: ");
                token1 = SCANNER.next();
                continue;
            }

            if (!" ".equals(field[row - 1][col - 1]) && !"_".equals(field[row - 1][col - 1])) {
                System.out.println("This cell is occupied! Choose another one!");
                System.out.print("Enter the coordinates: ");
                token1 = SCANNER.next();
                continue;
            }

            isInputValid = true;
            field[row - 1][col - 1] = sideXO;
        }
    }

    // automatic Easy AI mode
    private static void makeMoveEasyAI(String sideXO, String[][] field) {
        boolean isInputValid = false;
        Random generator = new Random();
        while (!isInputValid && isInProgress(field)) {
            int row = generator.nextInt(3) + 1; // generate a random value between 1 and 3
            int col = generator.nextInt(3) + 1; // generate a random value between 1 and 3
            if (" ".equals(field[row - 1][col - 1]) || "_".equals(field[row - 1][col - 1])) {
                isInputValid = true;
                field[row - 1][col - 1] = sideXO;
            }
        }
    }

    // automatic Medium AI mode
    private static void makeMoveMediumAI(String sideXO, String[][] field) {
        boolean isInputValid = false;
        Random generator = new Random();
//        String[][] fieldCopy = new String[field.length][];
//        for (int i = 0; i < field.length; i++) {
//            fieldCopy[i] = Arrays.copyOf(field[i], field[i].length);
//        }
//        String[][] turned = switchFirstAndLastColumns(transpose(fieldCopy));
        while (!isInputValid && isInProgress(field)) {
            int[] winningCell = getWinningCell(field);
            if (winningCell[0] >= 0) {
                isInputValid = true;
                field[winningCell[0]][winningCell[1]] = sideXO;
            } else {
                int row = generator.nextInt(3); // generate a random value between 0 and 2
                int col = generator.nextInt(3); // generate a random value between 0 and 2
                if (" ".equals(field[row][col]) || "_".equals(field[row][col])) {
                    isInputValid = true;
                    field[row][col] = sideXO;
                }
            }
        }
    }

    // automatic Hard AI mode
    private static void makeMoveHardAI(String sideXO, String[][] field) {
        /*boolean isInputValid = false;
        while (!isInputValid && isInProgress(field)) {
            int[] bestMove = getBestMove(sideXO, field);
            if (bestMove[0] >= 0) {
                isInputValid = true;
                field[bestMove[0]][bestMove[1]] = sideXO;
            }
        }*/
        HardAI hardAI = new HardAI();
        hardAI.makeManeuver(sideXO);
    }

    // find the best move for the hard AI
    private static int[] getBestMove(String sideXO, String[][] field) {
        int bestScore = Integer.MIN_VALUE;
//        final int MAX_DEPTH = 6;
        int[] bestCell = new int[]{-1, -1};
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (" ".equals(field[i][j]) || "_".equals(field[i][j])) {
                    // temporarily store " " or "_" symbol for a blank field
                    // to put it back to the field at the end of the "if" statement
                    String blankField = field[i][j];
                    field[i][j] = sideXO;
                    int score = minimax(sideXO, field, false);
                    // return an empty cell back after the score assessment
                    field[i][j] = blankField;
                    // looking for the best score
                    if (score > bestScore) {
                        bestScore = score;
                        // store the row and column coordinates of the best cell to make a move
                        bestCell[0] = i;
                        bestCell[1] = j;
                    }
                }
            }
        }
        return bestCell;
    }

    // the Minimax algorithm to find the best move
    // (brute force)
    private static int minimax(String sideXO, String[][] field, boolean isMaximizing) {
        int score = evaluateGame(sideXO, field);

        if (score == 10 || score == - 10) {
            return score;
        }

        if (!isInProgress(field)) {
            return 0;
        }

        int best = -1;

        if (isMaximizing) {
            best = Integer.MIN_VALUE;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (" ".equals(field[i][j]) || "_".equals(field[i][j])) {
                        String emptyCell = field[i][j];
                        field[i][j] = sideXO;
                        best = Math.max(best, minimax(sideXO, field, false));
                        field[i][j] = emptyCell;
                    }
                }
            }
        } else {
            best = Integer.MAX_VALUE;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (" ".equals(field[i][j]) || "_".equals(field[i][j])) {
                        String opponent = switchSideXO(sideXO);
                        String emptyCell = field[i][j];
                        field[i][j] = opponent;
                        best = Math.min(best, minimax(opponent, field, true));
                        field[i][j] = emptyCell;
                    }
                }
            }
        }

        return best;
    }

    /*private static int minimax(String sideXO, String[][] field, int depth, boolean isMaximizing) {
        // TODO: rewrite the part below
        // in that manner (see the original):
        //
        // let result = checkWinner();
        //  if (result !== null) {
        //    return scores[result];
        //  }
        //
        // realize checkWinner()
        // TODO: start
        *//*boolean isGameFinished = analyzeGameState(field);
        String opponent = switchSideXO(sideXO);
        if (isGameFinished && isWinner(sideXO, field)) {
            return 10;
        } else if (isGameFinished && isWinner(opponent, field)) { // return -10 if the opponent is the winner
            return -10;
        } else if (isGameFinished) { // return 0 if it's a draw
            return 0;
        }*//*
        // TODO: end

        int finalScore = evaluateGame(sideXO, field);

        if (finalScore == 10 || finalScore == -10) {
            return finalScore;
        }

        if (!isInProgress(field) || depth == 0) {
            return 0;
        }

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (" ".equals(field[i][j]) || "_".equals(field[i][j])) {
                        // temporarily store " " or "_" symbol for a blank field
                        // to put it back to the field at the end of the "if" statement
                        String blankField = field[i][j];
                        field[i][j] = sideXO; // TODO: why it's [i][i] and not [i][j]?
                        int score = minimax(sideXO, field, depth - 1, false);
                        // return an empty cell back after the score assessment
                        field[i][j] = blankField;
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
            return bestScore;
        } else { // if it's the opponent's turn
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (" ".equals(field[i][j]) || "_".equals(field[i][j])) {
                        // temporarily store " " or "_" symbol for a blank field
                        // to put it back to the field at the end of the "if" statement
                        String blankField = field[i][j];
                        field[i][j] = sideXO; // TODO: why it's [i][i] and not [i][j]?
                        int score = minimax(sideXO, field, depth - 1, true);
                        // return an empty cell back after the score assessment
                        field[i][j] = blankField;
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
    }*/

    // return 10 if it's a winning game for a particular player (sideXO)
    // return -10 if it's a winning game for an opponent
    // return 0 if none of the players won
    private static int evaluateGame(String sideXO, String[][] field) {
        String gameStatus = getGameStatus(field);
        if (
                X.equals(sideXO) && X.equals(gameStatus) ||
                O.equals(sideXO) && O.equals(gameStatus)
        ) {
            return 10;
        }

        if (
                X.equals(sideXO) && O.equals(gameStatus) ||
                O.equals(sideXO) && X.equals(gameStatus)
        ) {
            return -10;
        }

        return 0;
    }

    // return cell coordinates from a row / column / diagonal that has 2 X's or 2 O's and an empty cell;
    // return winningCell[0] = -1 otherwise
    private static int[] getWinningCell(String[][] field) {
        int xCount = 0;
        int oCount = 0;
        int emptyCount = 0;
        int[] winningCell = {-1, -1};
        // check rows for a winning cell
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (X.equals(field[i][j])) {
                    xCount++;
                } else if (O.equals(field[i][j])) {
                    oCount++;
                } else {
                    winningCell[0] = i;
                    winningCell[1] = j;
                    emptyCount++;
                }
            }
            if (emptyCount == 1 && (xCount == 2 || oCount == 2)) {
                return winningCell;
            } else {
                xCount = 0;
                oCount = 0;
                emptyCount = 0;
                winningCell[0] = -1;
                winningCell[1] = -1;
            }
        }
        // check columns for a winning cell
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                if (X.equals(field[i][j])) {
                    xCount++;
                } else if (O.equals(field[i][j])) {
                    oCount++;
                } else {
                    winningCell[0] = i;
                    winningCell[1] = j;
                    emptyCount++;
                }
            }
            if (emptyCount == 1 && (xCount == 2 || oCount == 2)) {
                return winningCell;
            } else {
                xCount = 0;
                oCount = 0;
                emptyCount = 0;
                winningCell[0] = -1;
                winningCell[1] = -1;
            }
        }
        // check 1st diagonal for a winning cell
        for (int i = 0; i < 3; i++) {
            if (X.equals(field[i][i])) {
                xCount++;
            } else if (O.equals(field[i][i])) {
                oCount++;
            } else {
                winningCell[0] = i;
                winningCell[1] = i;
                emptyCount++;
            }
        }
        if (emptyCount == 1 && (xCount == 2 || oCount == 2)) {
            return winningCell;
        } else {
            xCount = 0;
            oCount = 0;
            emptyCount = 0;
            winningCell[0] = -1;
            winningCell[1] = -1;
        }
        // check 2nd diagonal for a winning cell
        for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {
            if (X.equals(field[i][j])) {
                xCount++;
            } else if (O.equals(field[i][j])) {
                oCount++;
            } else {
                winningCell[0] = i;
                winningCell[1] = j;
                emptyCount++;
            }
        }
        if (emptyCount == 1 && (xCount == 2 || oCount == 2)) {
            return winningCell;
        } else {
            winningCell[0] = -1;
            winningCell[1] = -1;
            return winningCell;
        }
    }

    // return X or O depending on whose turn to make a move
    private static String getSideXO(String[][] field) {
        int xCount = 0;
        int oCount = 0;
        for (String[] row : field) {
            for (String s : row) {
                if (X.equalsIgnoreCase(s)) {
                    xCount++;
                } else if (O.equalsIgnoreCase(s)) {
                    oCount++;
                }
            }
        }
        return xCount - oCount <= 0 ? X : O;
    }

    private static String switchSideXO(String sideXO) {
        if (X.equals(sideXO)) {
            return O;
        } else {
            return X;
        }
    }

    // transpose a symmetrical matrix
    private static String[][] transpose(String[][] matrix) {
        String[][] transposed = new String[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    // works only for 3 x 3 matrices
    private static String[][] switchFirstAndLastColumns(String[][] matrix) {
        String[][] matrixCopy = new String[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            matrixCopy[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        for (String[] row : matrixCopy) {
            String temp = row[0];
            row[0] = row[matrixCopy.length - 1];
            row[matrixCopy.length - 1] = temp;
        }
        return matrixCopy;
    }

    // translate coordinates of a 3-by-3 matrix element
    // (as if in turned counterclockwise matrix)
    private static int[] translateCoordinates(int[] coordinates) {
        if (coordinates[0] == 0 && coordinates[1] == 0) {
            return new int[]{2, 0};
        } else if (coordinates[0] == 0 && coordinates[1] == 1) {
            return new int[]{1, 0};
        } else if (coordinates[0] == 0 && coordinates[1] == 2) {
            return new int[]{0, 0};
        } else if (coordinates[0] == 1 && coordinates[1] == 0) {
            return new int[]{2, 1};
        } else if (coordinates[0] == 1 && coordinates[1] == 1) {
            return coordinates;
        } else if (coordinates[0] == 1 && coordinates[1] == 2) {
            return new int[]{0, 1};
        } else if (coordinates[0] == 2 && coordinates[1] == 0) {
            return new int[]{2, 2};
        } else if (coordinates[0] == 2 && coordinates[1] == 1) {
            return new int[]{1, 2};
        } else {
            return new int[]{0, 2};
        }
    }

    // checks if there's a winning horizontal streak
    // (to check a vertical streak use transpose(String[][] field) as well as
    // switchFirstAndLastColumns(String[][] field) methods first, which realized in
    // isWinner(String player, String[][] field))
    private static boolean hasHorizontalWin(String sideXO, String[][] field) {
        int matches = 0;
        for (String[] row : field) {
            for (String s : row) {
                if (!sideXO.equalsIgnoreCase(s)) {
                    break;
                } else {
                    matches++;
                }
            }
            if (matches == row.length) {
                return true;
            }
            matches = 0;
        }
        return false;
    }

    // check if there are two in a row horizontally (possibly with a gap)
    // (i.e. minus 1 from the total length of a row)
    // If the return int[] array has elements less than 0,
    // there are no horizontal two's in any row, otherwise there are two in a row
    // elements of the same type, in which case the method outputs coordinates of the empty cell
    // (gap coordinates).
    private static int[] hasHorizontalWinCandidate(String sideXO, String[][] field) {
        int matches = 0;
        int[] gapPosition = {-1, -1};
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (sideXO.equalsIgnoreCase(field[i][j])) {
                    matches++;
                } else if (" ".equals(field[i][j]) || "_".equals(field[i][j])) {
                    gapPosition[0] = i;
                    gapPosition[1] = j;
                }
            }
            // field[i - 1].length - 1 ?
            if (matches == field[i].length - 1) {
                return gapPosition;
            }
            matches = 0;
            gapPosition[0] = -1;
            gapPosition[1] = -1;
        }
        return gapPosition;
    }

    // checks if there's a winning diagonal streak (top left corner to bottom right corner)
    // (to check the opposite diagonal use transpose(String[][] field) as well as
    // switchFirstAndLastColumns(String[][] field) methods first, which realized in
    // isWinner(String player, String[][] field))
    private static boolean hasDiagonalWin(String sideXO, String[][] field) {
        int matches = 0;
        for (int i = 0; i < field.length; i++) {
            if (!sideXO.equalsIgnoreCase(field[i][i])) {
                break;
            } else {
                matches++;
            }
        }
        return matches == field.length;
    }

    // check if a diagonal has two in a row (possibly with a gap)
    // (i.e. minus 1 from the total length of a row)
    // If the return int[] array has elements less than 0,
    // there are no horizontal two's in a field's diagonal, otherwise there are two
    // elements of the same type, in which case the method outputs coordinates of the empty cell
    // (gap coordinates).
    private static int[] hasDiagonalWinCandidate(String sideXO, String[][] field) {
        int matches = 0;
        int[] gapPosition = {-1, -1};
        for (int i = 0; i < field.length; i++) {
            if (sideXO.equalsIgnoreCase(field[i][i])) {
                matches++;
            } else if (" ".equals(field[i][i]) || "_".equals(field[i][i])) {
                gapPosition[0] = i;
                gapPosition[1] = i;
            }
        }
        return matches == field.length - 1 ? gapPosition : new int[]{-1, -1};
    }

    private static boolean hasEmptyCells(String[][] field) {
        for (String[] row : field) {
            for (String s : row) {
                if (" ".equals(s) || "_".equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    // detect if there are a lot more X's than O's or vice versa
    // (if the difference is 2 or more)
    private static boolean isImbalanced(String[][] field) {
        int xCount = 0;
        int oCount = 0;
        for (String[] row : field) {
            for (String s : row) {
                switch (s) {
                    case X -> xCount++;
                    case O -> oCount++;
                }
            }
        }
        return Math.abs(xCount - oCount) > 1;
    }

    // checks if there's a draw in a game (when all the cells are populated, but no winner)
    private static boolean isDraw(String[][] field) {
        return
                !isWinner(X, field) &&
                        !isWinner(O, field) &&
                        !hasEmptyCells(field);
    }

    // checks if there's no winner yet and there are still empty cells on the field
    private static boolean isInProgress(String[][] field) {
        return
                !isWinner(X, field) &&
                        !isWinner(O, field) &&
                        hasEmptyCells(field);
    }

    // checks if either X or O-player has a winning streak on the field
    private static boolean isWinner(String sideXO, String[][] field) {
        String[][] fieldCopy = new String[field.length][];
        for (int i = 0; i < field.length; i++) {
            fieldCopy[i] = Arrays.copyOf(field[i], field[i].length);
        }
        String[][] turned = switchFirstAndLastColumns(transpose(fieldCopy));

        return
                !isImbalanced(field) &&

                        (
                                hasHorizontalWin(sideXO, field) ||
                                        hasDiagonalWin(sideXO, field) ||

                                        hasHorizontalWin(sideXO, turned) ||
                                        hasDiagonalWin(sideXO, turned)
                        );
    }
}