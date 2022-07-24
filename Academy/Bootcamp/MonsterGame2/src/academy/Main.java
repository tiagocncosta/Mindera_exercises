package academy;

import academy.supernatural.*;
import academy.supernatural.fairies.Fairy;
import academy.supernatural.strikeable.Witch;
import academy.supernatural.strikeable.monsters.*;
import static academy.supernatural.strikeable.monsters.MonsterType.*;


public class Main {

    public static void main(String[] args) {

       Game game = new Game(new Player("Dan"), new Player("Patrick"), new Obstacle());

        game.start(3);


    }
}
