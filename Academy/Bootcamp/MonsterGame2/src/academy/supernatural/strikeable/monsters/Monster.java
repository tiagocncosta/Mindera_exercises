package academy.supernatural.strikeable.monsters;

import academy.supernatural.Supernatural;
import academy.supernatural.strikeable.Strikeable;

import static academy.Messages.SUPERNATURAL_DEFENCE;

public abstract class Monster extends Supernatural implements Strikeable{
        private MonsterType type;

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
            return;
        }
        health -= damage;
        setHealthPoints(health);
        System.out.printf(SUPERNATURAL_DEFENCE, type, damage, health);

    }

    public MonsterType getType() {
        return type;
    }
}
