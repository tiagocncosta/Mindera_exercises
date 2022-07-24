package academy;

import academy.supernatural.Supernatural;
import academy.supernatural.fairies.Fairy;
import academy.supernatural.strikeable.Witch;

import static academy.Messages.WIN;

public class Game {
    private Player player1;
    private Player player2;
    private Obstacle obstacle;
    private boolean finished;

    public Game(Player player1, Player player2, Obstacle obstacle) {
        this.player1 = player1;
        this.player2 = player2;
        this.obstacle = obstacle;
    }
    public void start(int monstersPerPlayer) {

        finished = false;

        player1.pickMonsters(monstersPerPlayer);

        player2.pickMonsters(monstersPerPlayer);

        Player attacker = player1;
        Player defender = player2;

        playRoundUntilWinner(attacker,defender, obstacle);

    }

    private void playRoundUntilWinner(Player attacker, Player defender, Obstacle obstacle) {

        int obstacleApperance = RandomGenerator.generateRandom(0,10);

        if (obstacleApperance == 3){
            obstacleRound(attacker, defender, obstacle);
            playRoundUntilWinner(attacker,defender, obstacle);
            return;
        }


        defender.defence(attacker.attack());

        if (defender.isLost()) {
            System.out.printf(WIN, attacker.getName());
            finished = true;
            return;
        }

        Player temp = attacker;
        attacker = defender;
        defender = temp;
        playRoundUntilWinner(attacker, defender, obstacle);

    }

    public void obstacleRound(Player player1, Player player2, Obstacle obstacle){
        obstacle.defence(player1.attack());
        obstacle.defence(player2.attack());
        player1.defence(obstacle.attack());
        player2.defence(obstacle.attack());
    }

}
