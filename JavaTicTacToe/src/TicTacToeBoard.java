import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class TicTacToeBoard {
    private final LinkedList<Integer> positions = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    private final String[][] board = {{"|", " ", "1", " ", "|", " ", "2", " ", "|", " ", "3", " ", "|", " "},
                                      {"+", "-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-", "+", "-"},
                                      {"|", " ", "4", " ", "|", " ", "5", " ", "|", " ", "6", " ", "|", " "},
                                      {"+", "-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-", "+", "-"},
                                      {"|", " ", "7", " ", "|", " ", "8", " ", "|", " ", "9", " ", "|", " "}, };

    public void print() {
        System.out.println();
        for (int row = 0; row  < board.length; row++) {
            if (row > 0) {
                System.out.println();
            }
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col]);
            }
        }
        System.out.println();
    }

    public void play(String symbol, int position) {
        switch (position) {
        case 1:
            positions.remove((Integer) 1);
            board[0][2] = symbol;
            break;
        case 2:
            positions.remove((Integer) 2);
            board[0][6] = symbol;
            break;
        case 3:
            positions.remove((Integer) 3);
            board[0][10] = symbol;
            break;
        case 4:
            positions.remove((Integer) 4);
            board[2][2] = symbol;
            break;
        case 5:
            positions.remove((Integer) 5);
            board[2][6] = symbol;
            break;
        case 6:
            positions.remove((Integer) 6);
            board[2][10] = symbol;
            break;
        case 7:
            positions.remove((Integer) 7);
            board[4][2] = symbol;
            break;
        case 8:
            positions.remove((Integer) 8);
            board[4][6] = symbol;
            break;
        case 9:
            positions.remove((Integer) 9);
            board[4][10] = symbol;
            break;
        default:
            System.out.println("Position is not valid.");
        }
    }

    public boolean checkGame(String symbol) {
        if (board[0][2].equals(board[0][6]) && board[0][2].equals(board[0][10])) {
            if (board[0][2].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[2][2].equals(board[2][6]) && board[2][2].equals(board[2][10])) {
            if (board[2][2].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[4][2].equals(board[4][6]) && board[4][2].equals(board[4][10])) {
            if (board[4][2].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[0][2].equals(board[2][2]) && board[0][2].equals(board[4][2])) {
            if (board[0][2].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[0][6].equals(board[2][6]) && board[0][6].equals(board[4][6])) {
            if (board[0][6].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[0][10].equals(board[2][10]) && board[0][10].equals(board[4][10])) {
            if (board[0][10].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[0][2].equals(board[2][6]) && board[0][2].equals(board[4][10])) {
            if (board[0][2].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (board[0][10].equals(board[2][6]) && board[0][10].equals(board[4][2])) {
            if (board[0][10].equals(symbol)) {
                System.out.print("\nYou Won! You Won! You Won!\n\n");
            } else {
                System.out.print("\nHAHAHA YOU SUCK! HAHAHA YOU SUCK! HAHAHA YOU SUCK!\n\n");
            }
            return true;
        } else if (positions.size() == 0) {
            System.out.println("                   .-^-.\n"
                    + "                 .'=^=^='.\n"
                    + "                /=^=^=^=^=\\\n"
                    + "        .-~-.  :^= HAPPY =^;\n"
                    + "      .'~~*~~'.|^ EASTER! ^|\n"
                    + "     /~~*~~~*~~\\^=^=^=^=^=^:\n"
                    + "    :~*~~~*~~~*~;\\.-*))`*-,/\n"
                    + "    |~~~*~~~*~~|/*  ((*   *'.\n"
                    + "    :~*~~~*~~~*|   *))  *   *\\\n"
                    + "     \\~~*~~~*~~| *  ((*   *  /\n"
                    + "      `.~~*~~.' \\  *))  *  .'\n"
                    + "        `~~~`    '-.((*_.-'\n");
            return true;
        } else {
            return false;
        }
    }

    public boolean available(int position) {
        return positions.contains(position);
    }

    public void cpuPlay(String symbol) {
        Random rand = new Random();
        int randomElement = positions.get(rand.nextInt(positions.size()));
        play(symbol, randomElement);
    }

}
