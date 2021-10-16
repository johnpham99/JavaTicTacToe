import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        boolean playAgain = false;
        do {
            boolean gameOver = false;
            TicTacToeBoard game = new TicTacToeBoard();
            System.out.print("Let's play Tic-Tac-Toe!\n");
            game.print();
            System.out.print("\n\nWould you like to be player 1 or 2? ");
            Scanner sc = new Scanner(System.in);
            int player = 0;
            boolean playerValidate = false;
            while (!playerValidate) {
                if (sc.hasNextInt()) {
                    int playerNumber = sc.nextInt();
                    if (playerNumber == 1) {
                        player = 1;
                        playerValidate = true;
                    } else if (playerNumber == 2) {
                        player = 2;
                        playerValidate = true;
                    } else {
                        System.out.print("Enter (1) or (2): ");
                    }
                } else {
                    sc.nextLine();
                    System.out.print("Enter (1) or (2): ");
                }
            }
            boolean positionValidate = false;
            if (player == 1) {
                while (!gameOver) {
                    System.out.print("\nEnter a position number: ");
                    while (!positionValidate) {
                        if (sc.hasNextInt()) {
                            int positionNumber = sc.nextInt();
                            if (game.available(positionNumber)) {
                                game.play("X", positionNumber);
                                positionValidate = true;
                            } else {
                                System.out.print("Enter a valid position: ");
                            }
                        } else {
                            sc.nextLine();
                            System.out.print("Enter a valid position: ");
                        }
                    }
                    positionValidate = false;
                    game.print();
                    gameOver = game.checkGame("X");
                    if (gameOver) {
                        break;
                    }
                    game.cpuPlay("O");
                    System.out.println("\n\nComputer's Turn: ");
                    game.print();
                    gameOver = game.checkGame("X");
                }
            } else {
                while (!gameOver) {
                    game.cpuPlay("X");
                    System.out.println("\n\nComputer's Turn: ");
                    game.print();
                    gameOver = game.checkGame("O");
                    if (gameOver) {
                        break;
                    }
                    System.out.print("\nEnter a position number: ");
                    while (!positionValidate) {
                        if (sc.hasNextInt()) {
                            int positionNumber = sc.nextInt();
                            if (game.available(positionNumber)) {
                                game.play("O", positionNumber);
                                positionValidate = true;
                            } else {
                                System.out.print("Enter a valid position: ");
                            }
                        } else {
                            sc.nextLine();
                            System.out.print("Enter a valid position: ");
                        }
                    }
                    positionValidate = false;
                    game.print();
                    gameOver = game.checkGame("O");
                }
            }
            System.out.println("Do you want to play again? y/n \nHave you found the easter egg yet?");
            boolean replayValidate = false;
            while (!replayValidate) {
                String replay = sc.next();
                if (replay.equalsIgnoreCase("y")) {
                    playAgain = true;
                    replayValidate = true;
                } else if (replay.equalsIgnoreCase("n")) {
                    System.out.println("Okay, bye loser.");
                    playAgain = false;
                    replayValidate = true;
                } else {
                    sc.nextLine();
                    System.out.print("Dude, just type a valid response: ");
                }
            }
        } while (playAgain);
    }
}
