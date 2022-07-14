package Blackjack;

public class Main {
    public static void main(String[] args) {
        Players player1 = new Players("joao");
        Players player2 = new Players("pedro");

        Players.game(player1, player2);
    }
}
