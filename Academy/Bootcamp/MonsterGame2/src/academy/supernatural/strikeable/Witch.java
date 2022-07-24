package academy.supernatural.strikeable;

import academy.supernatural.Supernatural;

import static academy.Messages.SUPERNATURAL_DEFENCE;

public class Witch extends Supernatural implements Strikeable {
        public final String type = "Witch";

    public Witch(int damage) {
        super(damage);
    }

    @Override
    public void defence(int damage) {

        int halfDamage = damage / 2;
        int health = getHealthPoints();

        if (health - halfDamage <= 0){
            health = 0;
            setHealthPoints(health);
            die();
            return;
        }
        health -= halfDamage ;
        setHealthPoints(health);
        System.out.printf(SUPERNATURAL_DEFENCE ,type, halfDamage, health);

    }
}
