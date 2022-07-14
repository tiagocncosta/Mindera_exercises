package rockpaperscissors;

import java.util.Scanner;

public class Main {

    private Main(){
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Rock, Paper, Scissors ");
            System.out.println("How many players ? (one or two)");
            String numberOfPlayers = sc.nextLine().toLowerCase();
            if (numberOfPlayers.equals("two")) {

                System.out.println("What is your name, player1 ?");

                String name1 = sc.nextLine();
                Players player1 = new Players(name1);

                System.out.println("What is your name, player2 ?");
                String name2 = sc.nextLine();
                Players player2 = new Players(name2);

                System.out.println("What is your play " + player1.getName() + " ?");
                while (true) {
                    System.out.println("(rock, paper or scissors)");
                    String play1 = sc.nextLine().toLowerCase();
                    player1.setPlayerMove(play1);
                    if (player1.getPlayerMove().equals("rock") ||
                            player1.getPlayerMove().equals("paper") ||
                            player1.getPlayerMove().equals("scissors")) {
                        break;
                    }
                    System.out.println("Invalid play. Try again.");
                }

                System.out.println("What is your play " + player2.getName() + " ?");

                while (true) {
                    System.out.println("(rock, paper or scissors)");
                    String play2 = sc.nextLine().toLowerCase();
                    player2.setPlayerMove(play2);
                    if (player2.getPlayerMove().equals("rock") ||
                            player2.getPlayerMove().equals("paper") ||
                            player2.getPlayerMove().equals("scissors")) {
                        break;
                    }
                    System.out.println("Invalid play. Try again.");
                }

                twoPlayersGame(player1, player2);
                break;

            }
            if (numberOfPlayers.equals("one")) {
                System.out.println("What is your name, player ?");

                String name1 = sc.nextLine();
                Players player = new Players(name1);

                System.out.println("What is your play " + player.getName() + " ?");
                while (true) {
                    System.out.println("(rock, paper or scissors)");
                    String play1 = sc.nextLine().toLowerCase();
                    player.setPlayerMove(play1);
                    if (player.getPlayerMove().equals("rock") ||
                            player.getPlayerMove().equals("paper") ||
                            player.getPlayerMove().equals("scissors")) {
                        break;
                    }
                    System.out.println("Invalid play. Try again.");
                }

                onePlayerGame(player);
                break;
            }
            System.out.println("Input not valid.");
        }
    }

    public static void twoPlayersGame(Players player1, Players player2){

        if ( player1.getPlayerMove().equals("rock") && player2.getPlayerMove().equals("scissors")){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (player1.getPlayerMove().equals("scissors") && player2.getPlayerMove().equals("paper")){
            System.out.println(player1.getName() + " won!");
            return;
        };

        if (player1.getPlayerMove().equals("paper") && player2.getPlayerMove().equals("rock")){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (player2.getPlayerMove().equals("rock") && player1.getPlayerMove().equals("scissors")){
            System.out.println(player2.getName() + " won!");
            return;
        }
        if (player2.getPlayerMove().equals("scissors") && player1.getPlayerMove().equals("paper")) {
            System.out.println(player2.getName() + " won!");
            return;
        }

        if (player2.getPlayerMove().equals("paper") && player1.getPlayerMove().equals("rock")){
            System.out.println(player2.getName() + " won!");
            return;
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void onePlayerGame(Players player1){

        String[] rps = {"rock", "paper",
                "scissors"};
        String computerMove = rps[(int) Math.floor(Math.random() * rps.length)];
        System.out.println("The computer chose " + computerMove);

        if ( player1.getPlayerMove().equals("rock") && computerMove.equals("scissors")){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (player1.getPlayerMove().equals("scissors") && computerMove.equals("paper")){
            System.out.println(player1.getName() + " won!");
            return;
        };

        if (player1.getPlayerMove().equals("paper") && computerMove.equals("rock")){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (computerMove.equals("rock") && player1.getPlayerMove().equals("scissors")){
            System.out.println("Computer won!");
            return;
        }
        if (computerMove.equals("scissors") && player1.getPlayerMove().equals("paper")) {
            System.out.println("Computer won!");
            return;
        }

        if (computerMove.equals("paper") && player1.getPlayerMove().equals("rock")){
            System.out.println("Computer won!");
            return;
        } else {
            System.out.println("It's a draw!");
        }
    }
}
