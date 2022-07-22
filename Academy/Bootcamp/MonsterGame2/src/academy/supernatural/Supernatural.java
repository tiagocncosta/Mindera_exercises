package academy.supernatural;

public abstract class Supernatural {


    private int healthPoints;
    private int damage;
    private boolean isAlive;

    public Supernatural(int damage) {
        this.damage = damage;
        this.healthPoints= 100;
        this.isAlive= true;
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


    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void die(){
        if(healthPoints==0){
            isAlive=false;
        }
    }


}
