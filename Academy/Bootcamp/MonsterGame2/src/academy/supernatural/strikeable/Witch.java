package academy.supernatural.strikeable;

import academy.supernatural.Supernatural;

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
            System.out.println("I'm dead");
            return;
        }
        health -= halfDamage ;
        setHealthPoints(health);
        System.out.printf(" %s lost %d health points and now has %d. %n",type, halfDamage, health);

    }
}
