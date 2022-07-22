package academy;

import academy.supernatural.Supernatural;
import academy.supernatural.fairies.Fairy;
import academy.supernatural.strikeable.Witch;

public class Game {
    private Player player1;
    private Player player2;
    private boolean finished;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public void start(int monstersPerPlayer) {
        finished = false;


        player1.pickMonsters(monstersPerPlayer);


        player2.pickMonsters(monstersPerPlayer);



        Player attacker = player1;
        Player defender = player2;

        playRoundUntilWinner(attacker,defender);

    }

    private void playRoundUntilWinner(Player attacker, Player defender) {


        defender.suffer(attacker.attack());

        if (defender.isLost()) {
            System.out.println(attacker.getName() + " wins");
            finished = true;
            return;
        }

        Player temp = attacker;
        attacker = defender;
        defender = temp;
        playRoundUntilWinner(attacker, defender);

    }
    // instance of fairy

    // TODO: 22/07/2022
    public void obstacles(){                        // try too do SwitchCase or a better option //
      int number = (int) Math.random();
                if ( number == 0 ){
                    Supernatural Fairy = new Fairy(5);

                }if (number == 1) {
            Supernatural Witch = new Witch(10);


        }

    }
}
