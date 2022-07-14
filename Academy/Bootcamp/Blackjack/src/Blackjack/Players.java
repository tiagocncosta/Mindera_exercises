package Blackjack;

public class Players {
    private int playerPoints;
    private String name;
    private static int numberOfPlayers;

    public Players(String name) {
        this.name = name;
        this.playerPoints = 0;
        numberOfPlayers ++;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public String getName() {
        return name;
    }

    public int drawCard(){
        return (int) (Math.random() * (13-1+1)+1);
    }
    public static void game(Players player1, Players player2) {

        while (player1.playerPoints < 21 || player2.playerPoints < 21){
            int card1 = player1.drawCard();
            player1.playerPoints += card1;
            System.out.println(player1.name + " just draw " + card1 + " points and has " + player1.playerPoints);


            if (player1.playerPoints > 21){
                System.out.println("Oh no " + player1.name + " ,you have " + player1.playerPoints + " points ,you lose and " + player2.name + " wins!");
                break;
            }

            if (player1.playerPoints == 21){
                System.out.printf("Congratulations " + player1.name + " points ,you have reached " + player1.playerPoints +
                        " , you won!");
                break;}

            int card2 = player2 .drawCard();
            player2.playerPoints += card2;
            System.out.println(player2.name + " just draw " + card2 + " points and has " + player2.playerPoints);

            if (player2.playerPoints > 21){
                System.out.println("Oh no " + player2.name + " ,you have " + player2.playerPoints + " points ,you lose and " + player1.name + " wins!");
                break;
            }

            if (player2.playerPoints == 21){
                System.out.printf("Congratulations " + player2.name + " points ,you have reached " + player2.playerPoints +
                        " , you won!");
                break;}
        }
    }
}
