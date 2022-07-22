package academy;

import academy.supernatural.*;
import academy.supernatural.fairies.Fairy;
import academy.supernatural.strikeable.Witch;
import academy.supernatural.strikeable.monsters.*;


public class Main {

    public static void main(String[] args) {

        Game game = new Game(new Player("Dan"), new Player("Patrick"));

        game.start(3);
        game.start(8);
        game.start(2);
        game.start(3);
        Supernatural g = new Fairy(1);
        //   MonstersFactory.create(MonsterType.MUMMY).attack(new Player("Dan").suffer(););



    }
}
