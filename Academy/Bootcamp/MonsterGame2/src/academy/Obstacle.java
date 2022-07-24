package academy;

import academy.supernatural.Supernatural;
import academy.supernatural.fairies.Fairy;
import academy.supernatural.strikeable.Witch;
import academy.supernatural.strikeable.monsters.Monster;

import static academy.Messages.*;

public class Obstacle {

    Supernatural [] supernaturals = {new Fairy(40), new Witch (30)};

    private int deadObstacles;

    public Obstacle() {
        this.deadObstacles = 0;
    }

    public int attack(){
        Supernatural obstacle = chooseObstacle();
        return obstacle.attack();
    }

    public void defence(int damage) {
        Supernatural supernatural = chooseObstacle();

        if(supernatural == null) {
            return;
        }
        if (supernatural == supernaturals[1]){
            ((Witch) supernaturals[1]).defence(damage);
            return;
        } supernatural = supernaturals[0];
        ((Fairy) supernatural).defence(damage);

        if(!supernatural.isAlive()){
            deadObstacles ++;
            System.out.printf(DEAD_OBSTACELES, deadObstacles);
        }

    }
    private Supernatural chooseObstacle(){
        if (!supernaturals[1].isAlive()){
            Supernatural obstacle = supernaturals[0];
        }

        Supernatural obstacle = supernaturals[RandomGenerator.generateRandom(0, supernaturals.length - 1)];
        if (!obstacle.isAlive()) {
            obstacle=chooseObstacle();
        }

        return obstacle;
    }

    public int checkDeadObstacles() {
        return deadObstacles;
    }
}
