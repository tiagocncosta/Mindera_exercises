package academy.supernatural.strikeable.monsters;

import static academy.Messages.MUMMY_UNROLL;

public class Mummy extends Monster{
    private int consecutiveAttacks;
    private final int MAX_CONSECUTIVE_HITS =3;
    private final int UNROLL_DAMAGE = 10;

    public Mummy(int damage, MonsterType type) {
        super(20, MonsterType.MUMMY);

        this.consecutiveAttacks= 0;
    }

    @Override
    public void defence(int damage) {
        consecutiveAttacks=0;
        super.defence(damage);
    }

    @Override
    public int attack() {
        consecutiveAttacks++;
        if(consecutiveAttacks==MAX_CONSECUTIVE_HITS){
            consecutiveAttacks=0;
            return unroll();

        }
        return super.attack();
    }

    private int unroll(){
        setHealthPoints(getHealthPoints()-UNROLL_DAMAGE);
        System.out.printf(MUMMY_UNROLL, getType(), UNROLL_DAMAGE, getHealthPoints());
        return 0;

    }
}
