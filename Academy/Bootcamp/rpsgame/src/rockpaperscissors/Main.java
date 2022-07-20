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
                    player1.getChoices();
                    String play1 = sc.nextLine().toUpperCase();
                    player1.setPlayerMove(play1);
                    System.out.println(play1);
                    if (player1.getPlayerMove().equals(Choices.ROCK.toString()) ||
                            player1.getPlayerMove().equals(Choices.PAPER.toString()) ||
                            player1.getPlayerMove().equals(Choices.SCISSORS.toString())) {
                        break;
                    }
                    System.out.println("Invalid play. Try again.");
                }

                System.out.println("What is your play " + player2.getName() + " ?");

                while (true) {
                    player2.getChoices();
                    String play2 = sc.nextLine().toUpperCase();
                    player2.setPlayerMove(play2);
                    if (player2.getPlayerMove().equals(Choices.ROCK.toString()) ||
                            player2.getPlayerMove().equals(Choices.PAPER.toString()) ||
                            player2.getPlayerMove().equals(Choices.SCISSORS.toString())) {
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
                    player.getChoices();
                    String play1 = sc.nextLine().toUpperCase();
                    player.setPlayerMove(play1);
                    if (player.getPlayerMove().equals(Choices.ROCK.toString()) ||
                            player.getPlayerMove().equals(Choices.PAPER.toString()) ||
                            player.getPlayerMove().equals(Choices.SCISSORS.toString())) {
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

        if ( player1.getPlayerMove().equals(Choices.ROCK.toString()) && player2.getPlayerMove().equals(Choices.SCISSORS.toString())){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (player1.getPlayerMove().equals(Choices.SCISSORS.toString()) && player2.getPlayerMove().equals(Choices.PAPER.toString())){
            System.out.println(player1.getName() + " won!");
            return;
        };

        if (player1.getPlayerMove().equals(Choices.PAPER.toString()) && player2.getPlayerMove().equals(Choices.ROCK.toString())){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (player2.getPlayerMove().equals(Choices.ROCK.toString()) && player1.getPlayerMove().equals(Choices.SCISSORS.toString())){
            System.out.println(player2.getName() + " won!");
            return;
        }
        if (player2.getPlayerMove().equals(Choices.SCISSORS.toString()) && player1.getPlayerMove().equals(Choices.PAPER.toString())) {
            System.out.println(player2.getName() + " won!");
            return;
        }

        if (player2.getPlayerMove().equals(Choices.PAPER.toString()) && player1.getPlayerMove().equals(Choices.ROCK.toString())){
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

        if ( player1.getPlayerMove().equals(Choices.ROCK.toString()) && computerMove.equals(Choices.SCISSORS.toString())){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (player1.getPlayerMove().equals(Choices.SCISSORS.toString()) && computerMove.equals(Choices.PAPER.toString())){
            System.out.println(player1.getName() + " won!");
            return;
        };

        if (player1.getPlayerMove().equals(Choices.PAPER.toString()) && computerMove.equals(Choices.ROCK.toString())){
            System.out.println(player1.getName() + " won!");
            return;
        }

        if (computerMove.equals(Choices.ROCK.toString()) && player1.getPlayerMove().equals(Choices.SCISSORS.toString())){
            System.out.println("Computer won!");
            return;
        }
        if (computerMove.equals(Choices.SCISSORS.toString()) && player1.getPlayerMove().equals(Choices.PAPER.toString())) {
            System.out.println("Computer won!");
            return;
        }

        if (computerMove.equals(Choices.PAPER.toString()) && player1.getPlayerMove().equals(Choices.ROCK.toString())){
            System.out.println("Computer won!");
            return;
        } else {
            System.out.println("It's a draw!");
        }
    }
}
