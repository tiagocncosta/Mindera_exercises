package academy.supernatural.fairies;

import academy.supernatural.Supernatural;
import academy.supernatural.strikeable.Strikeable;

import static academy.Messages.UNSTOPABLE;

public class Fairy extends Supernatural implements Strikeable{

    public Fairy(int damage) {
        super(damage);
    }

    @Override
    public  void defence(int damage) {
        setHealthPoints(getHealthPoints());
        System.out.println(UNSTOPABLE);
    }

}
