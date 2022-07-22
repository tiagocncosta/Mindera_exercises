package academy.supernatural.strikeable.monsters;

import academy.supernatural.Supernatural;
import academy.supernatural.strikeable.Strikeable;

public abstract class Monster extends Supernatural implements Strikeable{
        public MonsterType type;

    public Monster(int damage, MonsterType type) {
        super(damage);
        this.type = type;

    }

    @Override
    public void defence(int damage) {
        int health = getHealthPoints();

        if (health - damage <= 0){
            health = 0;
            setHealthPoints(health);
            die();
            System.out.println("I'm dead");
            return;
        }
        health -= damage;
        setHealthPoints(health);
        System.out.printf("%s lost %d health points and now has %d. %n", type, damage, health);
    }


}
