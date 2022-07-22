package academy.supernatural.strikeable.monsters;

public class Mummy extends Monster{
    private int consecutiveAttacks;
    private final int MAX_CONSECUTIVE_HITS =3;
    private final int UNROLL_DAMAGE = 10;

    public Mummy(int damage, MonsterType type) {
        super(damage, type);

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
            System.out.println("Oh no I unrolled and lost 10 health points!!!");
            return unroll();

        }
        return super.attack();
    }

    private int unroll(){
        setHealthPoints(getHealthPoints()-UNROLL_DAMAGE);
        return 0;

    }
}
