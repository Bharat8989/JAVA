package Array.TwoDArray;

public class Chess {
        public static void main(String[] args) {
        char[][] board = new char[8][8];

        // Fill board with empty squares (.)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '.';
            }
        }

        // Place a few pieces
        board[0][0] = 'R'; // Rook
        board[0][1] = 'N'; // Knight
        board[0][2] = 'B'; // Bishop
        board[0][3] = 'Q'; // Queen
        board[0][4] = 'K'; // King

        // Print board
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
