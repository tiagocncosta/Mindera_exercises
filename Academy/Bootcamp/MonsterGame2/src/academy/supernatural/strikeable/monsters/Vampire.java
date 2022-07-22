package academy.supernatural.strikeable.monsters;

public class Vampire extends Monster {

    private final int HEALING_BITE = 5;
    public Vampire(int damage, MonsterType type) {
        super(damage, type);
    }
    @Override
    public int attack(){
        if( Math.random() <= 0.2){
            bite();
        }

        return super.attack();
    }



    private void bite() {
        if(getHealthPoints() + HEALING_BITE >= 100){
            setHealthPoints(100);
            System.out.println("Your Vampire is at full hp, can't get more health");
            return;
        }

        setHealthPoints( getHealthPoints()+ HEALING_BITE);
        System.out.printf("Take a bite, %s has now %d health points %n", type, getHealthPoints());


    }
}
