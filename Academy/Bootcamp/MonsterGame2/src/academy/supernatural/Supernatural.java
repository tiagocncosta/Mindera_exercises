package academy.supernatural;

import static academy.Messages.MONSTER_DYING;

public abstract class Supernatural {


    private int healthPoints;
    private int damage;
    private boolean isAlive;

    public Supernatural(int damage) {
        this.damage = damage;
        this.healthPoints= 100;
        this.isAlive = true;
    }

    public int attack() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints){
        this.healthPoints= healthPoints;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void die(){
        if (isAlive == false){
            return;
        }
        if(healthPoints==0){
            System.out.println(MONSTER_DYING);
            isAlive=false;
        }
    }


}
