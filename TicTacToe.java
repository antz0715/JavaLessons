import java.util.Scanner;

public class TicTacToe {
    private static final char[] PLAYERS = {'X', 'O'};
    private static final char EMPTY = '-';
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();

        int currentPlayer = 0;  // Player 1 starts with 'X'
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();
            boolean validMove = false;

            while (!validMove) {
                System.out.println("Player " + (currentPlayer + 1) + " (" + PLAYERS[currentPlayer] + ") turn:");
                System.out.print("Enter row (1-3): ");
                int row = scanner.nextInt() - 1;
                System.out.print("Enter column (1-3): ");
                int col = scanner.nextInt() - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
                    board[row][col] = PLAYERS[currentPlayer];
                    validMove = true;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            gameEnded = checkForWin() || checkForDraw();
            currentPlayer = (currentPlayer + 1) % 2;  // Switch player
        }

        printBoard();  // Print the final state of the board
        if (checkForWin()) {
            System.out.println("Player " + (currentPlayer == 0 ? 2 : 1) + " (" + PLAYERS[currentPlayer == 0 ? 1 : 0] + ") wins!");
        } else {
            System.out.println("The game is a draw.");
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkForWin() {
        // Check horizontal and vertical lines
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;  // Horizontal win
            }
            if (board[0][i] != EMPTY && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;  // Vertical win
            }
        }

        // Check diagonals
        if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;  // Diagonal from top-left to bottom-right
        }
        if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;  // Diagonal from top-right to bottom-left
        }

        return false;
    }

    private static boolean checkForDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;  // There's still an empty spot
                }
            }
        }
        return true;  // No empty spots and no win, it's a draw
    }
}
