package academy.supernatural.strikeable.monsters;

import static academy.Messages.VAMPIRE_BITE;

public class Vampire extends Monster {

    private final int HEALING_BITE = 5;
    public Vampire(int damage, MonsterType type) {
        super(20, MonsterType.VAMPIRE);
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
            System.out.printf(VAMPIRE_BITE, getType(), getHealthPoints());
            return;
        }

        setHealthPoints( getHealthPoints()+ HEALING_BITE);
        System.out.printf(VAMPIRE_BITE, getType(), getHealthPoints());


    }
}
